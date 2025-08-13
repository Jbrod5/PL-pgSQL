package org.jbrod.application.ui;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Panel con TreeView (izq) y TabPane (der). Pasa un Path raíz al constructor.
 */
public class EditorPanel extends BorderPane {

    private final TreeView<Path> treeView = new TreeView<>();
    private final TabPane tabPane = new TabPane();
    private final Map<Path, Tab> openTabs = new HashMap<>();



    public EditorPanel(Path rootPath) {
        setPrefSize(1000, 700);
        setPadding(new Insets(6));

        // Construir árbol (simple y directo; para carpetas grandes usar Task)
        TreeItem<Path> rootItem = buildTree(rootPath);
        rootItem.setExpanded(true);
        treeView.setRoot(rootItem);
        treeView.setShowRoot(true);

        // Mostrar sólo el nombre (no la ruta completa)
        treeView.setCellFactory(tv -> new TreeCell<>() {
            @Override
            protected void updateItem(Path item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText(item.getFileName().toString());
                }
            }
        });

        // Evento: doble clic para abrir archivos
        treeView.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
                TreeItem<Path> sel = treeView.getSelectionModel().getSelectedItem();
                if (sel != null && Files.isRegularFile(sel.getValue())) {
                    openFileInTab(sel.getValue());
                }
            }
        });


        // Layout: dejar TreeView a la izquierda y TabPane al centro/derecha
        // Ajustes de tamaño
        treeView.setPrefWidth(300);
        setLeft(treeView);
        setRight(tabPane);
        BorderPane.setMargin(treeView, new Insets(4));
        BorderPane.setMargin(tabPane, new Insets(4));
    }

    // Construye recursivamente TreeItem desde un Path
    private TreeItem<Path> buildTree(Path root) {
        TreeItem<Path> item = new TreeItem<>(root);
        if (Files.isDirectory(root)) {
            try (DirectoryStream<Path> ds = Files.newDirectoryStream(root)) {
                for (Path child : ds) {
                    item.getChildren().add(buildTree(child));
                }
            } catch (IOException e) {
                // Si hay error leyendo una carpeta, podemos ignorarla o mostrar un nodo de error
                System.err.println("Error listando " + root + ": " + e.getMessage());
            }
        }
        return item;
    }









    // Abre el archivo en una pestaña (si ya está abierta, la selecciona)
    private void openFileInTab(Path file) {
        try {
            Path canonical = file.toRealPath(); // normaliza path con enlaces simbólicos
            if (openTabs.containsKey(canonical)) {
                tabPane.getSelectionModel().select(openTabs.get(canonical));
                return;
            }

            String content = Files.readString(canonical);

            TextArea textArea = new TextArea(content);
            textArea.setFont(Font.font("Monospaced"));
            textArea.setWrapText(false);

            Button btnSave = new Button("Guardar");
            Button btnRun = new Button("Ejecutar");
            HBox controls = new HBox(8, btnSave, btnRun);
            controls.setPadding(new Insets(4));

            VBox vbox = new VBox(6, controls, textArea);
            VBox.setVgrow(textArea, Priority.ALWAYS);

            Tab tab = new Tab(canonical.getFileName().toString(), vbox);
            tab.setUserData(canonical);
            tabPane.getTabs().add(tab);
            tabPane.getSelectionModel().select(tab);
            openTabs.put(canonical, tab);

            // Listener para marcar cambios (añadir '*' si hay modificaciones)
            textArea.textProperty().addListener((obs, oldV, newV) -> {
                if (!tab.getText().endsWith("*")) {
                    tab.setText(tab.getText() + "*");
                }
            });

            // Guardar
            btnSave.setOnAction(ev -> {
                try {
                    Files.writeString(canonical, textArea.getText(), StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);
                    // quitar marca de cambios del título
                    String title = canonical.getFileName().toString();
                    tab.setText(title);
                    showInfo("Guardado", "Archivo guardado: " + canonical);
                } catch (IOException ex) {
                    showError("Error al guardar", ex.getMessage());
                }
            });

            // Ejecutar (placeholder)
            btnRun.setOnAction(ev -> {
                // Aquí conectarás tu intérprete; por ahora mostramos mensaje y print
                showInfo("Ejecutar", "Ejecutando: " + canonical.getFileName());
                System.out.println("Ejecutar archivo: " + canonical);
                System.out.println(textArea.getText());
            });

            // Cuando se cierra la pestaña, remover del mapa
            tab.setOnCloseRequest(ev -> openTabs.remove(canonical));

        } catch (IOException e) {
            showError("Error al abrir archivo", e.getMessage());
        }
    }

    // Helpers para alertas (ejecutadas en FX thread)
    private void showInfo(String title, String text) {
        Platform.runLater(() -> {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle(title);
            a.setHeaderText(null);
            a.setContentText(text);
            a.showAndWait();
        });
    }

    private void showError(String title, String text) {
        Platform.runLater(() -> {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle(title);
            a.setHeaderText(null);
            a.setContentText(text);
            a.showAndWait();
        });
    }
}

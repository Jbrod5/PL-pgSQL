package org.jbrod.application.ui;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import org.jbrod.application.ui.custom_tools.CustomTreeItem;

import java.io.File;
import java.util.LinkedList;

public class PrincipalPanel extends SplitPane {

    private TreeView<String> treeView; // Ahora almacena File directamente
    private VBox editorPanel;
    private TabPane tabPane; // Panel de pestañas
    //private LinkedList<WorkTabPanel> openTabs;

    public PrincipalPanel(String rootDirectoryPath) {


        // - - - - - - - - - - - - - Lado izquierdo - - - - - - - - - - - - - - - -
        // Colocar el arbol de archivos
        File rootDPath = new File(rootDirectoryPath);
        TreeItem<String> rootItem = fillTree(rootDPath); //TreeItem puede almacenar un objeto, aprovechando para guardar su file correspondiente
        rootItem.setExpanded(true);

        treeView = new TreeView<>(rootItem);
        treeView.setPrefWidth(100);

        // - - - - - - - - - - - - - Lado derecho - - - - - - - - - - - - - - - -
        tabPane = new TabPane();

        // Agregando paneles
        this.getItems().addAll(treeView, tabPane);
        this.setDividerPositions(0.2);

        // - - - - - - - - - - Manejar evento click en el árbol - - - - - - - - -
        treeView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            //newSeleccion es el CustomTreeItem
            if (newSelection != null) {
                //aprovechando la clase CustomTreeItem para obtener su archivo guardado
                File selectedFile = ((CustomTreeItem)newSelection).getFile();

                if (selectedFile != null && selectedFile.isFile()) {
                    openFileInTab(selectedFile);
                    System.out.println("Accediendo a: " + selectedFile.getAbsolutePath());
                }
            }
        });
    }



    // Llenar el árbol recursivamente con File
    private TreeItem<String> fillTree(File file) {
        CustomTreeItem treeItem = new CustomTreeItem(file);

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File actualFile : files) {
                    treeItem.getChildren().add(fillTree(actualFile));
                }
            }
        }

        return treeItem;
    }




    // Abrir archivo en una pestaña nueva o seleccionar la pestaña si ya existe en la lista de pestañas
    private void openFileInTab(File file) {
        //Recorrer la lista de pestañas abiertas
        for (Tab tab : tabPane.getTabs()) {
            //Si el archivo del treeItem seleccionado es igual a uno de los archivos en una de las pestañas solo seleccionar la pestaña abierta
            if (tab.getUserData() != null && tab.getUserData().equals(file)) {
                tabPane.getSelectionModel().select(tab);
                return;
            }
        }

        //Si el archivo del TreeItem seleccionado no está en una de las pestañas, abrir una nueva
        WorkTabPanel workPanel = new WorkTabPanel(file);
        Tab tab = new Tab(file.getName(), workPanel);
        tab.setUserData(file); // Se puede almacenar un dato en tab, almacenar archivo para poder identificar la tab
        tabPane.getTabs().add(tab);
        tabPane.getSelectionModel().select(tab);
    }
}

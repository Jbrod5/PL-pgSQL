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


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 * Panel con TreeView (izq) y TabPane (der). Pasa un Path raíz al constructor.
 */
public class EditorPanel extends BorderPane {

    private TextArea textArea;
    private Button btnGuardar;
    private Button btnEjecutar;

    private File file;

    public EditorPanel(File file) {
        this.file = file;

        // Crear TextArea
        textArea = new TextArea();
        textArea.setFont(Font.font("Monospaced", 14));

        // Crear botones
        btnGuardar = new Button("Guardar");
        btnEjecutar = new Button("Ejecutar");

        // Contenedor horizontal para los botones
        HBox buttonBox = new HBox(10); // 10px de espacio
        buttonBox.setPadding(new Insets(5));
        buttonBox.getChildren().addAll(btnGuardar, btnEjecutar);

        // Asignar posiciones en BorderPane
        this.setCenter(textArea);
        this.setBottom(buttonBox);
    }




    public TextArea getTextArea() {
        return textArea;
    }




}

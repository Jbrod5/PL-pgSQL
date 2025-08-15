package org.jbrod.application.ui;


import javafx.geometry.Insets;
import javafx.scene.control.*;

import javafx.scene.layout.*;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;


import java.nio.file.*;



import java.io.File;


/**
 * Panel con el editor de texto correspondiente al archivo.
 */
public class EditorPanel extends BorderPane {

    private TextArea textArea;
    private CodeArea codeArea;
    //para control de linea y columna
    private int line;
    private int column;

    private Button btnGuardar;
    private Button btnEjecutar;

    private File file;

    public EditorPanel(File file) {
        this.file = file;

        // Crear TextArea para el codigo (puede ser un CodeArea?)
        //textArea = new TextArea();
        //textArea.setFont(Font.font("Monospaced", 14));
        codeArea = new CodeArea(); //Editor de codigo de la libreria RichTextFX
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea)); //Agregar numeracion de linea
        VirtualizedScrollPane<CodeArea> scrollForCodeArea = new VirtualizedScrollPane<>(codeArea);


        // Crear botones
        btnGuardar = new Button("Guardar");
        btnEjecutar = new Button("Ejecutar");


        // Contenedor horizontal para los botones
        HBox buttonBox = new HBox(10); // 10px de espacio
        buttonBox.setPadding(new Insets(5));
        buttonBox.getChildren().addAll(btnGuardar, btnEjecutar);

        // Asignar posiciones en BorderPane
        //this.setCenter(textArea);
        //this.setCenter(codeArea); El scroll del codeArea no es comodo
        this.setCenter(scrollForCodeArea);
        this.setBottom(buttonBox);
    }




    public TextArea getTextArea() {
        return textArea;
    }




}

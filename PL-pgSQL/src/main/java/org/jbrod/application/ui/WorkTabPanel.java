package org.jbrod.application.ui;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WorkTabPanel extends VBox {

    private File file;

    //areas de trabajo
    private SplitPane vertical;
    private SplitPane horizontal;

    private TextArea textArea;
    private EditorPanel editorPanel;

    private TextArea analyzeMessages;




    public WorkTabPanel(File file) {

        // Hacer que ocupe tod o el espacio posible
        this.setFillWidth(true);
        this.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);


        this.file = file;

        //Habrán dos splitpane, uno arriba con el area de trabajo y uno abajo con las salidas del analisis
        //1. Vertical
        vertical = new SplitPane();
        vertical.setOrientation(Orientation.VERTICAL);
        this.getChildren().add(vertical);

        // 2. Horizontal (area de trabajo)
        horizontal = new SplitPane();

        //2.1 Editor de texto
        //this.textArea = new TextArea(); //area de trabajo de codigo
        editorPanel = new EditorPanel(file);
        // Leer contenido del archivo y cargar el texto en el TextArea
        //try {
        //String content = Files.readString(file.toPath());
        //    textArea.setText(content);
        //} catch (IOException e) {
        //    textArea.setText("No se pudo cargar el archivo: " + e.getMessage());
        //}

        //2.2 otra area (por definir)
        TextArea placeholder = new TextArea();
        horizontal.getItems().addAll(editorPanel, placeholder );



        //1.2. Area de mensajes del analisis
        analyzeMessages = new TextArea();


        //Cargar los paneles en el vertical
        VBox.setVgrow(vertical, javafx.scene.layout.Priority.ALWAYS);
        HBox.setHgrow(editorPanel, javafx.scene.layout.Priority.ALWAYS);
        vertical.getItems().addAll(horizontal, analyzeMessages);
        vertical.setDividerPositions(0.8);





    }



    public WorkTabPanel(){
    }



    public WorkTabPanel(String path){
        this.file = new File(path);
    }



    public TextArea getTextArea() {
        return textArea;
    }





    public File getFile(){
        return file;
    }
}

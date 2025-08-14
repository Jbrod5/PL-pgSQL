package org.jbrod.application.ui;

import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WorkTabPanel extends VBox {

    private File file;
    private TextArea textArea;



    public WorkTabPanel(File file) {
        this.file = file;
        this.textArea = new TextArea();
        this.getChildren().add(textArea);

        // Leer contenido del archivo y cargar el texto en el TextArea
        try {
            String content = Files.readString(file.toPath());
            textArea.setText(content);
        } catch (IOException e) {
            textArea.setText("No se pudo cargar el archivo: " + e.getMessage());
        }
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

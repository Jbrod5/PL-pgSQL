package org.jbrod.controllers;

import org.jbrod.application.ui.EditorPanel; // tu clase EditorPanel
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.nio.file.Paths;

public class HolaMundoController {

    @FXML
    private Button btnBotoncito1;

    @FXML
    private Label lblMensajito;

    @FXML
    private BorderPane editorContainer;

    @FXML
    public void initialize() {
        // Aquí le pasas la carpeta que quieras explorar
        String path = "/home/jorge/Escritorio/Pruebas texto";
        //EditorPanel editorPanel = new EditorPanel(Paths.get(path));

        // Colocar el editor en el centro del BorderPane
       // editorContainer.setCenter(editorPanel);
    }

    @FXML
    private void click() {
        lblMensajito.setText("Hola a todos desde botoncito1 :3");
    }
}

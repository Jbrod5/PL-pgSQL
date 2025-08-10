package org.jbrod.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HolaMundoController {

    @FXML
    private Button btnBotoncito1;

    @FXML
    private Label lblMensajito;

    @FXML
    void click(ActionEvent event) {
        System.out.println("Hola a todos desde botoncito1 :3");
        lblMensajito.setText("Hola a todos en mensajito desde botoncito1 :3");
    }
}

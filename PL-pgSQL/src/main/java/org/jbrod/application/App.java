package org.jbrod.application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.jbrod.application.ui.PrincipalPanel;
import org.jbrod.utilities.Paths;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        /*AnchorPane load = FXMLLoader.load(getClass().getResource(Paths.HOLA_MUNDO));

        Scene scene = new Scene(load);
        stage.setScene(scene);

        stage.show();*/


        PrincipalPanel panel = new PrincipalPanel("/home/jorge/Escritorio/Pruebas texto");

        Scene scene = new Scene(panel, 900, 600);
        stage.setScene(scene);
        stage.setTitle("PL-pgSQL");
        stage.show();



    }
}
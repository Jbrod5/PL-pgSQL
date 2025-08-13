package org.jbrod.application.ui;

import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

import java.io.File;

public class PrincipalPanel extends SplitPane{

    private TreeView<String> treeView;
    private VBox editorPanel; //Caja vertical (coloca elementos uno sobre otro)


    public PrincipalPanel(String rootDirectoryPath){

        // - - - - - - - - - - - - - Lado izquierdo - - - - - - - - - - - - - - - -
        //Crear un archivo con el directorio raíz del proyecto
        File rootDPath = new File(rootDirectoryPath);
        TreeItem<String> rootItem = new TreeItem<>(rootDPath.getName()); //El item raiz es el nombre del directorio raíz
        rootItem.setExpanded(true);

        TreeView treeView = new TreeView<>(rootItem);
        treeView.setPrefWidth(200);

        // - - - - - - - - - - - - - Lado derecho - - - - - - - - - - - - - - - -
        editorPanel = new VBox();
        editorPanel.setStyle("-fx-background-color: #f5f5f5;");

        //Agregando paneles
        this.getItems().addAll(treeView, editorPanel);
        this.setDividerPositions(0.3);



    }

}

package org.jbrod.application.ui;

import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

import java.io.File;
import java.util.LinkedList;

public class PrincipalPanel extends SplitPane{

    private TreeView<String> treeView;
    private VBox editorPanel; //Caja vertical (coloca elementos uno sobre otro)
                              //Mejor hacer que el area de trabajo herede de VBox
    private TabPane tabPane;


    private LinkedList<WorkTabPanel> openTabs;

    public PrincipalPanel(String rootDirectoryPath){

        // - - - - - - - - - - - - - Lado izquierdo - - - - - - - - - - - - - - - -
        //Crear un archivo con el directorio raíz del proyecto
        File rootDPath = new File(rootDirectoryPath);
        TreeItem<String> rootItem = fillTree(rootDPath); //El item raiz es el nombre del directorio raíz
        rootItem.setExpanded(true);

        TreeView treeView = new TreeView<>(rootItem);
        treeView.setPrefWidth(100);

        // - - - - - - - - - - - - - Lado derecho - - - - - - - - - - - - - - - -
        /*editorPanel = new VBox();
        editorPanel.setStyle("-fx-background-color: #f5f5f5;");*/
        tabPane = new TabPane();

        //Agregando paneles
        this.getItems().addAll(treeView, tabPane);
        this.setDividerPositions(0.2);



    }

    //Llenar el arbol de archivos recursivamente
    private TreeItem<String> fillTree(File file){
        TreeItem<String> item = new TreeItem<>(file.getName());

        //Si es una carpeta, recorrerala
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files != null){
                for (File actualFile : files){
                    //Agregar archivos como hijos del item actual que es una carpeta
                    item.getChildren().add(fillTree(actualFile));
                }
            }
        }
        return item;
    }

}

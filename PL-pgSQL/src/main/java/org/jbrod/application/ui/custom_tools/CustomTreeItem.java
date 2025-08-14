package org.jbrod.application.ui.custom_tools;

import javafx.scene.control.TreeItem;

import java.io.File;

public class CustomTreeItem extends TreeItem<String> {

    //Archivo correspondiente al treeItem
    private File file;

    /**
     * Construye un TreeItem con un elemento de archivo y un nombre en base al nombre del archivo.
     * @param file: Archivo correspondiente al elemento del TreeItem.
     * **/
    public CustomTreeItem(File file){
        //Al ser un treeItem de tipo string, usará el nombre del archivo para que no aparezca toda su ruta como nombre
        super(file.getName());
        this.file = file;

    }



    public File getFile() {
        return file;
    }
}

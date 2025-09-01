package org.jbrod.controllers.sql;

import java.util.LinkedList;

public class Tabla {
    private  String nombre;

    // Usuarios con permisos - - -
    private LinkedList<String> permSelect;
    private LinkedList<String> permInsert;
    private LinkedList<String> permUpdate;
    private LinkedList<String> permDelete;

    // Contenido de la tabla
    private LinkedList<String> tipos;
    private LinkedList<String> nombreColumnas;

    private LinkedList<LinkedList<String>> contenido;


}

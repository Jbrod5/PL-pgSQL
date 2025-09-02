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
    //Ejemplo en orden:
    /* pk     ,        , fk       (caracteristicas)
     * Integer, decimal, Integer  (tipos)
     * id     , salario, puesto   (nombre columnas)
     * los contenidos deben estar coordinados para funcionar. */
    private LinkedList<String> caractaristicas;
    private LinkedList<String> tipos;
    private LinkedList<String> nombreColumnas;

    private LinkedList<LinkedList<String>> contenido;



    /* Constructor de la tabla.
    * @param String nombreTabla: String con el nombre de la tabla.
    * @param LinkedList<String> caracteristicas: Define que características tienen las columnas: Llave foranea fk, llave primaria pk.
    * @param LinkedList<String> tipos: Define los tipos de las columnas: String, boolean, Integer, etc.
    * @param LinkedList<String> nombreColumnas: Define los nombres que tienen las columnas en la tabla.
    * */
    public Tabla(String nombreTabla,LinkedList<String> caractaristicas, LinkedList<String> tipos, LinkedList<String> nombreColumnas){
        this.caractaristicas = caractaristicas;
        this.tipos = tipos;
        this.nombreColumnas = nombreColumnas;

        this.nombre = nombreTabla;

        contenido = new LinkedList<>();
    }




    /* Agrega una tupla a la tabla
    * @param LinkedList<String> columnas: lista enlazada con los nombres de las columnas donde se insertara.
    * @param LinkedList<String> valores: lista enlazada conlos valores que se insertarán en la tabla.*/
    public void agregarTupla(LinkedList<String> columnas, LinkedList<String> valores) {

        // 1. Inicializar nuevaTupla con nulls para todas las columnas
        LinkedList<String> nuevaTupla = new LinkedList<>();
        for (int i = 0; i < nombreColumnas.size(); i++) {
            nuevaTupla.add(null); // Todas las columnas empiezan como null
        }

        // 2. Buscar y asignar valores
        for (int j = 0; j < columnas.size(); j++) {
            String columnaBuscada = columnas.get(j);
            boolean columnaEncontrada = false;

            for (int i = 0; i < nombreColumnas.size(); i++) {
                if (columnaBuscada.equals(nombreColumnas.get(i))) {
                    nuevaTupla.set(i, valores.get(j));
                    columnaEncontrada = true;
                    break;
                }
            }

            if (!columnaEncontrada) {
                throw new IllegalArgumentException("Columna no encontrada: " + columnaBuscada);
            }
        }

        contenido.add(nuevaTupla);
    }

}

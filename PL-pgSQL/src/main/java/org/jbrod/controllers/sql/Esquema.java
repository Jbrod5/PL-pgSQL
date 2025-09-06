package org.jbrod.controllers.sql;

import java.util.LinkedList;

public class Esquema {

    private  String nombre;
    private LinkedList<Tabla> tablas;


    public Esquema(String nombreEsquema){
        this.nombre = nombreEsquema;
        tablas = new LinkedList<>();
    }



    public void agregarTabla(String nombreTabla, LinkedList<String> caractaristicas, LinkedList<String> tipos, LinkedList<String> nombreColumnas){
        if(obtenerIndiceTabla(nombreTabla) == -1){
            Tabla nuevaTabla = new Tabla( nombreTabla, caractaristicas, tipos, nombreColumnas);
            tablas.add(nuevaTabla);
        }else{
            //Lanzar exepcion
            throw new IllegalArgumentException("La tabla: " + nombreTabla + " quiso agregarse al esquema: " + nombre + " pero ya existia.");
        }
    }

    /*Elimina una tabla completa del esquema
     * @param nombreTabla String: nombre de la tabla a eliminar */
    public void eliminarTabla(String nombreTabla) {
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if (indiceTabla == -1) {
            throw new IllegalArgumentException(
                    "Se intento eliminar la tabla: " + nombreTabla + " desde el esquema: " + nombre + " pero no existe."
            );
        }

        tablas.remove(indiceTabla);
    }







    private int obtenerIndiceTabla(String nombreTabla){
        for (int i = 0; i < tablas.size(); i++) {
            if(tablas.get(i).getNombre().equals(nombreTabla)){
                //Si se encuentra la tabla, retornar su indice
                return i;
            }
        }
        //Si no se encuentra, retornar -1
        return -1;
    }






    /*Agrega una tupla en una tabla
    * @param nombreTabla String: nombre de la tabla donde se agregara la tupla */
    public void agregarTuplaEnTabla(String nombreTabla, LinkedList<String> columnas, LinkedList<String> valores){
        //Verificar si existe la tabla
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla != -1) {
            tablas.get(indiceTabla).agregarTupla(columnas, valores);
        }else{
            throw new IllegalArgumentException("Se intento agregar una tupla a la tabla: " + nombreTabla + " desde el esquema: " + nombre + " pero la tabla no existe.");
        }
    }


    /*Agrega una columna en una tabla
     * @param nombreTabla String: nombre de la tabla donde se agregara la columna */
    public void agregarColumnaTabla(String nombreTabla, String nombreColumna, String tipo){
        //Verificar si existe la tabla
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla != -1) {
            tablas.get(indiceTabla).agregarColumna(nombreColumna, tipo);
        }else{
            throw new IllegalArgumentException("Se intento agregar una columna a la tabla: " + nombreTabla + " desde el esquema: " + nombre + " pero la tabla no existe.");
        }
    }




    /*Elimina una columna en una tabla
     * @param nombreTabla String: nombre de la tabla donde se eliminara la columna */
    public void eliminarColumnaTabla(String nombreTabla, String nombreColumna){
        //Verificar si existe la tabla
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla != -1) {
            tablas.get(indiceTabla).eliminarColumna(nombreColumna);
        }else{
            throw new IllegalArgumentException("Se intento eliminar una columna a la tabla: " + nombreTabla + " desde el esquema: " + nombre + " pero la tabla no existe.");
        }
    }




    /*Agrega una contraint de llave foranea a una tabla*/
    public void agregarConstraintFKTabla(String tablaDondeAgregar, String nombreConstraint, String columnaLocal, String tablaReferenciada, String columnaReferenciada){
        int indiceDondeAgregar = obtenerIndiceTabla(tablaDondeAgregar);
        int indiceTablaReferenciada = obtenerIndiceTabla(tablaReferenciada);

        if(indiceDondeAgregar == -1){
            throw new IllegalArgumentException("Se intento agregar una constraint FK en la tabla: " + tablaDondeAgregar + " desde el esquema: " + nombre + " pero la tabla no existe.");
        }
        if(indiceTablaReferenciada == -1){
            throw new IllegalArgumentException("Se intento agregar una constraint FK en la tabla: " + tablaDondeAgregar + " hacia la tabla: " + tablaReferenciada + " desde el esquema: " + nombre + " pero la tabla referenciada no existe.");
        }


        //1. Obtener las tablas para trabajar
        Tabla dondeAgregar = tablas.get(indiceDondeAgregar);
        Tabla referenciada = tablas.get(indiceTablaReferenciada);

        //2. Agregar la referencia en la tabla dondeAgregar
        dondeAgregar.agregarConstraintFK(nombreConstraint, columnaLocal, referenciada, columnaReferenciada);
    }



    /*Elimina una constraint de fk en una tabla*/
    public void eliminarConstraintFKTabla(String nombreTabla, String constraint){
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla == -1){
            throw new IllegalArgumentException("Se quiso eliminar una constraint en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).eliminarConstraintFK(constraint);
    }




    // - - - - - - - - - - - - - - - - - - - Permisos  - - - - - - - - - - - - - - - - - - -
    //dar permisos
    public void agregarPermisoSelect(String nombreTabla, String usuario){
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla == -1){
            throw new IllegalArgumentException("Se quiso agregar permiso de Select en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).agregarPermisoSelect(usuario);
    }
    public void agregarPermisoInsert(String nombreTabla, String usuario){
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla == -1){
            throw new IllegalArgumentException("Se quiso agregar permiso de Insert en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).agregarPermisoInsert(usuario);
    }
    public void agregarPermisoDelete(String nombreTabla, String usuario){
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla == -1){
            throw new IllegalArgumentException("Se quiso agregar permiso de Delete en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).agregarPermisoDelete(usuario);
    }
    public void agregarPermisoUpdate(String nombreTabla, String usuario){
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla == -1){
            throw new IllegalArgumentException("Se quiso agregar permiso de Update en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).agregarPermisoUpdate(usuario);
    }

    //revocar permisos
    public void eliminarPermisoSelect(String nombreTabla, String usuario){
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if(indiceTabla == -1){
            throw new IllegalArgumentException("Se quiso eliminar permiso de Select en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).eliminarPermisoSelect(usuario);
    }
    public void eliminarPermisoUpdate(String nombreTabla, String usuario) {
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if (indiceTabla == -1) {
            throw new IllegalArgumentException("Se quiso eliminar permiso de Update en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).eliminarPermisoUpdate(usuario);
    }
    public void eliminarPermisoDelete(String nombreTabla, String usuario) {
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if (indiceTabla == -1) {
            throw new IllegalArgumentException("Se quiso eliminar permiso de Delete en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).eliminarPermisoDelete(usuario);
    }
    public void eliminarPermisoInsert(String nombreTabla, String usuario) {
        int indiceTabla = obtenerIndiceTabla(nombreTabla);
        if (indiceTabla == -1) {
            throw new IllegalArgumentException("Se quiso eliminar permiso de Insert en la tabla: " + nombreTabla + " pero no existe en el esquema: " + nombre + ".");
        }

        tablas.get(indiceTabla).eliminarPermisoInsert(usuario);
    }






        //Exportar a yaml :3
    public String exportarAYaml() {
        StringBuilder sb = new StringBuilder();
        sb.append("---\n");
        sb.append("# Esquema: " + nombre + "\n");
        sb.append("tablas:\n");
        for (Tabla tabla : tablas) {
            sb.append(tabla.exportarAYaml());
        }
        sb.append("---\n");
        return sb.toString();
    }




    //Getters
    public String getNombre() {
        return nombre;
    }
}

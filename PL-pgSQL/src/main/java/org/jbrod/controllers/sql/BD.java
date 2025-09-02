package org.jbrod.controllers.sql;

import org.jbrod.controllers.sql.Exepciones.BadConfigurationException;
import org.jbrod.controllers.sql.utilidades.BDYamlController;

import java.util.LinkedList;

public class BD {

    //habrá una BD por cada ventana de trabajo abierta :3
    private LinkedList<Esquema> esquemas;
    Esquema esquemaEnUso;

    public BD(){
        esquemas = new LinkedList<>();
    }

    public void establecerEsquemaEnUso(String nombreEsquema){
        int posicionEsquema = obtenerIndiceEsquema(nombreEsquema);
        if( posicionEsquema != -1){
            esquemaEnUso = esquemas.get(posicionEsquema);
        }else{
            throw new IllegalArgumentException("Se intento establecer el esquema: " + nombreEsquema + " como esquema en uso pero no existe en la base de datos.");
        }
    }

    public void limpiarEsquemaEnUso(){
        //Quiza no sea lo mejor por el NullPointerException xd
        esquemaEnUso = null;
    }



    private int obtenerIndiceEsquema(String nombreEsquema){
        for (int i = 0; i < esquemas.size(); i++) {
            if(nombreEsquema.equals(esquemas.get(i).getNombre())){
                //Retorna la posicion del esquema
                return i;
            }
        }
        //Retorna -1 si el esquema no esxiste
        return -1;
    }






    public void crearEsquema(String nombreEsquema){
        if(obtenerIndiceEsquema(nombreEsquema) == -1){
            //Crear el esquema
            Esquema esquema = new Esquema(nombreEsquema);
            esquemas.add(esquema);
        }else{
            //Lanzar excepcion
            throw new IllegalArgumentException("Se intento agregar el esquema: " + nombreEsquema+ " a la base de datos pero ya existia.");
        }
    }







    public void agregarTabla(String nombreTabla, LinkedList<String> caractaristicas, LinkedList<String> tipos, LinkedList<String> nombreColumnas) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarTabla(nombreTabla, caractaristicas, tipos, nombreColumnas);
        }else{
            throw new BadConfigurationException("Se intento agregar una tabla pero no hay un esquema en uso.");
        }
    }

    public void agregarTuplaEnTabla(String nombreTabla, LinkedList<String> columnas, LinkedList<String> valores) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarTuplaEnTabla(nombreTabla, columnas,  valores);
        }else{
            throw new BadConfigurationException("Se intento agregar una tupla a una tabla pero no hay un esquema en uso.");
        }
    }
    public void agregarColumnaTabla(String nombreTabla, String nombreColumna, String tipo) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarColumnaTabla(nombreTabla, nombreColumna,  tipo);
        }else{
            throw new BadConfigurationException("Se intento agregar una columna a una tabla pero no hay un esquema en uso.");
        }
    }

    public void eliminarColumnaTabla(String nombreTabla, String nombreColumna) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.eliminarColumnaTabla(nombreTabla, nombreColumna);
        }else{
            throw new BadConfigurationException("Se intento eliminar una columna a una tabla pero no hay un esquema en uso.");
        }
    }

    public void agregarConstraintFKTabla(String tablaDondeAgregar, String nombreConstraint, String columnaLocal, String tablaReferenciada, String columnaReferenciada) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarConstraintFKTabla(tablaDondeAgregar, nombreConstraint, columnaLocal, tablaReferenciada, columnaReferenciada);
        }else{
            throw new BadConfigurationException("Se intento agregar una constraint fk a una tabla pero no hay un esquema en uso.");
        }
    }
    public void eliminarConstraintFKTabla(String nombreTabla, String constraint) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.eliminarConstraintFKTabla(nombreTabla, constraint);
        }else{
            throw new BadConfigurationException("Se intento eliminar una constraint fk a una tabla pero no hay un esquema en uso.");
        }
    }




    // - - - - - - - - - - - - - - - - - - - Permisos  - - - - - - - - - - - - - - - - - - -
    public void agregarPermisoSelect(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarPermisoSelect(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento otorgar permiso Select en una tabla pero no hay un esquema en uso.");
        }
    }

    public void agregarPermisoInsert(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarPermisoInsert(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento otorgar permiso Insert en una tabla pero no hay un esquema en uso.");
        }
    }
    public void agregarPermisoUpdate(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarPermisoUpdate(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento otorgar permiso Update en una tabla pero no hay un esquema en uso.");
        }
    }
    public void agregarPermisoDelete(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.agregarPermisoDelete(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento otorgar permiso Delete en una tabla pero no hay un esquema en uso.");
        }
    }



    public void eliminarPermisoUpdate(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.eliminarPermisoUpdate(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento eliminar permiso Update en una tabla pero no hay un esquema en uso.");
        }
    }
    public void eliminarPermisoSelect(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.eliminarPermisoSelect(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento eliminar permiso Select en una tabla pero no hay un esquema en uso.");
        }
    }
    public void eliminarPermisoInsert(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.eliminarPermisoInsert(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento eliminar permiso Insert en una tabla pero no hay un esquema en uso.");
        }
    }
    public void eliminarPermisoDelete(String nombreTabla, String usuario) throws BadConfigurationException {
        if(esquemaEnUso != null){
            esquemaEnUso.eliminarPermisoDelete(nombreTabla, usuario);
        }else{
            throw new BadConfigurationException("Se intento eliminar permiso Delete en una tabla pero no hay un esquema en uso.");
        }
    }








    //Yaml
    public void exportarYamls(){
        if(!esquemas.isEmpty()){
            BDYamlController bdYamlController = new BDYamlController();

            for (Esquema esquema: esquemas){
                bdYamlController.exportarEsquema(esquema);
            }
        }
    }



}

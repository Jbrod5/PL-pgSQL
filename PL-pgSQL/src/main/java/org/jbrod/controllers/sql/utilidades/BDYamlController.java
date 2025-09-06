package org.jbrod.controllers.sql.utilidades;

import org.jbrod.controllers.sql.Esquema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class BDYamlController {

    //Esta clase sera la responsable de exportar todos los yaml en sus archivos
    //La ruta es ./esquemas

    private final String ruta;


    public BDYamlController(){
        ruta = "." + File.separator + "/esquemas";
        verificarExistencia();
        System.out.println("se verificara la existencia de " + ruta);
    }

    private void verificarExistencia(){
        File carpetaEsquemas = new File(ruta);

        //Si la carpeta existe verificar que sea un directorio
        if(carpetaEsquemas.exists()){

            //Si no es un directorio, eliminarlo y crearlo como directorio
            if(!carpetaEsquemas.isDirectory()){
                carpetaEsquemas.delete();
                carpetaEsquemas.mkdir();
            }
        }else{
            //Si no existe, crear el directorio
            carpetaEsquemas.mkdir();
        }

        System.out.println("Carpeta creada correctamente.");
    }



    // - - - - - - - - - - - - - - - - - - - - - -  Exportacion - - - - - - - - - - - - - - - - - - - - - -
    public void exportarEsquema(Esquema esquema) {
        File esquemaExportar = new File(ruta + File.separator + esquema.getNombre() + ".txt");

        try {
            // 1. Leer contenido existente si hay
            String contenidoExistente = "";
            if (esquemaExportar.exists()) {
                contenidoExistente = new String(Files.readAllBytes(esquemaExportar.toPath()));
            }

            // 2. Nuevo contenido a escribir al inicio
            String nuevoContenido = esquema.exportarAYaml() + System.lineSeparator() + contenidoExistente;

            // 3. Escribir todo al archivo
            Files.write(esquemaExportar.toPath(), nuevoContenido.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

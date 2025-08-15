package org.jbrod.utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class TextManager {

    private File file;

    public TextManager(File file) {
        this.file = file;
    }

    /**
     * Reescribe el contenido del archivo desde cero.
     * @param newContent Contenido nuevo para el archivo.
     * @throws IOException si ocurre un error de escritura.
     */
    public void rewrite(String newContent) throws IOException {
        try (FileWriter writer = new FileWriter(file, false)) { // false = sobrescribir
            writer.write(newContent);
        }
    }

    /**
     * Lee todo el contenido del archivo como un String.
     * @return Contenido del archivo.
     * @throws IOException si ocurre un error de lectura.
     */
    public String read() throws IOException {
        return Files.readString(file.toPath());
    }

    /**
     * Agrega contenido al final del archivo.
     * @param extraContent Contenido a agregar.
     * @throws IOException si ocurre un error de escritura.
     */
    public void appendEnd(String extraContent) throws IOException {
        Files.writeString(file.toPath(), extraContent, StandardOpenOption.APPEND);
    }

    /**
     * Agrega contenido al inicio del archivo.
     * @param extraContent Contenido a agregar.
     * @throws IOException si ocurre un error de lectura o escritura.
     */
    public void appendTop(String extraContent) throws IOException {
        String currentContent = read();
        rewrite(extraContent + currentContent);
    }

    /**
     * Crea un archivo en la ruta especificada.
     * @param path Ruta completa del archivo a crear.
     * @return true si se crea correctamente, false si ya existe.
     * @throws IOException si ocurre un error de creación.
     */
    public static boolean createFile(String path) throws IOException {
        File newFile = new File(path);
        if (newFile.exists()) {
            return false; // ya existe
        }
        return newFile.createNewFile();
    }

    public File getFile() {
        return file;
    }
}

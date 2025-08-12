Notas personales: 
1. Instalación de JavaFX:
       Descargar la version 21.0.8 en la carpeta Apps y solo descomprimir
       (Es posible que sea necesario agregar VMOptions:
       Run - Edit configurations, en build and run, Modify options > Add VMOptions
       Luego, colocar (si solo se descomprimió en Apps)
       --module-path
       /home/jorge/Apps/javafx-sdk-21.0.8/lib
       --add-modules
       javafx.controls,javafx.fxml
   
3. Instalación de SceneBuilder (JavaFX)
    Para Solus, utilizar flatpak con el comando: flatpak install flathub com.gluonhq.SceneBuilder
    crear un script de bash en Apps con el comando flatpak run com.gluonhq.SceneBuilder
    Para correr scenebuilder desde Intellij, ir a File>Settings>Languages and Frameworks > JavaFX y en el path seleccionar la ruta del script en el paso anterior

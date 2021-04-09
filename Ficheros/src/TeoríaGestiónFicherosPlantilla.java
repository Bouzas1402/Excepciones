import java.io.File;

public class TeoríaGestiónFicherosPlantilla {

    public static void main(String[] args) {
        // GESTIÓN DE ARCHIVOS

        // 1. Creación de archivos (en el sistema de archivos): método boolean createNewFile ********************************************************
                // Dos pasos: 1) Crear una instancia de File; 2) Invocar al método createNewFile();
File otroFichero = new File("ruta");



        // 2. Creación de directorios ***************************************
        // Primero, crear una instancia de File; a continuación, llamar a boolean mkdir o boolean mkdirs
        // boolean mkdir: si no existe un directorio de los de la ruta, no lo crea y devuelve false
        // boolean mkdirs: si no existe un directorio de los de la ruta, lo crea


        // 3. Eliminación de archivos y directorios: método boolean delete()

        // borradoRecursivo(File dir);


        // 4. Cambio de nombre y de ubicación de archivos y directorios
        // para ambas cosas utilizamos el método renameTo(new File(nuevaRuta))

    }
}

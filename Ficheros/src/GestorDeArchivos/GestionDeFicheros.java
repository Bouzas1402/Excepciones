package GestorDeArchivos;

import java.io.File;
import java.lang.String;

public class GestionDeFicheros {

    public static void main(String[] args) throws Exception {
        // GESTIÓN DE ARCHIVOS
String raiz = "Ficheros\\Quevedo1"; //esta es la raiz de las direcciones que vamos a usar.
        // 1. Creación de archivos (en el sistema de archivos): método boolean createNewFile ********************************************************
        // Dos pasos: 1) Crear una instancia de File; 2) Invocar al método createNewFile();
        File fichero = new File("ruta");


        // 2. Creación de directorios ***************************************
        // Primero, crear una instancia de File; a continuación, llamar a boolean mkdir o boolean mkdirs
        // boolean mkdir: si no existe un directorio de los de la ruta, no lo crea y devuelve false
        // boolean mkdirs: si no existe un directorio de los de la ruta, lo crea

// C:\Users\daw1_a\IdeaProjects\Excepciones\Ficheros\Quevedo1\DAW\Primero\BBDD\ListadoDawPrimero.txt
        // 3. Eliminación de archivos y directorios: método boolean delete()
File borrable = new File(raiz + "\\DAW\\Primero\\BBDD\\ListadoDawPrimero.txt");
        System.out.println(borrable.exists());
        // borradoRecursivo(File dir);
String carpeta = raiz + "\\DAM";
File carpeta1 = new File(carpeta);
        System.out.println(carpeta1.exists());


boolean borrado = borrable.delete();
        System.out.println(borrado);

        borrarRecursivamente(carpeta1);
        // 4. Cambio de nombre y de ubicación de archivos y directorios
        // para ambas cosas utilizamos el método renameTo(new File(nuevaRuta))

    }

    public static void borrarRecursivamente (File dir) {
        File[] elementos = dir.listFiles();
        System.out.println("Contenido: ");
        for (File unElemento : elementos) {
            System.out.println(unElemento.getName());
            if (unElemento.isDirectory()){
                borrarRecursivamente(unElemento);
            } else {
                System.out.println("Este es un fichero y lo voy a borrar." + unElemento.getName());
                unElemento.delete();
            }
        }
        System.out.println("Salimos del for y borramos");
        boolean borrada = dir.delete();
       if (borrada) {
           System.out.println("Borrada.");
       }

    }

}

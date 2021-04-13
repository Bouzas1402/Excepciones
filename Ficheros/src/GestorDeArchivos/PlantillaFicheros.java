package GestorDeArchivos;

import java.io.File;
import java.util.Date;

public class PlantillaFicheros {
    public static void main(String[] args) {

        // 1. LA CLASE File
        // Vamos a empezar creando un objeto File en el directorio de trabajo actual
        // Para ello, creamos una instancia de File y le pasamos un String con la ruta al fichero (absoluta o relativa)
        String raiz = "Ficheros\\..";
        File fichero = new File(raiz + "\\listado.txt");
        //File fichero = new File("..\\Ficheros\\listado.txt");

        // ...\\...\\...
        // ../ficheros/listado.txt

        // Métodos básicos: la API de File
        //https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/File.html
        // boolean exists()
        System.out.println("****La API de File: métodos básicos****");
        System.out.println("Existe: " + fichero.exists());

        // String getName()
        // String getParent()
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Directorio padre: " + fichero.getParent());

        // boolean isDirectory() --> si es true podemos utilizar list()
        // boolean isFile()
        System.out.println("¿Es directorio? " + fichero.isDirectory());
        System.out.println("¿Es fichero? " + fichero.isFile());

        System.out.println("******************************************");
        System.out.println("Ahora con un directorio");

        File carpeta = new File(raiz + "\\Quevedo\\daw\\primero");
        System.out.println("Existe: " + carpeta.exists());

        // // boolean isDirectory() --> si es true podemos utilizar list()
        System.out.println("¿Es directorio? " + carpeta.isDirectory());
        if (carpeta.isDirectory()) {
            String[] contenidos = carpeta.list();
            System.out.println("Listado: ");
            for (String elemento: contenidos) {
                System.out.println("    * " + elemento);
            }
        }


        // long lastModified() --> ojo, devuelve un long; para "entenderlo" hay que combinarlo con Date

        Date d = new Date(carpeta.lastModified());
        System.out.println("Última modificación: " + d);

        // canRead(), canWrite(), canExecute()
        System.out.println("Permiso de lectura: " + carpeta.canRead());
        System.out.println("Permiso de escritura: " + carpeta.canWrite());
        System.out.println("Permiso de ejecución: " + carpeta.canExecute());


    }
}

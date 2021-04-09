import java.io.File; // El io viene de entradas y salidas.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class TeoríaFilePlantilla {

    public static void main(String[] args) {

        // 1. LA CLASE File
        // Vamos a empezar creando un objeto File en el directorio de trabajo actual
        // Para ello, creamos una instancia de File y le pasamos un String con la ruta al fichero (absoluta o relativa)
        File fichero = new File("..\\Ficheros\\Listado.txt"); //Hay le tengo que poner una ruta que puede ser absoluta o relativa"
// con la ruta absoluta no fallas pero si lo transporta a otro lado que no coincida no funcionara.

        /*
         String raiz = "..\\Ficheros\\";
         File fichero = new File(raiz + "Listado.txt");
        * */


        // Métodos básicos: la API de File
        //https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/File.html
        // boolean exists()
        System.out.println("****Metodos basicos de la API de File****");
fichero.exists(); // Imprime true si existe y false si no existe
        System.out.println("Existe: " + fichero.exists());

        // String getName()
        System.out.println("Dime tu nombre: " + fichero.getName()); //Da el nombre del fichero

        // String getParent()
        System.out.println("Directorio padre: " + fichero.getParent());

        // boolean isDirectory() --> si es true podemos utilizar list() //metodo list te hace un listado de los directorios que contiene
        System.out.println();

        // boolean isFile()
        System.out.println("¿Es Fichero? " + fichero.isFile());
        System.out.println("¿Es un directorio?" + fichero.isDirectory());

        System.out.println("******************************************");
        System.out.println("Ahora con un directorio (carpeta)");

//Quiero crear un directorio que apunte a DAW\LDM
File carpeta = new File("C:\\Users\\daw1_a\\IdeaProjects\\Excepciones\\Ficheros\\Quevedo1\\DAW\\Primero");
        System.out.println("¿Es Fichero? " + carpeta.isFile());
        System.out.println("¿Es un directorio?" + carpeta.isDirectory());

        if (carpeta.isDirectory()) {
            String[] contenidos = carpeta.list();
            System.out.println("Listado: ");
            for (String elemento: contenidos) {
                System.out.println("    * " + elemento);
            }
        }

        System.out.println(carpeta.exists());
        System.out.println(Arrays.toString(carpeta.list())); // .list devuelve un Array con los ficheros que contiene la ruta indicada


        // long lastModified() --> ojo, devuelve un long; para "entenderlo" hay que combinarlo con Date
// devuelve la fecha en la que fue por ultima vez modificado.
        System.out.println("Fecha en bruto, el long que representa la fecha: ");
        System.out.println("Ultima modificación: " + carpeta.lastModified()); //te da un numero muy largo que significa un momento concreto desde que java empieza a contar
        System.out.println("Fecha despues de hacerla legible para el uso comun mediante clases de la API de Java");
        Date d = new Date(carpeta.lastModified());
        System.out.println(d);


        // canRead(), canWrite(), canExecute(), estos metodos son para los permisos de los ficheros que pueden ser de escritura
        // de lectura o de Ejecutar
        System.out.print("Permiso de Lectura: ");
        System.out.println(carpeta.canRead());
        System.out.print("Permiso de Escritura: ");
        System.out.println(carpeta.canWrite());
        System.out.print("Permiso de Ejecución: ");
        System.out.println(carpeta.canExecute());



    }
}

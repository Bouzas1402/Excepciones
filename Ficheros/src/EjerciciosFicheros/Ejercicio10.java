package EjerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    //Escribir un programa Java para buscar una palabra o una cadena en un fichero de texto. El programa pedirá que se introduzca una palabra o
    // un texto por teclado y realizará su búsqueda por el archivo. Se mostrará por pantalla el número de línea y el contenido de la línea
    // del fichero que contiene la cadena buscada. Si la cadena buscada aparece en varias líneas se mostrarán todas ellas. Si el fichero no
    // contiene el texto buscado se mostrará un mensaje indicándolo.
    public static Scanner sc = new Scanner(System.in);
    public static void palabraBuscada(File fichero) throws FileNotFoundException {
        ArrayList<String> lineasFichero = new ArrayList<>();
        System.out.println("¿Que palabra quiere buscar?");
        String palabra = sc.nextLine();
        try (Scanner sc = new Scanner(fichero)) {
            while (sc.hasNext()){
                lineasFichero.add(sc.nextLine());
            }
            for (int j = 0; j < lineasFichero.size(); j++) {
                if (lineasFichero.get(j).indexOf(palabra) != -1){
                    System.out.println("La palabra esta en la linea: " + (j + 1));
                    System.out.println(lineasFichero.get(j));
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("No se encuentra ningun archivo en: " + fichero.getAbsolutePath());
        }
    }
}

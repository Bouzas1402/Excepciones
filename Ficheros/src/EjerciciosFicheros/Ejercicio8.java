package EjerciciosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio8 {
    public static Scanner sc = new Scanner(System.in);
    //Escribir un programa Java que lee texto por teclado y lo escribe en un fichero de texto llamado datos.txt.
    // El proceso consiste en leer una línea de texto por teclado y escribirla en el fichero.
    // Este proceso se repite hasta que se introduce por teclado la cadena FIN.
    // La cadena FIN que indica el final de lectura no se debe escribir en el fichero.
    public static void escribirFichero() {
        File fichero = new File("..\\datos.txt");
        System.out.println(fichero.getAbsolutePath());
        boolean control = true;
        do {
            System.out.println("Ques es lo que quieres escribir?");
            String texto = sc.nextLine();
            if (texto.equalsIgnoreCase("FIN")) {
                break;
            }
            try (FileWriter escribir = new FileWriter(fichero, true)) {
                escribir.write(texto + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (control);
    }
}

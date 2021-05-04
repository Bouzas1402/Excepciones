package EjerciciosFicheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ejercicio3 {
    public static Scanner sc = new Scanner(System.in);
    public static void escribirArchivoCSV(File archivo) throws IOException {
//Partiendo del fichero de csv de ejemplo, crear un programa de Java que permita al usuario añadir datos nuevos a ese fichero,
//utilizando el mismo formato que los ya existentes.
        System.out.println("Introduzca el nombre del restaurante: ");
        String restaurante = sc.nextLine();
        System.out.println("Introduzca la direccion del restaurante: ");
        String direcccion = sc.nextLine();
        System.out.println("Introduzca la ciudad del restaurante: ");
        String ciudad = sc.nextLine();
        System.out.println("Introduzca el estado del restaurante: ");
        String estado = sc.nextLine();
        System.out.println("Introduzca el codigo postal del restaurante: ");
        String codigoPostal = sc.nextLine();
        try (FileWriter escribir = new FileWriter(archivo, true)) {
            escribir.write("\n" + restaurante + ", " + direcccion + ", " + ciudad + " ," + estado + " ," + codigoPostal);
        } catch (IOException e) {
            System.out.println("Se produce una excepcion %s" + e.getMessage());
        }
    }
    }


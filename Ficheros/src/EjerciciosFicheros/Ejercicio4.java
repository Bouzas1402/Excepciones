package EjerciciosFicheros;
import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;
public class Ejercicio4 {
    //Partiendo del fichero de csv de ejemplo, crear un programa de Java que cree una copia de ese fichero llamada
    // “Restaurants2.csv” que contenga los mismos datos excepto aquellos correspondientes a los restaurantes cuyo
    // código postal empieza por 6.
    public static void leerCSVSimple(String path) throws IOException {
        ArrayList<String> x1 = new ArrayList<>();
        File nuevoArchivoCSV = new File(path);
        File x = new File(path);
        try (Scanner sc = new Scanner(nuevoArchivoCSV)) {
            while (sc.hasNext()) {
                x1.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra ningun archivo: " + e.getMessage());
        }
        try (FileWriter escribir = new FileWriter(x, true)) {
            for (int i = 0; i < x1.size(); i++) {
                String[] y = x1.get(i).split(",");
                if (y[4].substring(0, 1).equals("6")) {
                    for (int j = 0; j < y.length; j++) {
                        escribir.write( y[j] + ",");
                    }
                    escribir.write("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Se produce una excepcion %s" + e.getMessage());
        }
    }
}

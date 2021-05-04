package EjerciciosFicheros;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
public class Ejercicio2 {
    //Partiendo del fichero de csv de ejemplo, crear un programa de Java que cree una copia de ese fichero llamada
    // “Restaurants2.csv” que contenga los mismos datos excepto aquellos correspondientes a los restaurantes cuyo
    // código postal empieza por 6.
    public static final String SEPARATOR=",";
    public static void leerCSVSimple(String path) throws IOException {
        File nuevoArchivoCSV = new File(path);
        BufferedReader bufferLectura = new BufferedReader(new FileReader(nuevoArchivoCSV));
        String linea = bufferLectura.readLine();
        while (linea != null) {
            String[] campos = linea.split(SEPARATOR);
            if (campos[4].equals("Zipcode") || campos[4].substring(0, 1).equals("6")) {
                String escribir = Arrays.toString(campos).replace("[", "");
                escribir = linea.replace("]", "");
                System.out.println(escribir);
            }
            linea = bufferLectura.readLine();
        }
        if (bufferLectura != null) {
            bufferLectura.close();
        }
    }
}

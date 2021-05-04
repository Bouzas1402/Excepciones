package EjerciciosFicheros;
import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejercicio4 {
    public static final String SEPARATOR=",";
    public static void leerCSVSimple(String path) throws IOException {
File nuevoArchivoCSV = new File(path);
        BufferedReader bufferLectura = new BufferedReader(new FileReader(path));
        String linea = bufferLectura.readLine();
        while (linea != null) {
            String[] campos = linea.split(SEPARATOR);
if (campos[4].equals("Zipcode") || campos[4].substring(0,1).equals("6")) {
    String x = Arrays.toString(campos).replace("[","");
    x = x.replace("]", "");
try (FileWriter escribir = new FileWriter(nuevoArchivoCSV, true)){
escribir.write(x + "\n");
} catch (IOException e){
    System.out.println("Se produce una excepcion %s" + e.getMessage());
}

}
            linea = bufferLectura.readLine();
        }
        if (bufferLectura != null) {
            bufferLectura.close();
        }
    }
}

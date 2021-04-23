package EjerciciosFicheros;


import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static final String SEPARATOR=";";
    public static final String QUOTE="\"";
    public static void leerCSVSimple(String path) throws IOException {

        // Abro el .csv en buffer de lectura
        BufferedReader bufferLectura = new BufferedReader(new FileReader(path));
        int x = 0;
        // Leo una línea del archivo
        String linea = bufferLectura.readLine();
        while (linea != null) {

            // Separa la línea leída con el separador definido previamente
            linea.replace(" ",SEPARATOR);
            String[] campos = linea.split(SEPARATOR);

       /*    Pattern part = Pattern.compile("6_____");
           Matcher mat = part.matcher(campos[x]);
            if (mat.matches()) {
                System.out.println("Si");
            } else {
                System.out.println("no");
            } */
            System.out.println(Arrays.toString(campos));
            // Vuelvo a leer del fichero
            linea = bufferLectura.readLine();
        }
        // CIerro el buffer de lectura
        if (bufferLectura != null) {
            bufferLectura.close();
        }
        x++;
    }

    public static void main(String[] args) throws IOException {
        Ejercicio4.leerCSVSimple("D:\\Educa\\daw1_a\\Downloads\\EjerciciosFicheros\\Restaurantes.csv");
    }
}

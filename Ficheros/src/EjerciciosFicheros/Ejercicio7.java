package EjerciciosFicheros;

import java.io.*;
import java.util.Arrays;

public class Ejercicio7 {
    public static final String SEPARATOR = "/*";
    public static String[] crearArray (String ruta) throws IOException{
        File nuevoArchivoCSV = new File("C:\\Users\\daw1_a\\IdeaProjects\\FicherosyExcepciones\\Ficheros\\src\\EjerciciosFicheros\\copia.csv");
        BufferedReader bufferLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferLectura.readLine();
        String[] campos = linea.split(SEPARATOR);
        for (int i = 0; i < campos.length; i++) {
            System.out.println(campos[i]);
        }
            linea = bufferLectura.readLine();
        return campos;}
     /*   if (bufferLectura != null) {
            bufferLectura.close();
        }

    return "";} */
     public static void main(String[] args) {
       //  System.out.println(Arrays.toString(crearArray()));
     }
}

package EjerciciosFicheros;
import java.io.*;
public class Ejercicio7 {
    //Escribir un programa que contenga un método que reciba por parámetro la ruta de un archivo y devuelva un array
    // con las cadenas que dicho archivo almacena. Las cadenas vienen separadas por un asterisco.
    public static final String SEPARATOR = "\\*";
    public static String[] crearArray (String ruta) throws IOException{
        BufferedReader bufferLectura = new BufferedReader(new FileReader(ruta));
        String linea = bufferLectura.readLine();
        String[] campos = linea.split(SEPARATOR);
        for(int i = 0; i < campos.length ;i++){
            System.out.println(campos[i]);
        }
        return campos;
    }
}

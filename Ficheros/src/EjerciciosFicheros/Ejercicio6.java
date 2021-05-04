package EjerciciosFicheros;
import java.io.*;
public class Ejercicio6 {
//Escribe un programa en Java que encuentre el número más grande en el fichero dataset_91007.txt
        public static final String SEPARADOR = " ";
        public static void numeroAlto(File fichero) throws FileNotFoundException {
            double contador = 0;
            String[] fields = new String[0];
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(fichero));
                String line = br.readLine();
                while (null != line) {
                    fields = line.split(SEPARADOR);
                    line = br.readLine();
                }
            } catch (Exception e) {
                System.out.println("Excepcion");
            } finally {
                if (null != br){
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (int i = 0; i < fields.length; i++) {
                if (Double.parseDouble(fields[i]) > contador) {
                    contador = Double.parseDouble(fields[i]);
                }
            }
            System.out.println("El numero maximo en el documento es: " + contador);
        }
}

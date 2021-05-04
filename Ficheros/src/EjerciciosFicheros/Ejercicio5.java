package EjerciciosFicheros;
import java.io.File;
public class Ejercicio5 {
    public static void borrarArchivo (String ruta){
        File archivoABorrar = new File(ruta);
        File[] hijos = archivoABorrar.listFiles();
        for (File hijo: hijos){
            if (hijo.isDirectory()) {
                borrarArchivo(hijo.getAbsolutePath());
            } else {
                hijo.delete();
            }
        }
        archivoABorrar.delete();
    }
}

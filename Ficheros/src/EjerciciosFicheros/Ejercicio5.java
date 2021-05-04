package EjerciciosFicheros;
import java.io.File;
public class Ejercicio5 {
    //Crear un programa en Java que borre el fichero cuya ruta ha sido introducida por el usuario.
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

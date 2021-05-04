package EjerciciosFicheros;
import java.io.File;
public class Ejercicio1 {
    public static void existe(String direccion){
        File existe = new File(direccion);
        boolean existONo = existe.exists();
        if (existONo) {
            System.out.println("El archivo o directorio con la ruta indicada si existe");
            boolean directorio = existe.isDirectory();
            if (directorio){
                System.out.println("Es un directorio.");
            } else {
                System.out.println("Es un archivo.");
                System.out.println("El nombre del archivo es: " + existe.getName());
                System.out.println("El tamaño del archivo es: " + existe.length());
                System.out.println("Permisos del archivo: ");
                System.out.println("Escritura: " + existe.canWrite());
                System.out.println("Lectura: " + existe.canRead());
            }
        } else {
            System.out.println("El archivo o directorio con la ruta indicada si existe");
        }
        }
    }


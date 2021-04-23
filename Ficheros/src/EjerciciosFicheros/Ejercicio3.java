package EjerciciosFicheros;

import java.io.File;

public class Ejercicio3 {

    public void informacionArchivo (File archivo){
        System.out.println("El nombre del archivo es: " + archivo.getName());
        System.out.println("El tamaño del archivo es: " + archivo.length());
        System.out.println("Permisos del archivo: ");
        System.out.println("Escritura: " + archivo.canWrite());
        System.out.println("Lectura: " + archivo.canRead());
    }
}

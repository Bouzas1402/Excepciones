package EjerciciosFicheros;

import java.io.File;

public class Ejercicio2 {

    public void ficheroODirectorio(String direccion){
File ficheroODirectorio = new File(direccion);

boolean exite = Ejercicio1.existe(direccion);
if (exite) {
    boolean directorio = ficheroODirectorio.isDirectory();
    if (directorio){
        System.out.println("Es un directorio.");
} else {
    System.out.println("Es un archivo.");
}
} else {
        System.out.println("El archivo no existe.");
}
    }
}

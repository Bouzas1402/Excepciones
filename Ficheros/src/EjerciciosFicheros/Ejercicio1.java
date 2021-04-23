package EjerciciosFicheros;

import java.io.File;

public class Ejercicio1 {

    public static boolean existe(String direccion){
        File existe = new File(direccion);
        boolean existONo = existe.exists();
        if (existONo) {
            System.out.println("El archivo o directorio con la ruta indicada si existe");

        } else {
            System.out.println("El archivo o directorio con la ruta indicada si existe");
        }
        return existONo;
    }
}

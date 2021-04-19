package GestorDeArchivos;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class TeoriaLeeryEscribirFicheros {

    public static void main(String[] args) {

        String ruta = "Ficheros\\Quevedo1\\listadoQuevedo.txt";
        try {
//Esta es la forma de Leer un fichero que me servira siempre que quiera necesita importar:
            // import java.nio.file.Files;
            // import java.nio.file.Paths;
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));
            System.out.println(contenido);
        } catch (IOException ioe) {
            System.out.println("Problema con el :" + ioe.getMessage());
        }


    }


    // Es la forma tradicional de leer un fichero,con un for pero podria ser con un while
    public void leerPorScanner() {
        String ruta = "Ficheros\\Quevedo1\\listadoQuevedo.txt";
        File fichero = new File(ruta);
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fichero.exists());

        try {
            try (Scanner sc = new Scanner(fichero)) {
                for (int i = 0; i < fichero.length(); i++) {
                    System.out.println(sc.nextLine());
                }

            } catch (
                    FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}

package EjerciciosFicheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio9 {
    // Escribir un programa que obtiene la línea de mayor tamaño y la de menor tamaño dentro de un fichero de texto.
    public static void tamañoLineas(File fichero) throws FileNotFoundException {
        ArrayList<String> lineasFichero = new ArrayList<>();
        int contadorMayor = 0;
        int contadorMenor = 0;
        try (Scanner sc = new Scanner(fichero)){
            while (sc.hasNext()){
                lineasFichero.add(sc.nextLine());
            }
            contadorMenor = lineasFichero.get(0).length();
            for (int i = 0; i < lineasFichero.size(); i++) {
                if (contadorMayor < lineasFichero.get(i).length()) {
                    contadorMayor = lineasFichero.get(i).length();
                }
                if (contadorMenor > lineasFichero.get(i).length()) {
                    contadorMenor = lineasFichero.get(i).length();
                }
            }
        } catch (Exception e){
            e.getMessage();
        }
        System.out.println("El tamaño minimo de linea es: " + contadorMenor);
        System.out.println("El tamaño maximo de linea es: " + contadorMayor);
    }
}

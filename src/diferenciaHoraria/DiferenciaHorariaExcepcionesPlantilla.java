package diferenciaHoraria;

import java.util.Scanner;

public class DiferenciaHorariaExcepcionesPlantilla {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // LLamar a los métodos necesarios de forma que
        // 1. Pedimos hh:mm:ss iniciales y hh:mm:ss finales
        int [] momento1 = pedirHora();
        int [] momento2 = pedirHora();  // introducir un momento2 anterior a momento1; controlar que no pueda suceder esto

        // 2. Pasar a segundos
        int s1 = convertirASegundos(momento1);
        int s2 = convertirASegundos(momento2);

        // 3. Calculamos la diferencia
        int diferencia = calcularDiferencia(s1, s2);

        // 4. Convertirmos la diferencia a String
        String difString = convertirSegundosEnString(diferencia);

        // 5. La mostramos por pantalla
        mostrarDiferencia(difString);


        // Los cinco pasos anteriores en una única línea
        //mostrarDiferencia(convertirSegundosEnString(calcularDiferencia(convertirASegundos(pedirHora()), convertirASegundos(pedirHora()))));
    }

    public static int[] pedirHora() {

        // Se pide introducir la hora en formato "HH:MM:SS"
        System.out.println("Introduce la hora en formato \"HH:MM:SS\"");

        /* Se recoge en un String que se "parsea" a tres enteros utilizando
        métodos de la clase String para extraer las hh, mm y ss */
        String hhmmss = sc.next();  // EXCEPCIÓN -> introducir algo que sea otro formato que no vaya a poder ser recogido por los substring que vienen luego

        String hh = hhmmss.substring(0,2);
        String mm = hhmmss.substring(3,5);
        String ss = hhmmss.substring(6,8);
        //System.out.println(hh + " " + mm + " " + ss);

        int h = Integer.parseInt(hh); // EXCEPCIÓN -> introducir en la cadena "HH:MM:SS" algo diferente a números
        int m = Integer.parseInt(mm);
        int s = Integer.parseInt(ss);
        // System.out.println(h + " " +  m + " " + s);

        // Se devuelve un array con las horas, minutos y segundos
        int[] hms = {h, m, s};
        return hms;
    }

    public static int convertirASegundos(int[] array) {
        // Recibe un array de 3 enteros y los convierte a segundos
        int hSegundos = array[0] * 3600;
        int mSegundos = array[1] * 60;
        int segundos = hSegundos + mSegundos + array[2]; // EXCEPCIÓN -> QUE PROGRAMANDO NOS EQUIVOQUEMOS Y PONGAMOS array[3]
        return segundos;
    }

    public static int calcularDiferencia(int momentoInicial, int momentoFinal) {
        // Calcula y devuelve la diferencia entre ambos momentos (en segundos)
        return momentoFinal - momentoInicial;
    }

    public static String convertirSegundosEnString(int segundos) {
        // Recibe una cantidad de segundos y calcula las hh, mm y ss
        int difHoras = segundos / 3600;
        int resto = segundos % 3600;
        int difMinutos = resto / 60;
        int difSegundos = resto % 60;
        // Convierte hh, mm y ss en String y los concatena en una única cadena de texto
        String hh, mm, ss;
        if (difHoras < 10) {
            hh = "0" + Integer.toString(difHoras);
        } else {
            hh = Integer.toString(difHoras);
        }

        if (difMinutos < 10) {
            mm = "0" + Integer.toString(difMinutos);
        } else {
            mm = Integer.toString(difMinutos);
        }

        if (difSegundos < 10) {
            ss = "0" + Integer.toString(difSegundos);
        } else {
            ss = Integer.toString(difSegundos);
        }
        return hh + ":" + mm + ":" + ss;
    }

    public static void mostrarDiferencia(String cadena) {
        // Recibe una cadena de texto y la muestra por pantalla
        System.out.println(cadena);
    }
}

package diferenciaHoraria;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class diferenciaHorariaMetodo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean marcador;
        // hacer las llamadas correspondientes
        // LLamar a los métodos necesarios de forma que
        // 1. Pedimos hh:mm:ss iniciales y hh:mm:ss finales
        do {
            marcador = true;
            imprimirCadena(convertirAHorario(calcularDiferencia(convertirASegundos(pedirHora()),convertirASegundos(pedirHora()))));
            System.out.println("¿Quieres seguir calculando tiempos? (S/N)");
            if (sc.next().toLowerCase().charAt(0) == 'n'){
                sc.nextLine();
            marcador = false;
            }
     } while (marcador);
    }
    // pedirMomento() : int[3]
    // pide una cadena de texto "HH-MM-SS"
    // a continuacion convierto String a entero (int num = Integer.parseInt("12");) (Sacar tres String
    // uno de HH otro de MM y otro de SS.
    // Los meto en un array de enteros
    // Con esto completaremos la priemra parte del codigo diferenciaHoraria
    public static int[] pedirHora() {
        // Se pide introducir la hora en formato "HH:MM:SS"
        int[] array = new int[3];
        boolean y;
        String momento;
      do {
          System.out.println("Introduzca un momento: (Formato HH:MM:SS)");
          momento = sc.nextLine();
          Pattern x = Pattern.compile("[0-9]{2}[:][0-9]{2}[:][0-9]{2}");
          Matcher z = x.matcher(momento);
          y = z.find();
          if (y == false){
              System.out.println("Formato incorrecto, vuela a escribirlo, en formato HH:MM:SS");
          }
      } while (!y);
      y = true;
        /* Se recoge en un String que se "parsea" a tres enteros utilizando
        métodos de la clase String para extraer las hh, mm y ss
        Método parseInt de la clase Integer para convertir String a entero
        Ejemplo de parseInt: int num = Integer.parseInt("123"); */
        String hh = momento.substring(0,2);
        int HH = Integer.parseInt(hh);
        String mm = momento.substring(3,5);
        int MM = Integer.parseInt(mm);
        String ss = momento.substring(6,8);
        int SS = Integer.parseInt(ss);
        array[0] = HH;
        array[1] = MM;
        array[2] = SS;
        // Se devuelve un array con las horas, minutos y segundos
        return array; // reemplazar por la variable o expresión correspondiente
    }
    // Metodo convertirASegundos (Array[] int HHMMSS) : int (convierte a segudnos)
public static int convertirASegundos (int[] HHMMSS){
        return (((HHMMSS[0] * 60) + HHMMSS[1]) * 60) + HHMMSS[2];
}
    // calcularDiferencia (int momento1, momento2) : int (en segundos) calcula la diferencia en segundos
public static int calcularDiferencia (int momento1, int momento2){
        return momento2 - momento1;
}
    // convertirAHorario (int segundos) : String recibe un numero de segundos y estrae las horas que contiene los minutos y los segundos
    //y los convierte en un String con la forma HH-MM-SS String HH = Integer.toString(12);
public static String convertirAHorario (int diferenciaMomentos){
        int segundos = diferenciaMomentos % 60;
        int minutos = (diferenciaMomentos / 60) % 60;
        int horas = ((diferenciaMomentos / 60) / 60);
        String horas1;
        String minutos1;
        String segundos1;
        if (horas < 10) {
            horas1 = "0" + Integer.toString(horas);
        } else {
            horas1 = Integer.toString(horas);
        }
    if (horas < 10) {
        minutos1 = "0" + Integer.toString(minutos);
    } else {
        minutos1 = Integer.toString(minutos);
    }
    if (segundos < 10) {
        segundos1 = "0" + Integer.toString(segundos);
    } else {
        segundos1 = Integer.toString(segundos);
    }

        String momentoFinalHHMMS = horas1 + ":" + minutos1 + ":" + segundos1;
        return momentoFinalHHMMS;
}
    // imprimirCadena (String cadena) imprimir el dato pasado por parametro
public static void imprimirCadena (String cadena){
    System.out.println("La diferencia de momentos es : " + cadena);
}
}

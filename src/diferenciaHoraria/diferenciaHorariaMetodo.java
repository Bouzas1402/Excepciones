package diferenciaHoraria;

import java.util.Scanner;

public class diferenciaHorariaMetodo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // hacer las llamadas correspondientes
        System.out.println("Introduzca un segundo momento: (En HH-MM-SS)");
        String momento2 = sc.nextLine();
        String m1HH = momento2.substring(0,2);
        int num1 = Integer.parseInt(m1HH);
        System.out.println(num1);
    }

    // pedirMomento() : int[3]
    // pide una cadena de texto "HH-MM-SS"
    // a continuacion convierto String a entero (int num = Integer.parseInt("12");) (Sacar tres String
    // uno de HH otro de MM y otro de SS.
    // Los meto en un array de enteros
    // Con esto completaremos la priemra parte del codigo diferenciaHoraria

   /* public static int[] pedirMomento(){
        System.out.println("Introduzca un momento inicial: (En HH-MM-SS)");
        String momento1 = sc.nextLine();
        System.out.println("Introduzca un segundo momento: (En HH-MM-SS");
        String momento2 = sc.nextLine();
        String m1HH = momento1.substring(0,1);
        int num1 = Integer.parseInt(m1HH);

    } */


    // Metodo convertirASegundos (Array[] int HHMMSS) : int (convierte a segudnos)



    // calcularDiferencia (int momento1, momento2) : int (en segundos) calcula la diferencia en segundos

    // convertirAHorario (int segundos) : String recibe un numero de segundos y estrae las horas que contiene los minutos y los segundos
    //y los convierte en un String con la forma HH-MM-SS String HH = Integer.toString(12);

    // imprimirCadena (String cadena) imprimir el dato pasado por parametro



}

package diferenciaHoraria;

import java.util.Scanner;

public class diferenciaHoraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Momento inicial:");
        System.out.println("================");
        System.out.println("Introduce la hora: ");
        int h0 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int m0 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int s0 = sc.nextInt();

        System.out.println("Momento final:");
        System.out.println("==============");
        System.out.println("Introduce la hora: ");
        int h1 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int m1 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int s1 = sc.nextInt();
        System.out.println("Datos introducidos: momento inicial: " + h0 + ":" + m0 + ":" + s0 +
                "     momento final: " + h1 + ":" + m1 + ":" + s1);
        System.out.println();
        System.out.println();
        System.out.println();

        //Ahora pasamos ambos momentos a segundos, para poder calcular la diferencia:
        int h0EnSegundos = h0 * 60 * 60;
        int h1EnSegundos = h1 * 60 * 60;
        int m0EnSegundos = m0 * 60;
        int m1EnSegundos = m1 * 60;

        // Calculo el momento inicial en segundos y lo mismo para el momento final
        int momentoInicialEnSegundos = h0EnSegundos + m0EnSegundos + s0;
        int momentoFinalEnSegundos = h1EnSegundos + m1EnSegundos + s1;

        // Calculo la diferencia entre ambos momentos
        int diferencia = momentoFinalEnSegundos - momentoInicialEnSegundos;

        //Convierto la diferencia en horas, minutos y segundos, y la muestro por pantalla
        int difHoras = diferencia / 3600;
        int resto = diferencia % 3600;
        int difMinutos = resto / 60;
        int difSegundos = resto % 60;

        //Muestro la diferencia entre ambos momentos por pantalla
        System.out.println("La diferencia entre ambos momentos es: " + difHoras + ":" + difMinutos + ":" + difSegundos);
    }
}

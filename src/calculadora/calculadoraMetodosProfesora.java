package calculadora;

import java.util.Scanner;

public class calculadoraMetodosProfesora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            // cargamos el menú
            char opción = menú();
            // pasamos lo que devuelve el menú al selector
            selector(opción);
            // hacemos operaciones...
            // preguntar si salimos
            System.out.println("¿Deseas salir? (s/n)");
            if (sc.next().toLowerCase().charAt(0) == 's')
                salir = true;
        }
    }

    // pedirNúmero devuelve double
    public static double pedirNúmero() {
        System.out.println("Introduce un número: ");
        double num = sc.nextDouble();
        sc.nextLine();
        return num;
    }

    // menú -> devuelve char
    public static char menú() {
        System.out.println("¿Qué operación quieres realizar? (+, -, *, /");
        //char opción = sc.next().charAt(0);
        //return opción;
        // O bien
        return sc.next().charAt(0);
    }

    // selector -> recibe un char y llama a los metodos correspondientes
    public static void selector(char opción) {
        switch (opción) {
            case '+':
                System.out.println("Resultado: " + suma(pedirNúmero(), pedirNúmero()));
                break;
            case '-':
                System.out.println("Resultado: " + resta(pedirNúmero(), pedirNúmero()));
                break;
            case '*':
                System.out.println("Resultado: " + multiplicación(pedirNúmero(), pedirNúmero()));
                break;
            case '/':
                System.out.println("Resultado: " + división(pedirNúmero(), pedirNúmero()));
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    // suma
    public static double suma(double a, double b) {
        return a + b;
    }

    // resta
    public static double resta(double a, double b) {
        return a - b;
    }

    // multiplicación
    public static double multiplicación(double a, double b) {
        return a * b;
    }

    // división
    public static double división(double a, double b) {
        return a / b;
    }


}

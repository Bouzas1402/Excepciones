package calculadora;

import java.util.Scanner;

public class calculadoraMetod {
    static Scanner sc = new Scanner(System.in);
    private static boolean repeticion;
    private double num1;
    private double num2;
    private char operacion;
int contador = 0;
    public static void main(String[] args) {

// cargamos el menu
        do {

        } while (repeticion == true);

        //pasamos lo que devuelve el menu al selector
        //hacemos operaciones
        //preguntar si salimos



    }

// pedirNumero devuelve double

    public double pedirNumero() {
        if (contador == 0){
            System.out.println("Introduzca el primer numero: ");
        this.num1 = sc.nextDouble();
        sc.nextLine();
        contador++;
        return num1;
        } else {
            System.out.println("¿Porque numero lo quiere " + operacion + " : ");
            this.num2 = sc.nextDouble();
            sc.nextLine();
            return num2;
        }
    }

    // menu -> devuelve char
    public char menu() {

        System.out.println("¿Qué operación quiere realizar?: ");
        this.operacion = sc.next().charAt(0);
        pedirNumero();
        pedirNumero();
        return operacion;
    }

    // selector, recibe un char y llama a los metodos correspondientes (suma,resta,multiplicacion,division)
    public void selector(char operacion){
        switch (operacion){
            case '+':
                System.out.println(suma());
                break;
            case '-':
                System.out.println(resta());
                break;
            case '*':
                System.out.println(multiplicacion());
                break;
            case '/':
                System.out.println(division());
                break;

        }

    }

    //suma
    public double suma() {
        double resultado = this.num1 + this.num2;
        return resultado;
    }

    //resta

    public double resta() {
        double resultado = this.num1 - this.num2;
        return resultado;
    }

    //multiplicacion
    public double multiplicacion() {
        double resultado = this.num1 * this.num2;
        return resultado;
    }

    //division

    public double division() {
        double resultado = this.num1 / this.num2;
        return resultado;
}

}

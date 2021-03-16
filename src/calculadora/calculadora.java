package calculadora;

import java.util.Scanner;

public class calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer operando:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo operando:");
        int num2 = sc.nextInt();

        System.out.println("¿Qué operación quieres realizar? (+, -, *, /");
        char operacion = sc.next().charAt(0);

        if (num1 >= 0 && num2 >=0) { // comprobamos que ambos números sean positivos
            switch (operacion) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                default:
                    System.out.println("Operación incorrecta.");
            }
        } else { // si alguno de los números o ambos son negativos, se le dice al usuario
            System.out.println("Los números deben ser positivos.");
        }
    }
}

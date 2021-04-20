import java.util.Scanner;
public class Cajero {
    /* Crea una clase llamada PrincipalCuenta en el mismo paquete que Cuenta.
Debe contener el método main */
//  Dentro del método main:
    static Scanner sc = new Scanner(System.in);
    public static void cajero(Cuenta cuenta) {
        int opciones;
        boolean salir = false;
        while (salir == false) {
            System.out.println("¿Qué operación desea realizar? \n1. Ingresar dinero \n2. Retirar dinero \n3. Consultar saldo \n4. Salir");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    // Pedir cantidad y llamar al método.
                    System.out.println("¿Cuanto dinero quieres ingresar?");
                    double cantidad = sc.nextInt();
                    Sucursal.ingresar(cuenta,cantidad);
                    break;
                case 2:
                    // Pedir cantidad y llamar al método.
                    System.out.println("¿Cuanto dinero quierer retirar?");
                    cantidad = sc.nextInt();
                    Sucursal.retirar(cuenta, cantidad);
                    break;
                case 3:
                    // Consultar saldo
                    cuenta.imprimir();
                    break;
                case 4:
                    // Salir
                    break;
                default:
                    System.out.println("Operación desconocida.");
            }
            System.out.println("¿Desea realizar otra operación? S/N");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 'n')
                salir = true;
        }
    }
}

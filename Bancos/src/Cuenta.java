public class Cuenta {
    /* Escribe una clase llamada Cuenta. Debe contener cuatro atributos:
   saldo, de tipo long;
   titular de tipo String,
   número, de tipo long, y
   bloqueada de tipo boolean,
*/
    private String titular;
    private String numero;
    private double saldo;
    private boolean bloqueada;

    /* También debe contener :
    - Un constructor con dos parámetros (titular y número).
    - Un constructor con tres parámetros (titular, número y saldo),
    para inicializar estos atributos.

    Todas las cuentas se crean desbloqueadas*/
    public Cuenta(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        //this.bloqueada = false;
    }

    public Cuenta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    /* Añade los getter y setter para todos los atributos */

    public String getTitular() {
        return titular;
    }

    // no creamos setter para el titular porque no se puede cambiar el titular de una cuenta

    public String getNumero() {
        return numero;
    }

    // no creamos setter porque no se puede cambiar un número de cuenta

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    /* Define el método ingresar(long):long, que consiste en comprobar si la cuenta está bloqueada
    y, en caso de no estarlo, añadir una cantidad al saldo.
     */
    public double ingresar(double cantidad) {
        if (bloqueada == false) {
            this.saldo = this.saldo + cantidad;
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return saldo;
    }

    /* Define el método retirar(long):long,
    en este caso, si la cuenta no está bloqueada y
    la cantidad a retirar es mayor que el saldo,
    hay que indicar: "Saldo insuficiente"
     En caso contrario hay que indicar el saldo que le queda.
     */


    /* Define el método imprimir, que visualiza :
    "El titular ... con número de cuenta ... tiene un saldo de ... euros."*/
    public void imprimir() {
        System.out.println("El titular " + this.titular + " con número de cuenta "
                + this.numero + " tiene un saldo de " + this.saldo + " euros.");
    }




}

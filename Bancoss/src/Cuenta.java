import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cuenta {
    /* Escribe una clase llamada Cuenta. Debe contener cuatro atributos:
   saldo, de tipo long;
   titular de tipo String,
   número, de tipo long, y
   bloqueada de tipo boolean,
*/
    private String titular;
    private String iban;
    private double saldo;
    private boolean bloqueada;

    /* También debe contener :
    - Un constructor con dos parámetros (titular y número).
    - Un constructor con tres parámetros (titular, número y saldo),
    para inicializar estos atributos.

    Todas las cuentas se crean desbloqueadas*/
    // Contructor sin saldo de inicio
    public Cuenta(String titular, String iban) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = 1;
        //this.bloqueada = false;
        escribirMovimiento(iban, String.valueOf(this.saldo));
    }

    // constructor con saldo de inicio
    public Cuenta(String titular, String iban, double saldo) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
       escribirMovimiento(iban, String.valueOf(saldo));
    }

public String crearRuta(String iban) {
    String ruta = "Bancoss\\" + sacarCodigoBanco(iban) + "\\" + sacarCodigoSucursal(iban) + "\\" + sacarCodigo(iban);
    File carpetaCuenta = new File(ruta);
    boolean directorioCreado = carpetaCuenta.mkdirs();
    if (directorioCreado) {
        System.out.println("Se creó correctamente.");
    } else {
        System.out.println("No se creo.");
    }
    return ruta;
}

public String sacarCodigoBanco (String iban){
        return iban.substring(4,8);
}
public String sacarCodigoSucursal (String iban){
        return iban.substring(8,12);
}
public String sacarCodigo (String iban){
        return iban.substring(14,24);
}

public String crearMovimientos (String iban) {
        String ruta = crearRuta(iban) + "\\Movimientos.txt";
    File movimientos = new File(ruta); // La primera linea tiene que ser el saldo
    try {
        movimientos.createNewFile();
    } catch (IOException e) {
        e.printStackTrace();
    }
        return ruta;
}

public void escribirMovimiento(String iban, String texto){
        String ruta = crearMovimientos(iban);
        File f = new File(ruta);
    try (FileWriter f1 = new FileWriter(f,true);) {
         PrintWriter escribir = new PrintWriter(f1);
escribir.println(texto);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    /* Añade los getter y setter para todos los atributos */

    public String getTitular() {
        return titular;
    }

    // no creamos setter para el titular porque no se puede cambiar el titular de una cuenta

    public String getIban() {
        return iban;
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
    public double retirar(double cantidad) {
        if (bloqueada == false) {
            if (saldo < cantidad){
                System.out.println("No hay dinero suficiente en la cuenta");
            } else {
                this.saldo = this.saldo - cantidad;
            }
            } else {
            System.out.println("Cuenta bloqueada");
        }
        return saldo;
    }


    /* Define el método imprimir, que visualiza :
    "El titular ... con número de cuenta ... tiene un saldo de ... euros."*/
    public void imprimir() {
        System.out.println("El titular " + this.titular + " con número de cuenta "
                + this.iban + " tiene un saldo de " + this.saldo + " euros.");
    }




}

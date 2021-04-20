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
    //Todas las cuentas se crean desbloqueadas
    // constructor con dos parámetros (titular y número).
    public Cuenta(String titular, String iban) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = 1;
        String ruta = crearRutaCuenta(iban);
        File carpetaCuenta = new File(ruta);
        boolean directorioCreado = carpetaCuenta.mkdirs();
        if (directorioCreado) {
            System.out.println("Se creó correctamente.");
        } else {
            System.out.println("No se creo.");
        }
        escribirMovimiento(iban,String.valueOf(saldo));
        //this.bloqueada = false;
    }

    // constructor con tres parámetros (titular, número y saldo)
    public Cuenta(String titular, String iban, double saldo) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
        String ruta = crearRutaCuenta(iban);
        File carpetaCuenta = new File(ruta);
        boolean directorioCreado = carpetaCuenta.mkdirs();
        if (directorioCreado) {
            System.out.println("Se creó correctamente.");
        } else {
            System.out.println("No se creo.");
        }
        escribirMovimiento(iban,String.valueOf(saldo));
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
            escribirMovimiento(this.iban,String.valueOf(cantidad));
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return saldo;
    }


    public double retirar(double cantidad) {
        if (bloqueada == false) {
            if (this.saldo < cantidad) {
                System.out.println("No hay saldo suficiente.");
            } else {
                this.saldo = this.saldo - cantidad;
                escribirMovimiento(this.iban, "-" + String.valueOf(cantidad));
            } } else{
                System.out.println("Cuenta bloqueada");
            }
            return saldo;
    }


    public void imprimir() {
        System.out.println("El titular " + this.titular + " con número de cuenta "
                + this.iban + " tiene un saldo de " + this.saldo + " euros.");
    }


    //Metodo para sacar rutas de cuentas a partir de un IBAN
    public String crearRutaCuenta(String iban) {
        String ruta = "Bancos\\" + sacarCodigoBanco(iban) + "\\" + sacarCodigoSucursal(iban) + "\\" + sacarCodigo(iban);
        return ruta;
    }

    //Metodo para sacar el codigo del banco a partir de un IBAN
    public String sacarCodigoBanco (String iban){
        return iban.substring(4,8);
    }
    //Metodo para sacar el codigo de ola sucursal a partir de un IBAN
    public String sacarCodigoSucursal (String iban){
        return iban.substring(8,12);
    }
    //Metodo para sacar el codigo del cliente a partir de un IBAN
    public String sacarCodigo (String iban){
        return iban.substring(14,24);
    }

//Metodo que sirve para escribir un movimiento en el documento Movimientos.txt y modifica la linea de del saldo del archivo extracto.txt si existiera
    public void escribirMovimiento(String iban, String texto){
        String ruta = crearRutaCuenta(iban) + "\\Movimientos.txt";
        File f = new File(ruta);
        try (FileWriter f1 = new FileWriter(f,true);) {
            PrintWriter escribir = new PrintWriter(f1);
            escribir.println(texto);
        } catch (IOException e) {
            System.out.println("Excepcion de E/S: " + e.getMessage());
        }
        String rutaExtracto = crearRutaCuenta(iban) + "\\Extracto.txt";

        File extracto = new File(rutaExtracto);
        boolean extractoSoN = extracto.exists();
        if (extractoSoN) {
            try {
                FileWriter esribirMovimiento = new FileWriter(extracto);
                esribirMovimiento.write("Saldo total de la cuenta: " + this.saldo);
                esribirMovimiento.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

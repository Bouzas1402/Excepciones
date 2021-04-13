import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Sucursal {

    private String entidad;
    private String oficina;
    private ArrayList<Cuenta> cuentas;


    //* Constructor: se crea con una entidad y una oficina pasadas por parámetro. Al crearse una
    //oficina, se crea en la carpeta del módulo Banco un directorio llamado cuentas.
    public Sucursal (String entidad, String oficina){
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        this.cuentas = cuentas;
        this.entidad = entidad;
        this.oficina = oficina;
File d1 = new File("C:\\Users\\daw1_a\\IdeaProjects\\Excepciones\\Bancos\\Cuentas" + oficina);
boolean d1Creado = d1.mkdirs();
if (d1Creado){
    System.out.println("El directorio a sido creado.");
} else {
    System.out.println("El directorio ya existe o se creo correctamente.");
}
    }


    //void crearCuenta(titular, número, saldo)
    //Crea una cuenta con el titular pasado por parámetro; debe construirse el iban
    //completo antes de asignarse a la cuenta. Si no se proporciona una cantidad concreta,
    //la cuenta se crea con un saldo de 1€.
    //Una vez creada, la añade al ArrayList de cuentas de la entidad.
    //Al crearse una cuenta, se crea una carpeta cuyo nombre es su número.txt, en
    //el que se irán registrando los movimientos. Estos ficheros se ubicarán en una carpeta
    //llamada cuentas en la carpeta del proyecto.
public void crearCuenta(String titular, String numero, double saldo){
if (saldo == 0) {
    Cuenta cuenta1 = new Cuenta(titular, numero, 1);
    cuentas.add(cuenta1);
} else {
    Cuenta cuenta1 = new Cuenta(titular, numero, saldo);
    cuentas.add(cuenta1);
}
String raiz = "C:\\Users\\daw1_a\\IdeaProjects\\Excepciones\\Bancos\\Cuentas";
File directorio = new File(raiz + this.oficina + "\\" + numero);
boolean directorioCreado = directorio.mkdirs();
    if (directorioCreado) {
        System.out.println("El directorio se creo correctamente.");
    } else {
        System.out.println("El directorio ya existe.");
    }

    File archivoMov = new File(raiz + this.oficina + "\\" + numero + "\\Movimientos.txt");
try{
    boolean creado = archivoMov.createNewFile();
    if (creado) {
        System.out.println("El archivo se creo correctamente.");
    } else {
        System.out.println("El archivo ya existe.");
    }
} catch (IOException ioe) {
    System.out.println("no se puede crear el archivo " + archivoMov.getPath());
}
    }


//double retirar(Cuenta cuenta, double cantidad)
//El método retirar en vez de estar en la clase Cuenta lo trasladamos a la clase
//Sucursal, con las modificaciones que consideres necesarias.
//Cada vez que se retira dinero de una cuenta, se anota el movimiento
//correspondiente en el fichero movimientos.txt dentro de la carpeta
//cuentas\numero_de_cuenta (si alguna de las carpetas no existe, hay que crearla)
    public double retirar(Cuenta cuenta, double cantidad) {
        if (cuenta.isBloqueada() == false) {
            if (cantidad <= cuenta.getSaldo()) {
                cuenta.setSaldo(cuenta.getSaldo() - cantidad);
                System.out.println("Saldo resultante: " + cuenta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return cuenta.getSaldo();
    }

    //double ingresar(Cuenta cuenta, double cantidad)
    //El método ingresar en vez de estar en la clase Cuenta lo trasladamos a la clase
    //Sucursal, con las modificaciones que consideres necesarias.
    //Cada vez que se ingresa dinero de una cuenta, se anota el movimiento
    //correspondiente en el fichero movimientos.txt dentro de la carpeta
    //cuentas\numero_de_cuenta (si alguna de las carpetas no existe, hay que crearla)
    public double ingresar(Cuenta cuenta, double cantidad) {
        if (cuenta.isBloqueada() == false) {
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return cuenta.getSaldo();
}

public void bloquearCuenta (Cuenta cuenta) {
        if (cuenta.isBloqueada() == false) {
            cuenta.setBloqueada(true);
            File bloqueados = new File("C:\\Users\\daw1_a\\IdeaProjects\\Excepciones\\Bancos\\Cuentas" + oficina + "\\Bloqueados");
            boolean VoF = bloqueados.exists();
            if (VoF == false){
                boolean creado = bloqueados.mkdir();
                if(creado) {
                    System.out.println("Se creo correctamente.");
                } else {
                    System.out.println("No se creo.");
                }
            }
        }

}

}

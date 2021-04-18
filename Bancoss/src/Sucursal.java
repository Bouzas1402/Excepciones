import javax.imageio.IIOException;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

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
File d1 = new File("\\Bancoss" + entidad + "\\" + oficina);
boolean d1Creado = d1.mkdirs();
if (d1Creado){
    System.out.println("El directorio a sido creado.");
} else {
    System.out.println("El directorio ya existe o se creo correctamente.");
}
    }

    public String getEntidad() {
        return entidad;
    }

    public String getOficina() {
        return oficina;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    // String generarCC()
    //Genera aleatoriamente un número entre 0 y 99 y lo devuelve en forma de String de 2
    //caracteres.
    public String generarCC(){
        int x = (int)(Math.random()*99);
        String y;
        if (x < 10) {
            y = "0" + String.valueOf(x);
        } else {
            y = String.valueOf(x);
        }
        return y;
    }

    //String generarNúmeroCuenta()
    //Genera 10 cifras aleatoriamente y las une en un único String.
    //Antes de devolver ese String, comprueba que no existe ese número de cuenta en la
    //sucursal; si existe, debe generar otro número y volver a hacer la comprobación, y así
    //hasta que tengamos un número de cuenta no existente.
    public String generarNumeroCuenta(){
        String numeroCuenta = "";
        boolean repetirNumero;
        do {
            repetirNumero = false;
            for (int i = 0; i < 10; i++) {
                numeroCuenta = numeroCuenta + (int) (Math.random() * 9);
            }
            for (int i = 0; i < cuentas.size(); i++) {
                if (cuentas.get(i).getIban().substring(14, 24).equalsIgnoreCase(numeroCuenta)) {
                    repetirNumero = true;
                }
            }
        } while (repetirNumero);

        return numeroCuenta;
    }


    //String generarIBAN()
    public String generarIBAN(){
        return "ES" + generarCC() + entidad + oficina + generarCC() + generarNumeroCuenta();
    }


// void crearCuenta(titular, saldo)
//Para crear una cuenta sólo necesitamos que nos digan titular y saldo inicial.
//El IBAN se genera llamando al método correspondiente.
//Una vez creada una cuenta, se añade al ArrayList de cuentas de la sucursal.
    public void crearCuenta(String titular, double saldo) {
        Cuenta c1 = new Cuenta(titular, generarIBAN(), saldo);
        cuentas.add(c1);
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
                cuenta.escribirMovimiento(cuenta.getIban(),"-" + String.valueOf(cantidad));
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
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
cuenta.escribirMovimiento(cuenta.getIban(),String.valueOf(cantidad));
        } else {
            System.out.println("Cuenta bloqueada");
        }
        return cuenta.getSaldo();
}

public void generarExtracto (Cuenta cuenta){
        String ruta = cuenta.crearRuta(cuenta.getIban());
        File extracto = new File(ruta + "\\Extracto.txt");
        try {
            boolean creado = extracto.createNewFile();
        } catch (IOException e){
            System.out.println("No se puede crear el archivo: " + extracto.getPath());
        }
        String nombreTitular = "Nombre del titular: " + cuenta.getTitular();
        String ibanCuenta = "IBAN de la cuenta es: " + cuenta.getIban();
        double saldoPositivo = 0;
        double saldoNegativo = 0;
    File x = new File(ruta + "\\Extracto.txt");
   /*  try {

        Scanner sc = new Scanner(x);

        while (sc.hasNext()) {
            String saldo1 = sc.nextLine();
            double saldo = Integer.parseInt(saldo1);
            if (saldo < 0) {
                saldoNegativo = saldoNegativo - saldo;                !!!!   Hace falta saber com sacar el valor de una linea de un archivo
            } else {
                saldoPositivo = saldoPositivo + saldo;
            }
        }
        for (int i = 0; i < x.length(); i++) {
            String saldo1 = sc.nextLine();
            double saldo = Integer.parseInt(saldo1);
            if (saldo < 0) {
                saldoNegativo = saldoNegativo - saldo;
            } else {
                saldoPositivo = saldoPositivo + saldo;
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }*/
    String saldoPositivoExtracto = "Los ingresos totales han sido: " + String.valueOf(saldoPositivo);
    String saldoNegativoExtracto = "Los reintegros totales han sido: " + String.valueOf(saldoNegativo);
String saldoTotal = "Saldo total de la cuenta: " + String.valueOf((cuenta.getSaldo()));
    try (FileWriter f1 = new FileWriter(x,true);) {
        PrintWriter escribir = new PrintWriter(f1);
        escribir.println(nombreTitular);
        escribir.println(ibanCuenta);
        escribir.println(saldoPositivoExtracto);
        escribir.println(saldoNegativoExtracto);
        escribir.println(saldoTotal);
    } catch (IOException e) {
        e.printStackTrace();
    }

}

public void bloquearCuenta (Cuenta cuenta) {
    if (cuenta.isBloqueada() == false) {
        cuenta.setBloqueada(true);
        String raizBloqueados = "Bancoss\\" + this.entidad + "\\" + this.oficina + "\\Bloqueados";
        File bloqueados = new File(raizBloqueados);
        boolean VoF = bloqueados.mkdirs();
        if (VoF == true) {
            System.out.println("Se creo correctamente.");
        } else {
            System.out.println("No se creo.");
        }
        String rutaCuenta = "Bancoss\\" + this.entidad + "\\" + this.oficina + "\\" + cuenta.sacarCodigo(cuenta.getIban());
        File cambioCuenta = new File(rutaCuenta);
        boolean mover = cambioCuenta.renameTo(new File(raizBloqueados + "\\" + cuenta.sacarCodigo(cuenta.getIban())));
        if (mover) {
            System.out.println("Se movio el directorio");
        } else {
            System.out.println("No se movio el directorio");
        }
    }


}
}



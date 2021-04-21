import java.io.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Sucursal sucursal1444 = new Sucursal("1210","1444");
        Sucursal sucursal1515 = new Sucursal("0049","1515");
        Sucursal sucursal0666 = new Sucursal("2085","0666");
        Cuenta cuenta144401 = new Cuenta("Carlos Bouzas", "ES0012101444320000000001");
        Cuenta cuenta144402 = new Cuenta("Alvaro Garrido", "ES0012101444320000000002");
        Cuenta cuenta144403 = new Cuenta("Carlota Mato", "ES0012101444320000000003");
        Cuenta cuenta151501 = new Cuenta("Patricia Chilat","ES0000491515320000000001");
        Cuenta cuenta151502 = new Cuenta("Ana Alvaro","ES0000491515320000000002");
        Cuenta cuenta151503 = new Cuenta("Pedro Cobos", "ES0000491515320000000003");
        Cuenta cuenta066601 = new Cuenta("Lucia Vega", "ES0020850666320000000001");
        Cuenta cuenta066602 = new Cuenta("Pablo Perez", "ES0020850666320000000002");
        Cuenta cuenta066603 = new Cuenta("Elena Herrero","ES0020850666320000000003");
        Sucursal.ingresar(cuenta144401,1000);
        Sucursal.retirar(cuenta144401,200);
        Sucursal.retirar(cuenta144401,100);
        Sucursal.ingresar(cuenta144401,1250);
        Sucursal.retirar(cuenta144401,50);
        Sucursal.retirar(cuenta144401,50);
        sucursal0666.generarExtracto(cuenta144401);
        sucursal0666.bloquearCuenta(cuenta151501);
        sucursal0666.bloquearCuenta(cuenta066602);
        Cajero.cajero(cuenta144401);
    }
}



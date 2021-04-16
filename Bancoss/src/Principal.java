import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

      Sucursal s1 = new Sucursal("0985","6789" );

s1.crearCuenta("Carlos Bouzas", 5000);
        System.out.println(s1.getCuentas().get(0).getIban());
s1.retirar(s1.getCuentas().get(0),1000.00);
s1.generarExtracto(s1.getCuentas().get(0));

s1.bloquearCuenta(s1.getCuentas().get(0));
    }

}


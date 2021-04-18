import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Sucursal s1 = new Sucursal("0985", "6789");

        s1.crearCuenta("Carlos Bouzas", 5000);
        System.out.println(s1.getCuentas().get(0).getIban());
        s1.retirar(s1.getCuentas().get(0), 1000.00);
        s1.generarExtracto(s1.getCuentas().get(0));

s1.bloquearCuenta(s1.getCuentas().get(0));
        System.out.println(s1.getCuentas().get(0).isBloqueada());
       /* String iban = s1.getCuentas().get(0).getIban();
        File x = new File("Bancoss\\0985\\6789\\Bloquedos");
        boolean directorioNuevo = x.mkdirs();
if (directorioNuevo) {
    System.out.println("Se creo el directorio");
} else {
    System.out.println("No se creo el directorio");
} */
       /* String raizBloqueados = "Bancoss\\" + s1.getEntidad() + "\\" + s1.getEntidad() + "\\Bloqueados";
        File bloqueados = new File(raizBloqueados);
        boolean VoF = bloqueados.mkdirs();
        if (VoF == true){
            System.out.println("Se creo correctamente.");
        } else {
            System.out.println("No se creo.");
        }
        String rutaCuenta = "Bancoss\\0985\\6789\\2330346285";
        File cambioCuenta = new File (rutaCuenta);
        boolean mover = cambioCuenta.renameTo(new File(raizBloqueados + "\\2330346285"));
        System.out.println(s1.getCuentas().get(0).sacarCodigo(s1.getCuentas().get(0).getIban()));
*/
    }

}

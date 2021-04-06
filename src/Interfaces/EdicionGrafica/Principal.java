package Interfaces.EdicionGrafica;

public class Principal {
    public static void main(String[] args) {

     Lapiz lapiz = new Lapiz();
     Pincel pincel = new Pincel();

     lapiz.dibujar(new Curva());
     pincel.dibujar(new Curva());

     // Usamos el metodo declaro default para acceder a un metodo privado
     lapiz.getPrivado();
    }
}

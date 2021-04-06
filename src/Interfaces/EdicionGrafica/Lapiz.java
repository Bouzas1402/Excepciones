package Interfaces.EdicionGrafica;

public class Lapiz implements HerramientasDeDibujo {

    public void dibujar(Curva curva){
        System.out.println("Soy un lapiz.");
    }

    @Override
    public void sombrear() {

    }

    @Override
    public void barnizar() {

    }

}

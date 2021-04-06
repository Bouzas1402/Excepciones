package Interfaces.EdicionGrafica;

public class Pincel implements HerramientasDeDibujo {
    public void dibujar(Curva curva){
        System.out.println("Soy un pincel");
    }

    @Override
    public void sombrear() {

    }

    @Override
    public void barnizar() {

    }
}

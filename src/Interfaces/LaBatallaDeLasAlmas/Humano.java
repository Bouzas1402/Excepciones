package Interfaces.LaBatallaDeLasAlmas;

import java.util.Random;

public class Humano extends Fisico implements Espiritual {
private double inteligencia;
private double fe;
private double maldad;
private double bondad;
private double alma;

    public Humano() {
        this.inteligencia = Math.random()*1000;
        this.fe = Math.random()*100;
        this.maldad = Math.random()*100;
        this.bondad = Math.random()*100;
        this.alma = Math.random()*1000;
    }

    public void conflictoMoral (Angeles a, Demonios d){}

    public double golpear (Incorporeo s, int habilidad){
        return 0;
    }

    @Override
    public boolean rezar() {
        if (fe > 50 || bondad > 60) {
            Random rd = new Random();
            return rd.nextBoolean();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String c = "Humano { + inteligencia= %.2f" + "%.2f" + inteligencia;
        String d;
        String cadena = "Humano{" +
                "inteligencia=" + inteligencia +
                ", fe=" + fe +
                ", maldad=" + maldad +
                ", bondad=" + bondad +
                ", alma=" + alma +
                '}';
   return c;
    }

}

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

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

    public double getMaldad() {
        return maldad;
    }

    public void setMaldad(double maldad) {
        this.maldad = maldad;
    }

    public double getBondad() {
        return bondad;
    }

    public void setBondad(double bondad) {
        this.bondad = bondad;
    }

    public double getAlma() {
        return alma;
    }

    public void setAlma(double alma) {
        this.alma = alma;
    }

    public void conflictoMoral (Angeles a, Demonios d){}

    public double golpear (Incorporeo s, int habilidad){
        return 0;
    }

    @Override
    public boolean rezar() {
        if (fe > 50 || bondad > 60) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String cadena = "Humano{" +
                "inteligencia=" + inteligencia +
                ", fe=" + fe +
                ", maldad=" + maldad +
                ", bondad=" + bondad +
                ", alma=" + alma +
                '}';
   return cadena;
    }

}

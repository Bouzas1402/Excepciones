package Interfaces.LaBatallaDeLasAlmas;

import java.text.DecimalFormat;

public class Incorporeo extends Ser {

    private double fe;
    private double maldad;
    private double bondad;

    //Constructor
    public Incorporeo() {
        this.fe = (Math.random()*1000);
        this.maldad = (Math.random()*1000);
        this.bondad = (Math.random()*10);
    }


    // Getter and Setters
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



    // Metodos

    public int luchar (Humano humano) {
        return (int) (Math.random()*5);
    }

    public double engañar (Humano humano){
        return ((humano.getFe() / this.getFe())*((humano.getBondad()-humano.getMaldad())/this.getFe()));
    }

    public double seducir (Humano humano) {
        return Math.sqrt((Math.pow(-getBondad(),2)+(Math.pow(getMaldad(),2)))/((Math.pow(getFe(),2))-(Math.pow(getBondad(),2))));
    }

    public double tentar (Humano humano) {
        return 0;
    }

    public double guiar (Humano humano) {
        return 0;
    }

    public double probar (Humano humano) {
        return 0;
    }

    public double proteger (Humano humano) {
        return 0;
    }





}

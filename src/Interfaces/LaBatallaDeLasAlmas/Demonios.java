package Interfaces.LaBatallaDeLasAlmas;

import java.util.Random;

public class Demonios extends Incorporeo implements Espiritual {

    public Demonios() {
        super();
    }

    public boolean rezar(){
        return false;
    }

    @Override
    public String toString() {
        return "Incorporeo{" +
                "fe=" + this.getFe() +
                ", maldad=" + getMaldad() +
                ", bondad=" + getBondad() +
                '}';
    }

}


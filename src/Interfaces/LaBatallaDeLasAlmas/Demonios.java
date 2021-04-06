package Interfaces.LaBatallaDeLasAlmas;

import java.util.Random;

public class Demonios extends Incorporeo implements Espiritual {

    public Demonios() {
        super();
    }

    public boolean rezar(){
        Random rd = new Random();
        return rd.nextBoolean();
    }

}

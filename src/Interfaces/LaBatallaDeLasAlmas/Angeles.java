package Interfaces.LaBatallaDeLasAlmas;

import java.util.Random;

public class Angeles extends Incorporeo implements Espiritual {

    public Angeles() {
        super();
        System.out.printf("Hola soy un angel");
        System.out.printf("Bondad: %.2f", getBondad());
        System.out.printf("Fe: %.2f", getFe());
        System.out.printf("Maldad: %.2f", getMaldad());
    }



    public boolean rezar(){
        return true;
    }

    public double seducir(Humano humano){
        return 0;
    }

}

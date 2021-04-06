package Interfaces.LaBatallaDeLasAlmas;

public class DiosCristiano extends Dios {

    public DiosCristiano(int numAngeles, int numDemonios) {
        super(numAngeles, numDemonios);
    }

    public boolean esBuenHombre(Humano humano){
        return true;
    }

}

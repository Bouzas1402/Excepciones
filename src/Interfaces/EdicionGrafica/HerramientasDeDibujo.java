package Interfaces.EdicionGrafica;

public interface HerramientasDeDibujo {

    public enum grosor {
        FINOM,MEDIO,GORDO
    }

    void dibujar(Curva curva); //se cierra con un ; y no se desarrolla
    void sombrear();
    void barnizar();

    //metodos estaticos siempre que los implementemos
   static int contarObjetos(){
        int contador = 0;
        return contador;
    }

    // Metodos privados
    private int privado(){
        int contador = 0;
        return contador;
    }

    // lo usamos para acceder a un metodo privado desde fuera
    default void getPrivado(){
       privado();
    }

}

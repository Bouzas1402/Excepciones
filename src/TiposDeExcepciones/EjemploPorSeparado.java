package TiposDeExcepciones;

public class EjemploPorSeparado {

    public static void main(String[] args) {
int y = 10;
int x = 0;

// Hacer lo mismo que en General pero con un try cacht por separado
        // Y si hay alguna que no he contemplado meto todo el codigo en un try que salte en un
        // catch excepcion generico.

        try {

            try {

                int z = y/x;

            } catch (ArithmeticException ae) {
                System.out.println("Ha ocurrido una excepcion aritmetica: " + ae.getMessage());
            }

            try {

            } catch (NumberFormatException nfe) {

            }

            try {

            } catch (NullPointerException npe) {

            }

            try {

            } catch (NegativeArraySizeException nase) {


            }

            try {

            } catch (ArrayIndexOutOfBoundsException aioobe) {

            }

        } catch (Exception e){

        }

    }
}

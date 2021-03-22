import java.util.Arrays;

public class prueba1 {

    public static void main(String[] args) {
        //provocar errores aposta

   /*     int[] a = new int[-3];  //Exception in thread "main" java.lang.NegativeArraySizeException: -3
        System.out.println(Arrays.toString(a)); // at prueba1.main(prueba1.java:8)
        // estos emnsajes de excepciones vienen
        // de la libreria de java. */


        try {
            int[] a = new int[-3];
            System.out.println(Arrays.toString(a));
        } catch (Exception a) {   // esto se refiere a excepciones en general tambien puede ser la excepcion en concreto
            // por ejemplo NegativeArraySizeException catch (NegativeArraySizeExcepcion nase){} (nase son las excepciones)
            System.out.println("Has metido un numero negativo");
            System.out.println(a.getMessage()); // son metodos para manejar excepciones
            System.out.println(a.getCause());

        } finally {
            System.out.println("Aqui estoy pasando por el finally");
        }

        try {
            int[] a = new int[-5];
            System.out.println(Arrays.toString(a));
        } catch (NegativeArraySizeException nase) {  //  a pesar de que la convencion en poner en minusculas las iniciales de la excepcion es el nombre que le das al objeto excepcion que creas
            System.out.println("Has metido un numero negativo 2");
            System.out.println(nase.getMessage()); // son metodos para manejar excepciones
            System.out.println(nase.getCause());

        } finally {
            System.out.println("Aqui estoy pasando por el finally 2");
        }



    }
}

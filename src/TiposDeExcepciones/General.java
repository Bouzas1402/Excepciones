package TiposDeExcepciones;

public class General {
    public static void main(String[] args) {
       // Gestionar la excepcion;
       // coger la parte del codigo que creo que puede dar problemas y lo metemos dentro del bloque try-catch (Traduccion; intenta hacer esto)


        try {
                // ArithmeticException
// el caso mas tipico es cuando intentamos dividir por 0, son aquellos que no son correctos matematicamente
/* int a = 10;
        int b = 0;
        System.out.println(a / b); */

                // NumberFormatException
                // convierto un String en un numero
                //int num = Integer.parseInt("9");
                //int num1 = Integer.parseInt("m");
// error de conversion de tipos

                // NullPointerException
                //se dan cuando intentas inicializar un objeto que no existe
              //  String cadena = null;
               // int longitud = cadena.length();

                // NegativeArraySizeException
// Se da cuando un array tiene tamaño negativo
             //   int[] x = new int[-3];

                // ArrayIndexOutOfBoundsException
// Eso es que te sales del array
            int[] x = new int[5];
            for (int i = 0; i < 10; i++) {
                x[i] = i + 1;
            }


                //...
                //Catch para ArithmeticException
            } catch (java.lang.ArithmeticException ae) {
                System.out.println("Ha ocurrido una excepcion aritmetica" + ae.getMessage());
            }
//Catch para NumberFormatException
            catch (java.lang.NumberFormatException nfe) {
                System.out.println("Tipos introducidos incorrectos" + nfe.getMessage());
//Catch para NullPointerException
            } catch (java.lang.NullPointerException npe) {
                System.out.println("Objeto null");
                // NegativeArraySizeException
            } catch (java.lang.NegativeArraySizeException nae) {
                System.out.println("Valor de longitud del array no valido " + nae.getMessage());
//Catch para ArrayIndexOutOfBoundsException
            } catch (java.lang.ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Se ha sobrepasado el array " + aioobe.getMessage());

// catch para Excepcion en general
            } catch (Exception e) {
                System.out.println("Excepción no prevista: " + e.getMessage());
                // e.printStackTrace();
            }



        }
    }

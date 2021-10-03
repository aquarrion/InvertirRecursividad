public class Ejercicios {
    /*
    * Invertir una cadena de texto "recursividad " = "dadivisruceR"
    * */

    private static String invertirCadena(String cadena, int indice){
        String inversa;

        if (indice == 0){ //caso base
            inversa = String.valueOf(cadena.charAt(indice));
        }else { //llamada recursiva
            inversa = String.valueOf(cadena.charAt(indice)) + invertirCadena(cadena, indice -1);

        }

        return inversa;
    }

    /*
    * Metodo auxiliar que llama al metodo recursivo
    * */
    public static String invertirCadena(String cadena){
        return invertirCadena(cadena, cadena.length() - 1);
    }
}

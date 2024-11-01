/**
 * 3.3.5 The Boolean Type
 * @author kolodani
 */

public class Booleanos {

    private static boolean verdadero = true;
    private static boolean falso = false;

    /*
     * los booleanos en java son True y False, nunca otro valor
     * en C y C++ se evalua a 0 como false, aca no
     * erro comun es poner
     * if (x = 0)
     * siendo x un booleano y no un entero
     */

    public static void main(String[] args) {
        System.out.println("Verdadero: " + verdadero);
        System.out.println("Falso: " + falso);
    }

}

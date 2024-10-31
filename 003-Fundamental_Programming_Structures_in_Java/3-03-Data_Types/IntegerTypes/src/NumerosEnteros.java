/**
 * 3.3.1 Integer Types
 * @author kolodani
 */

public class NumerosEnteros {

    private static int entero = 4; // int ocupa 4 bytes
    private static short corto = 2; // short ocupa 2 bytes 
    private static long largo = 8; // long ocupa 8 bytes
    private static byte bait = 1; // byte ocupa 1 byte

    /*
     * tambien podemos hacerlos unsigned a las variables
     * para poder empezar desde el cero y no de la mitad 
     * negativa del total.
     * por ejemplo en byte en vez de ir de -128 a 127
     * iriamos de 0 a 255
     */

        public static void main(String[] args) {
            System.out.println("int: " + entero);
            System.out.println("short: " + corto);
            System.out.println("long: " + largo);
            System.out.println("byte: " + bait);

    }
}

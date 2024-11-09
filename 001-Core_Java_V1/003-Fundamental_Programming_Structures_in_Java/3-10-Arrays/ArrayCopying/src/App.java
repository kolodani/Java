import java.util.Arrays;

/**
 * 3.10.4 Array Copying
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        int[] smallPrimes = { 1, 2, 3, 5, 7, 11, 13 };
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12; // esto cambia tambien a smallPrimes[5]
        System.out.println(smallPrimes[5]);
        /*
         * al hacer esto tengo que recordar que son punteros y si cambio
         * a uno, cambio a todos
         */

        int[] smallPrimes2 = { 1, 2, 3, 5, 7, 11, 13 };
        int[] copyLuckyNumbers = Arrays.copyOf(smallPrimes2, smallPrimes2.length); // este metodo evita que los dos apunten a lo mismo
        copyLuckyNumbers[5] = 12; // esto no cambia a smallPrimes2[5]
        System.out.println(smallPrimes2[5]);
    }
}

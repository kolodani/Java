import java.util.Arrays;

/**
 * 3.10.3 The "for each" Loop
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            arreglo[i] = i;
        }

        System.out.println(Arrays.toString(arreglo));

        for (int numero : arreglo) {
            System.out.println(numero);
        }
    }
}

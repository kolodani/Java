/**
 * 3.10.2 Accessing Array Elements
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i;
            System.out.println("el lugar " + i + " se almacena el valor: " + a[i]);
        }

        String[] names = new String[10];
        for (int i = 0; i < names.length; i++) {
            names[i] = "";
        }
    }
}

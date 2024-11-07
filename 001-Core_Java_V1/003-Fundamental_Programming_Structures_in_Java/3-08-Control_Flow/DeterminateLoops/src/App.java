/**
 * 3.8.4 Determinate Loops
 *
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Counting down ... " + i);
        }
        System.out.println("Blastoff!");
    }
}

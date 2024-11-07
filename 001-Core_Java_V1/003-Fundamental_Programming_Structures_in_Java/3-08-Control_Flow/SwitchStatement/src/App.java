import java.util.Scanner;

/**
 * 3.8.5 Multiple Selections - The Switch Statement
 *
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("Select an option (1,2,3,4) ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You choose: " + choice);
                break;
            case 2:
                System.out.println("You choose: " + choice);
                break;
            case 3:
                System.out.println("You choose: " + choice);
                break;
            case 4:
                System.out.println("You choose: " + choice);
                break;
            default:
                System.out.println("You don't choose a right option");
                break;
        }
    }
}

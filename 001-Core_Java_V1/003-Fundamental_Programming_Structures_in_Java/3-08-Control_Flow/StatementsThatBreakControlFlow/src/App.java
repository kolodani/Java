import java.util.Scanner;

/**
 * 3.8.6 Statements That Break Control Flow
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        int years = 0;
        double balance = 0;
        double payment = 10000;
        double interestRate = 15;
        double goal = 1000000;

        while (years <= 100) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            if (balance >= goal)
                break;
            years++;
        }
        System.out.println(years);

        years = 0;
        balance = 0;
        payment = 10000;
        interestRate = 15;
        goal = 1000000;
        while (years <= 100 && balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            if (balance < goal)
                years++;
        }
        System.out.println(years);

        /*
         * break an continue son herramientas utiles pero poco usadas
         * porque para los programadores son confusas pero eso no tiene
         * que limitar el uso si uno las encuentra utiles
         */

        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;

        read_data:
        for (int count = 1; count <= 100; count++) {
            System.out.println("Enter a number, -1 to quit: ");
            n = in.nextInt();
            if (n == -1) {
                break read_data;
            }
            if (n < 0)
                continue;
            {
                sum += n; // not executed if n < 0
            }
        }
        System.out.println(sum);
    }
}

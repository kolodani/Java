/**
 * 3.8.3 loops
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        double balance = 0.0;
        double goal = 10000.0;
        double payment = 1000.0;
        double interestRate = 5.0;
        int years = 0;
        int cantidad = 10;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println(years + " Años.");

        /*
         * ahora hacemos un bucle con do while para que por lo
         * menos se ejecute una sola vez
         */

        do {
            cantidad++;
            System.out.println(cantidad);
        } while (cantidad < 20);
    }
}

/**
 * 3.8.2 Conditional Statements
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {
        int yourSales = 500;
        int target = 100;
        String performance;
        double bonus;

        if (yourSales >= 2 *target) {
            performance = "Excellent";
            bonus = 1000;
        }
        else if (yourSales >= 1.5 * target) {
            performance = "Fine";
            bonus = 500;
        }
        else if (yourSales >= target) {
            performance = "Satisfactory";
            bonus = 100 + 0.01 * (yourSales - target);
        }
        else
        {
            performance = "You're fired";
        }
        System.out.println(performance);
    }
}

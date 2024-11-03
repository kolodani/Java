/**
 * 3.6.2 Concatenation
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);

        String repeated = "Java".repeat(3);
        System.out.println(repeated);
    }
}

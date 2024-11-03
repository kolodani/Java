/**
 * 3.6.4 Testing Strings for Equality
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        String greeting = "Hello";
        String hola = "Hello";
        System.out.println(greeting.equals("Hello"));
        System.out.println(greeting.equals("hello"));
        System.out.println(greeting.equalsIgnoreCase("hello"));

        System.out.println(greeting == "Hello");
        System.out.println(greeting == hola);

    }
}

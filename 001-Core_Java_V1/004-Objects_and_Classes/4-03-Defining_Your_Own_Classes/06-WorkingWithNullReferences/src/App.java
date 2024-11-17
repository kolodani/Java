import java.time.LocalDate;

/**
 * 4.3.6 Working with null References
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * cuidado al usar nulos
         */
        LocalDate birthday = null;
        String s = birthday.toString(); // NullPointerException
        System.out.println(s);
        /*
         * se pueden lo siguiente para evitar esto
         * if(n == null){
         * name = "unknown";
         * }
         * else {
         * name = n;
         * }
         * 
         * como tambin se puede usar este metodo dentro del constructor
         * name = Objetcs.requireNonNullElse(n, "unknown");
         */
    }
}

import java.io.Console;
import java.util.Scanner;

/**
 * 3.7.1 Reading Input
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        // get first input
        System.out.println("What is your name? ");
        String name = in.nextLine();
        // get second input
        System.out.println("How old are you? ");
        int age = in.nextInt();
        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));

        /*
         * la clase Scanner no es buena para leer contraseñas desde la
         * consola, para eso se usa la clase Console especifica para ese
         * proposito
         */

        Console cons = System.console();
        String username = cons.readLine("user name: ");
        char[] passwd = cons.readPassword("Password: ");
        System.out.println("Usuario: " + username);
        System.out.println("Contraseña" + passwd.toString());

        /*
         * API de Scanner
         * 
         * Scanner(InputStream in)
         * String nextLine()
         * String next()
         * int nextInt()
         * double nextDouble()
         * boolean hasNext()
         * boolean hasNextInt()
         * boolean hasNextDouble()
         */

        /*
         * API de System
         * 
         * static Console console()
         */

        /*
         * API de Console
         * 
         * static char[] readPassword(String prompt, Object... args)
         * static String readLine(String prompt, Object... args)
         */
    }
}

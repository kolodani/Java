import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 3.7.3 File Input and Output
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8);
        PrintWriter out = new PrintWriter("myfile.txt", StandardCharsets.UTF_8);

        /*
         * Metodos utiles de Scanner
         * 
         * Scanner(Path p, String encoding)
         * Scanner(String data)
         */

        /*
         * Metodos utiles de PrintWriter
         * 
         * PrintWriter(String fileName)
         */

        /*
         * Metodos utiles de file.Path
         * 
         * static Path of(String pathname)
         */
    }
}

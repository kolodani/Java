/**
 * 3.8.1 Block Scope
 * 
 * @author kolodani
 */


public class App {
    public static void main(String[] args) throws Exception {
        int n;
        {
            int k;
        }
        // k = 1;
        /*
         * no puedo usar a k fuera del corchete que esta
         * porque esta fuera del Scope si lo puedo hacer
         * de n porque esta en una llave mas afuera
         */
    }
}

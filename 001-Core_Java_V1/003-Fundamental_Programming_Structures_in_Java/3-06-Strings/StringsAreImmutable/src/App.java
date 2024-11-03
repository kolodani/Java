/**
 * 3.6.3 Strings Are Immutable
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        String gretting = "Hello";
        gretting = gretting.substring(0, 3) + "p!";
        System.out.println(gretting);

        /*
         * mas alla que cambiamos el valor de greetting los strings
         * son inmutables pero no tenemos que reservar memoria y esas cosas
         * ya que java hace mas facil y implicitas cosas que C
         */
    }
}

/**
 * 3.6.5 Empty and Null Strings
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        String hola = "Hello";
        String vacio = "";
        String nulo = null;

        System.out.println(hola.length() == 0);
        System.out.println(vacio.length() == 0);
        System.out.println(nulo != null);

        /*
         * una cadena puede ser vacia o nula, recordar siempre evaluar las
         * dos pero preguntar primero si es nula para evitar errores
         */
    }
}

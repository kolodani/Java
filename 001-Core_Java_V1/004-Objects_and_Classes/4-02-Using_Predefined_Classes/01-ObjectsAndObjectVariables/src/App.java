import java.util.Date;

/**
 * 4.2.1 Objects and Object Variables
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * para construir un nuevo objeto de tipo date usamos la sentencia
         * new Date()
         */

        System.out.println(new Date());
        String s = new Date().toString();
        System.out.println("Es un string: " + s);
        Date birthday = new Date();
        Date deadline;
        // String noTodavia = deadline.toString();
        // causa un error
        // para evitarlo tengo que inicializarla de dos maneras
        // deadline = new Date();
        // deadline = birthday;
        // podemos referenciar a null
        // porque lo que creamos es una referencia al objeto creado
        // y no creamos un objeto en si
    }
}

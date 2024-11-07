import java.util.Date;

/**
 * 3.7.2 Formatting Output
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        double x = 10000.0 / 3.0;
        System.out.println(x);
        /*
         * esto imprime el valor mas grande que puede
         * almacenar un flotante
         */

        System.out.printf("%,.2f", 10000.0 / 3.0);

        /*
         * se le puede dar formato a los numeros y a las fechas
         * aprovechando las prestaciones de la funcion de
         * system, printf
         */

        System.out.printf("%s %tB %<te, %<tY", "due date:", new Date());
    }
}

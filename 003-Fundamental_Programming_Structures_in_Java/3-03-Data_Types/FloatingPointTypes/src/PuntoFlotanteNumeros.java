/**
 * 3.3.2 Floating Point Types
 * @author kolodani
 */

public class PuntoFlotanteNumeros {

    private static float flotante = 4.0f; // float es de 4 bytes
    private static double doble = 8.0; // double es de 8 bytes
    
    /*
     * Los numeros con flotantes son numeros con coma
     * tambien se pueden hacer sin signos
     */

    public static void main(String[] args) {

        System.out.println("Float: " + flotante);
        System.out.println("Double: " + doble);
        
    }

    /*
     * Ademas tenemos los errores de NaN (Not a number)
     * que se da cuando dividimos 0/0 o tambien los
     * Positive infinity y Negative infinity
     * cuando los numeros se van fuera del rango
     * hacia el infinito
     */
}

/**
 * 3.5.6 Increment and Decrement Operators
 * @author kolodani
 */

public class IncrementosDecrementos {

    public static void main(String[] args) {
        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        int b = 2 * n++;
        System.out.println("valor de m: " + m);
        System.out.println("valor de n: " + n);
        System.out.println("valor de a: " + a);
        System.out.println("valor de b: " + b);

        /*
         * el ++ y -- son muy importantes y en java se encuentran
         * estos sirven para incrementar y decrementar en 1 una variable
         * entera. si lo ponemos prefijo en una operacion se hara primero
         * pero si lo ponemos despues se hara despues de la operacion
         * por eso en este ejemplo los valores de a y b son distintos
         * pero cuando pregunto los valores de m y n son iguales
         */
    }
}

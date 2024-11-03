/**
 * 3.5.3 Conversions Between Numeric Types
 * @author kolodani
 */

public class Conversiones {

    byte bi;
    short sh;
    char ch;
    int in;
    long lo;
    float fl;
    double dou;

    /*
     * de estos tipos primitivos, convertir solo tiene perdida si se hace:
     * int a float
     * long a float
     * long a double
     * pero son sin perdida las conversiones de
     * byte a short
     * short a int
     * char a int
     * int a long
     * int a double
     * float a double
     * 
     * y ademas tenemos que si uno de los numeros es de un tipo convierte
     * el resultado a su tipo
     * double
     * float
     * long
     * int
     */
    public static void main(String[] args) {
        
    }
}
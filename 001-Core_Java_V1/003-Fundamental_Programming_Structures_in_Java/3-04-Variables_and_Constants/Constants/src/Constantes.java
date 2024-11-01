/**
 * 3.4.3 Constants
 * @author kolodani
 */

public class Constantes {

    public static final double CM_POR_PULGADAS = 2.54;

    /*
     * podemos declarar constantes, las mismas por convencion
     * se declaran en mayusculas y al agragarles final
     * las mismas solo se les puede dar un unico valor
     * una sola vez y para siempre
     * se declaran por lo general fuera del metodo main
     */

    public static void main(String[] args) {
    
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Tamaño del papel en centimetros: "
            + paperWidth * CM_PER_INCH + " x " + paperHeight * CM_PER_INCH);
            System.out.println("Tamaño del papel en centimetros: "
            + paperWidth * CM_POR_PULGADAS + " x " + paperHeight * CM_POR_PULGADAS);
    }
}

/**
 * 3.4.4 Enumerated Types
 * @author kolodani
 */

public class Enumeraciones {

    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE, EXTRA_EXTRA_LARGE};

    Size s = Size.SMALL;
    Size m = Size.MEDIUM;
    Size l = Size.LARGE;
    Size xl = Size.EXTRA_LARGE;
    Size xxl = Size.EXTRA_EXTRA_LARGE;

    /*
     * se pueden crear enumeraciones para poder usar
     * si vamos a tener tipos unicos y restrictos
     * esto ayuda a poder crear una coleccion de cosas,
     * nombres, u objetos de un tipo numerado
     */

    public static void main(String[] args) {
        
    }
}

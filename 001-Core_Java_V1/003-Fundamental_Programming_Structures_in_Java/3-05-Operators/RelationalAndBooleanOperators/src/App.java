/**
 * 3.5.7 Relational and Boolean Operators
 *
 * @author kolodani
 */

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(3 == 7); // false
        System.out.println(3 != 7); // true

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        System.out.println(a && b);
        System.out.println(a && c);
        System.out.println(a || b);
        System.out.println(b || d);

        int x = 10;
        int y = 15;

        int z = x < y ? 2 : 3;
        System.out.println(z);
    }
}

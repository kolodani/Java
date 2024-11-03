/**
 * 3.6.9 Building Strings
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        StringBuilder builder = new StringBuilder();
        System.out.println(builder);
        builder.append('D');
        builder.append("aniel");
        System.out.println(builder);
        String completedString = builder.toString();
        System.out.println(completedString);

        /*
         * Metodos de StringBuilder de la API
         *
         * StringBuilder()
         * int length()
         * StringBuilder append(String str)
         * StringBuilder append(char c)
         * StringBuilder appendCodePoint(int cp)
         * void setCharAt(int i, char c)
         * StringBuilder insert(int offset, String str)
         * StringBuilder insert(int offset, char c)
         * StringBuilder delete(int startIndex, int endIndex)
         * String toString()
         */
    }
}

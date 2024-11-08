import java.math.BigInteger;

/**
 * 3.9 Big Numbers
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        BigInteger a = BigInteger.valueOf(100);
        BigInteger reallyBig = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
        a = reallyBig;
        BigInteger c = a.add(reallyBig);
        BigInteger d = c.multiply(reallyBig.add(BigInteger.valueOf(2)));
        System.out.println(a);
        System.out.println(reallyBig);
        System.out.println(c);
        System.out.println(d);

        /*
         * java.math.BigInteger
         * 
         * BigInteger add(BigInteger other)
         * BigInteger subtract(BigInteger other)
         * BigInteger multiply(BigInteger other)
         * BigInteger divide(BigInteger other)
         * BigInteger mod(BigInteger other)
         * BigInteger sqrt() 9
         * int compareTo(BigInteger other)
         * static BigInteger valueOf(long x)
         */

        /*
         * java.math.BigDecimal
         * 
         * BigDecimal add(BigDecimal other)
         * BigDecimal subtract(BigDecimal other)
         * BigDecimal multiply(BigDecimal other)
         * BigDecimal divide(BigDecimal other)
         * BigDecimal divide(BigDecimal other, RoundingMode mode)
         * int compareTo(BigDecimal other)
         * static BigDecimal valueOf(long x)
         * static BigDecimal valueOf(long x, int scale)
         */
    }
}

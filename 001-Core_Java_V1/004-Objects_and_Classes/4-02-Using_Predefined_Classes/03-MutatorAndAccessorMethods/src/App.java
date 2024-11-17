import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 4.2.3 Mutator and Accessor Methods
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * anteriormente la funcion plusDays no alteraba al objeto
         * no lo mutaba.
         */

        GregorianCalendar someDay = new GregorianCalendar(1999, 11, 31);
        someDay.add(Calendar.DAY_OF_MONTH, 1000);

        int year = someDay.get(Calendar.YEAR);
        int month = someDay.get(Calendar.MONTH) + 1;
        int day = someDay.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "/" + month + "/" + day);

        /*
         * java.time.LocalDate
         * 
         * static LocalDate now()
         * static LocalDate of(int year, int month, int day)
         * int getYear()
         * int getMonthValue()
         * int getDayOfMonth()
         * DayOfWeek getDayOfWeek
         * LocalDate plusDays(int n)
         * LocalDate minusDays(int n)
         */
    }
}

import java.time.LocalDate;

/**
 * 4.2.2 The LocalDate Class of the Java Library
 * 
 * @author kolodani
 */

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(LocalDate.now());
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        System.out.println(newYearsEve);

        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();

        System.out.println(year + "/" + month + "/" + day);

        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);

        year = aThousandDaysLater.getYear();
        month = aThousandDaysLater.getMonthValue();
        day = aThousandDaysLater.getDayOfMonth();

        System.out.println(year + "/" + month + "/" + day);

    }
}

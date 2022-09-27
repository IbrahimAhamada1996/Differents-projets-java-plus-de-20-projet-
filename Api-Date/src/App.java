import java.time.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class App {


    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        localTime.getHour();

        System.out.println("time = " + localTime);
        System.out.println("time = " + localTime.equals(localTime));

        LocalDate localDate = LocalDate.now();
        System.out.println("date = " + localDate);
        ZoneId.getAvailableZoneIds();
        // System.out.println("args = " +  ZoneId.getAvailableZoneIds() );
        //  ZoneId.of(String.valueOf(LocalDateTime.now()));
        LocalDate localDate1 = LocalDate.parse("2009-02-12");
        age(localDate1);


    }

    public static void age(LocalDate localDate) {

        System.out.println("You are = " + Period.between(localDate, LocalDate.now()).getYears());

    }
}

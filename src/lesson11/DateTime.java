package lesson11;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, d-MMM-yy hh:mm:ss");

        System.out.println(localDateTime.format(dateTimeFormatter));

    }
}

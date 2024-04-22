package Localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main12 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime current = LocalDateTime.of(date, time);
        System.out.println("Now = " + current);
        LocalDateTime dates = LocalDateTime.of(2019, Month.MAY, 15, 12, 15, 00);
        System.out.println("Now = " + dates);


    }
}

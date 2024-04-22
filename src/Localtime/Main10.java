package Localtime;

import java.time.LocalTime;

public class Main10 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime time2 = time.plusHours(2);
        LocalTime time3 = time.minusMinutes(40);
        LocalTime time4 = time.plusSeconds(3600);
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);

    }
}

package Localtime;

import java.time.LocalTime;

public class Main9 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

    }
}

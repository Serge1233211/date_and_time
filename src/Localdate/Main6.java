package Localdate;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main6 {
    public static void main(String[] args) {
        ZoneId  timezone = ZoneId.of("Asia/Shanghai");
        LocalDate today = LocalDate.now(timezone);
        System.out.println("Today = " + today);
    }
}

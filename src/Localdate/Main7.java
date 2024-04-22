package Localdate;

import java.time.LocalDate;

public class Main7 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2019, 6, 26);
        LocalDate nextBirthday = birthday.plusYears(1);
        LocalDate firstBirthday = birthday.minusYears(11);
        System.out.println(birthday);
        System.out.println(nextBirthday);
        System.out.println(firstBirthday);

    }
}

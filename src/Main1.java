import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main1 {

    public static void main (String[] args) {

        Calendar calendar = new GregorianCalendar (2017, 0 , 25) ;

        Date date = calendar.getTime () ;

        System.out.println (date) ;}

}


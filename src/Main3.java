import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Main3 {

    public static void main(String[] args) {
        GregorianCalendar cannes = new GregorianCalendar(2016, Calendar.AUGUST, 2);
        cannes.set(Calendar.ERA, GregorianCalendar.AD);
        DateFormat df = new SimpleDateFormat("dd MMM EE yyyy  GG");
        System.out.println(df.format(cannes.getTime()));
    }


}


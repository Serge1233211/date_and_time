import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main4 {

    public static void main(String[] args) {
        String strDate = "Thu, April 4, 2024";
        DateFormat formatter = new SimpleDateFormat("E, MMM dd, yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(strDate);
            System.out.println(formatter.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

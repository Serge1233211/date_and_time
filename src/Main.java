import java.util.Date;

public class Main{
    public static void main (String[] args) throws InterruptedException {

    Date date1 = new Date () ;
    Thread. sleep (2000) ;//приостановим работу программы на 2 секунды

    Date date2 = new Date () ;

    System.out.println(date1.after (date2) ) ;}}
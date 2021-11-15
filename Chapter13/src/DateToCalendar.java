import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateToCalendar {
    public static void main(String[] args) {
        String text = "15.11.2021";
        String[] dateElements = text.split("[.]");
        String dayString = dateElements[0];
        String monthString = dateElements[1];
        String yearString = dateElements[2];
        int day = Integer.parseInt(dayString);
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);


        Calendar cal = new GregorianCalendar(year, month-1, day);
        Date date = cal.getTime();
        System.out.println(date);
    }
}

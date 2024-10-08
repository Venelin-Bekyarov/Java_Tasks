import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateHourParts {
    public static void main(String[] args) {

        String pattern = "HH часа и mm мин.";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date dateNow = new Date();
        System.out.println(dateNow); // Sun Oct 12 15:57:39 EEST 2008
        String formattedDate = sdf.format(dateNow);
        System.out.println(formattedDate); // 15 часа и 57 мин.


        /*String pattern = "EEEE, dd.MM.yyyy г.";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date dateNow = new Date();
        System.out.println(dateNow); // Sun Oct 12 16:09:04 EEST 2008
        String formattedDate = sdf.format(dateNow);
        System.out.println(formattedDate); // Неделя, 12.10.2008 г.*/
    }
}

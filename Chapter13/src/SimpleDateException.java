import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateException {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String userInput = "27/12/2008";
        try {
            Date date = sdf.parse(userInput);
            System.out.println(date);
        } catch (ParseException pe) {
            System.out.println("Error in parsing " + userInput);
// Error in parsing 27/12/2008 -slash instead of dot
        }
    }
}
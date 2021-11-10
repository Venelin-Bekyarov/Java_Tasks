import java.util.concurrent.TimeUnit;

public class C11_01 {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        long days = TimeUnit.MILLISECONDS.toDays(millis);
        millis -= TimeUnit.DAYS.toMillis(days);
        long hours = TimeUnit.MILLISECONDS.toHours(millis);
        millis -= TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        millis -= TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);

        String sb = days + " Days, " + hours + " Hours, " + minutes + " Minutes, " + seconds +
                " Seconds";

        System.out.println("Time elapsed: " + sb);
    }
}




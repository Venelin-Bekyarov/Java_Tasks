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

        StringBuilder sb = new StringBuilder();
        sb.append(days);
        sb.append(" Days, ");
        sb.append(hours);
        sb.append(" Hours, ");
        sb.append(minutes);
        sb.append(" Minutes, ");
        sb.append(seconds);
        sb.append(" Seconds");

        System.out.println("Time elapsed: " + sb);
    }
}




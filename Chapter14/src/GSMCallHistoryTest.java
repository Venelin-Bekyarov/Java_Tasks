import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GSMCallHistoryTest {

    private static Call[] callTest = new Call[3];

    public static void main(String[] args) {
        GSMCallHistoryTest.callTestPrint();

    }

    public static void callTestPrint() {
        callTest[0] = new Call(LocalDate.now(),LocalDateTime.now(), 12);
        callTest[1] = new Call(LocalDate.now().minusDays(2), LocalDateTime.now(), 26);
        callTest[2] = new Call(LocalDate.now().minusDays(3), LocalDateTime.now().minusHours(2).minusMinutes(4), 5);

        for (Call conversation : callTest) {
            System.out.println(conversation);
        }
    }

}

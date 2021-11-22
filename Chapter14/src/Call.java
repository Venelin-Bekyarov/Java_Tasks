import java.time.LocalDate;
import java.time.LocalDateTime;


public class Call {


    private LocalDate dateTime;
    private LocalDateTime callStart;
    private int callTimeSpan;

    public Call(LocalDate dateTime, LocalDateTime callStart, int callTimeSpan) {
        this.dateTime = dateTime;
        this.callStart = callStart;
        this.callTimeSpan = callTimeSpan;

    }

    public String toString() {
        return "Call on: " + getDateTime() + ", at: " + callStart.getHour()+ ":"+ callStart.getMinute() +
                ". Call duration: " + callTimeSpan + " minutes.";
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public void setCallStart(LocalDateTime callStart) {
        this.callStart = callStart;
    }

    public void setCallTimeSpan(int callTimeSpan) {
        this.callTimeSpan = callTimeSpan;
    }

    public LocalDateTime getCallStart() {
        return callStart;
    }

    public int getCallTimeSpan() {
        return callTimeSpan;
    }
}

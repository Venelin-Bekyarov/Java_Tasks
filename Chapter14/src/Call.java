import java.time.LocalDate;


public class Call {


    private LocalDate dateTime;
    private int callStart;
    private int callTimeSpan;

    public Call(LocalDate dateTime, int callStart, int callTimeSpan){
        this.dateTime= LocalDate.now();
        this.callStart=callStart;
        this.callTimeSpan=callTimeSpan;

    }
    public String toString() {
        return "Call made on: " + getDateTime() + ", at: " + callStart + ". Call duration: " + callTimeSpan + " .";
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public int getCallStart() {
        return callStart;
    }

    public int getCallTimeSpan() {
        return callTimeSpan;
    }
}

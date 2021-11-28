package C17_01;

public class Worker extends Human {
    private double ratePerHour;
    private byte workHoursPerDay;
    private double moneyPerDay;


    public Worker(String firstName, String lastName, double ratePerHour, byte workHoursPerDay,double moneyPerDay) {
        super(firstName, lastName);

        this.ratePerHour = ratePerHour;
        this.workHoursPerDay = workHoursPerDay;
        this.moneyPerDay=moneyPerDay;
    }

    public double moneyPerDay() {
        double moneyPerDay = workHoursPerDay * ratePerHour;
        return moneyPerDay;
    }

    public double getMoneyPerDay() {
        return moneyPerDay;
    }

    public double compareWages(Worker next) {
        double wageComparison = Double.compare(this.moneyPerDay, next.moneyPerDay);
        if (wageComparison == 0) {
            wageComparison = Double.compare(this.moneyPerDay, next.moneyPerDay);
        }
        return wageComparison;
    }

}





package C17_01;

import java.util.Arrays;
import java.util.Scanner;

public class Worker extends Human {
    private double ratePerHour;
    private byte workHoursPerDay;
    private double moneyPerDay;


    public Worker(String firstName, String lastName, double ratePerHour, byte workHoursPerDay, double moneyPerDay) {
        super(firstName, lastName);

        this.ratePerHour = ratePerHour;
        this.workHoursPerDay = workHoursPerDay;
        this.moneyPerDay = moneyPerDay;
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

    public String toString() {
        return getFirstName() + ' ' + getLastName() + ' ' + moneyPerDay + '\n';
    }
}

class TestClassWorker {

    public static void main(String[] args) {
        Worker[] workers = readWorkers();
        Arrays.sort(workers);
        System.out.println(getToString(workers));
    }

    static Worker[] readWorkers() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter the number of Workers:%n");
        int numberWorkers = Integer.parseInt(scanner.nextLine());
        System.out.printf("Please enter Worker's first name, last name, decimal rate per hour and hours worked as integer:%n");
        Worker[] workers = new Worker[numberWorkers];
        for (int worker = 0; worker < numberWorkers; worker++) {
            String line = scanner.nextLine();
            String[] data = line.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            double rate = Double.parseDouble(data[2]);
            byte hours = Byte.parseByte(data[3]);
            double wages = rate * hours;
            Worker workerOut = new Worker(firstName, lastName, rate, hours, wages);
            workers[worker] = workerOut;
        }
        return workers;
    }

    static String getToString(Worker[] workers) {
        StringBuilder result = new StringBuilder();
        for (var worker : workers) {
            result.append(worker.toString());
        }
        return result.toString();
    }

}






package C17_01;

import java.util.*;

public class TestClasses {

    public static void main(String[] args) {

        //Input pattern:
        /**
        2
        Ivo Milenov 4.56
        Tihomir Iliev 3.50
        2
        Ivan Andonov 10.00 3
        Stoicho Kirchev 10.00 5

         **/


        Student[] students = readStudents();
        Worker[] workers = readWorkers();

        ArrayList<Human> persons = new ArrayList<>();

        Collections.addAll(persons, students);
        Collections.addAll(persons, workers);

        persons.stream().sorted();
        System.out.println(toString(persons));
    }

    static Student[] readStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter number of Students:%n");
        int numberStudents = Integer.parseInt(scanner.nextLine());
        System.out.printf("Please enter Student's first name, last name and decimal grade:%n");
        Student[] students = new Student[numberStudents];
        for (int student = 0; student < numberStudents; student++) {
            String line = scanner.nextLine();
            String[] data = line.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            double grade = Double.parseDouble(data[2]);
            Student studentOut = new Student(firstName, lastName, grade);
            students[student] = studentOut;
        }
        return students;
    }

    static Worker[] readWorkers() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter the number of Workers:%n");
        int numberWorkers = Integer.parseInt(scanner.nextLine());
        System.out.printf("Please enter Worker's's first name, last name, decimal rate per hour and hours worked as integer:%n");
        Worker[] workers = new Worker[numberWorkers];
        for (int worker = 0; worker < numberWorkers; worker++) {
            String line = scanner.nextLine();
            String[] data = line.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            double rate = Double.parseDouble(data[2]);
            byte hours = Byte.parseByte(data[3]);
            double wages = rate*hours;
            Worker workerOut = new Worker(firstName, lastName, rate, hours, wages);
            workers[worker] = workerOut;
        }
        return workers;
    }

    static String toString(ArrayList<Human> humans) {
        StringBuilder result = new StringBuilder();

        for (var person : humans) {
            result.append(person.toString());
        }
        return result.toString();
    }
}

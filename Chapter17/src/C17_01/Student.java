package C17_01;

import java.util.Arrays;
import java.util.Scanner;

public class Student extends Human {

    private double grade;

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);

        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    public double compareGrade(Student other) {
        double comparisonGrade = Double.compare(this.grade, other.grade);
        return comparisonGrade;
    }


    public String toString() {
        String result = String.format("%s %s %.2f",getFirstName(),getLastName(),grade + '\n');
        return result;
    }
}

class TestClassStudent {


    public static void main(String[] args) {
        Student[] students = readStudents();
        Arrays.sort(students);
        System.out.println(getToString(students));
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

    static String getToString(Student[] students) {
        StringBuilder result = new StringBuilder();
        for (var student : students) {
            result.append(student.toString());
        }
        return result.toString();
    }
}



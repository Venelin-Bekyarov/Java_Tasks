package C17_01;

public class Student extends Human {

    private double grade;

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);

        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

}


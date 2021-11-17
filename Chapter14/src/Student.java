public class Student {


    enum specialty {Design, Finances, IT, Unprovided}

    enum uni {Technical, Economics, Software, Unprovided}

    private String nameFirst;
    private String nameSecond;
    private String nameLast;
    private int year;
    private specialty specialty;
    private uni uni;
    private String email;
    private String phone;

    public Student(String nameFirst, String nameSecond, String nameLast, uni uni) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.nameLast = null;
        this.uni = uni.Unprovided;
    }

    public Student(String nameFirst, String nameSecond, String nameLast, int year, specialty specialty, uni uni,
                   String email, String phone) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.nameLast = nameLast;
        this.year = year;
        this.specialty = specialty;
        this.uni = uni;
        this.email = email;
        this.phone = phone;
    }

    public String fullInfo() {
        return nameFirst + " " + nameSecond + " " + nameLast + "%n" +
                "year: " + year + "%n" +
                "specialty: " + specialty + " at " + uni + " University" + "%n" +
                "email: " + email + ", phone: " + phone;
    }

    static int numberOfStudents = 0;

    public Student() {
        numberOfStudents++;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int studentCount) {
        Student.numberOfStudents = studentCount;
    }

    public void print() {
        System.out.println(this.nameFirst.toString());
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }

    public void setNameSecond(String nameSecond) {
        this.nameSecond = nameSecond;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student.specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Student.specialty specialty) {
        this.specialty = specialty;
    }

    public Student.uni getUni() {
        return uni;
    }

    public void setUni(Student.uni uni) {
        this.uni = uni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

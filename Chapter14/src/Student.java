public class Student {


    static int numberOfStudents = 0;
    private String nameFirst;
    private String nameSecond;
    private String nameLast;
    private int year;
    private String specialty;
    private String uni;
    private String email;
    private String phone;

    public Student(String nameFirst, String nameSecond, String nameLast,int year, String specialty, String uni,
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


    public Student() {
        numberOfStudents++;
    }

    public static int getNumberOfStudents() {

        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {

        Student.numberOfStudents = numberOfStudents;
    }

    public String toString() {
        return nameFirst + " " + nameSecond + " " + nameLast +", " +
                "year: " + year + ", " +
                "specialty: " + specialty + " at " + uni + " University" + ", " +
                "email: " + email + ", phone: " + phone;
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

    public String getSpecialty() {

        return specialty;
    }

    public void setSpecialty(String specialty) {

        this.specialty = specialty;
    }

    public String getUni() {

        return uni;
    }

    public void setUni(String uni) {

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

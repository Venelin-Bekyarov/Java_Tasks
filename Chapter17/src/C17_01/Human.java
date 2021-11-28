package C17_01;

public class Human {

    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int compareTo(Human other) {
        int comparison = this.firstName.compareTo(other.firstName);
        if (comparison == 0) {
            comparison = this.lastName.compareTo(other.lastName);
        }
        return comparison;
    }


    public String toString() {
        return "Person (" +
                firstName + ' ' + lastName + ')' + '\n';
    }
}

package C17_05;

public class Tomcat extends Animal {
    public Tomcat(int age, String name, AnimalTest.Gender animalGender) {
        super(age, name, animalGender);
        this.sound = "DogBau";
    }

    protected String getAnimalSound() {
        return this.sound;
    }
}

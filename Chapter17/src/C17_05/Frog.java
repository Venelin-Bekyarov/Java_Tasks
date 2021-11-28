package C17_05;

public class Frog extends Animal {

    public Frog(int age, String name, AnimalTest.Gender animalGender) {
        super(age, name, animalGender);
        this.sound = "FrogQuack";
    }

    protected String getAnimalSound() {
        return this.sound;
    }
}

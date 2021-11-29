package C20_05;

public class Dog extends Animal {

    public Dog(int age, String name, AnimalTest.Gender animalGender) {
        super(age, name, animalGender);
        this.sound = "DogBau";
    }

    protected String getAnimalSound() {
        return this.sound;
    }
}


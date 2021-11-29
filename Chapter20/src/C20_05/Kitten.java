package C20_05;

public class Kitten extends Animal{
    public Kitten(int age, String name, AnimalTest.Gender animalGender) {
        super(age, name, animalGender);
        this.sound = "KittenMeow";
    }

    protected String getAnimalSound() {
        return this.sound;
    }
}

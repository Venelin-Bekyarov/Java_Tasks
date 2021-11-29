package C20_05;

public class Cat extends Animal {
    public Cat(int age, String name, AnimalTest.Gender animalGender) {
        super(age, name, animalGender);
        this.sound = "CatMeow";
    }

    protected String getAnimalSound() {
        return this.sound;
    }
}

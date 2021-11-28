package C17_05;

public abstract class Animal {

    protected int age;
    protected String name;
    protected AnimalTest.Gender animalGender;

    protected String sound;

    protected Animal(int age, String name, AnimalTest.Gender animalGender) {
        this.age = age;
        this.name = name;
        this.animalGender = animalGender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public AnimalTest.Gender getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(AnimalTest.Gender animalGender) {
        this.animalGender = animalGender;
    }

    protected String getAnimalSound() {
        return this.sound;
    }


    public String toString() {
        String animalInformation = String.format("%d %s %s %s",
                this.getAge(), this.getName(),this.getAnimalGender(), this.getAnimalSound());
        return animalInformation;
    }
}


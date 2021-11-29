package C20_05;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalTest {

    //Input pattern:

    /**
     * 2
     * Dog 8 Barney Male
     * Cat 3 Eleanor Female
     **/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputAnimalsCount = scanner.nextLine();
        int animalsCount = Integer.parseInt(inputAnimalsCount);
        ArrayList<Animal> animals = readAnimals(animalsCount);
        printAnimals(animals);
    }

    private static ArrayList<Animal> readAnimals(int animalsCount) {
        ArrayList<Animal> animals = new ArrayList<>(animalsCount);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < animalsCount; i++) {
            String line = scanner.nextLine();
            String[] splitLine = line.split("\\s+");
            String animalType = splitLine[0];
            int age = Integer.parseInt(splitLine[1]);
            String name = splitLine[2];
            String gender = splitLine[3];
            Gender animalGender;
            if (gender.equals("Male")) {
                animalGender = Gender.Male;
            } else {
                animalGender = Gender.Female;
            }


            switch (animalType) {
                case "Cat": {
                    animals.add(new Cat(age, name, animalGender));
                    break;
                }
                case "Dog": {
                    animals.add(new Dog(age, name, animalGender));
                    break;
                }
                case "Frog": {
                    animals.add(new Frog(age, name, animalGender));
                    break;
                }
                case "Kitten": {
                    animals.add(new Kitten(age, name, animalGender));
                    break;
                }

                case "Tomcat": {
                    animals.add(new Tomcat(age, name, animalGender));
                    break;
                }
            }
        }
        return animals;
    }

    private static void printAnimals(ArrayList<Animal> listOfAnimals) {
        for (var animal : listOfAnimals) {
            System.out.println(animal);
        }
    }

    public enum Gender {
        Female, Male
    }
}

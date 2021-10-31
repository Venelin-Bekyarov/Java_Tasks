//Задача 4:
//Напишете метод, който намира колко пъти дадено число се среща в
//даден масив.


import java.util.Scanner;

public class C9_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will check whether a number is consisted in a group of numbers. %n" +
                "Please describe how many numbers you will enter: ");
        int arrayLength = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input the numbers: ");
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Number to search for: ");
        int numToSearch = Integer.parseInt(scanner.nextLine());

        System.out.printf("Found %d times", CheckNum(array, numToSearch));
    }

    static int CheckNum(int[] array, int num) {
        int numberCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) numberCount++;
        }
        return numberCount;
    }
}
//Задача 2:
//Да се напише програма, която чете два масива от конзолата и проверява
//дали са еднакви.

import java.util.Scanner;

public class C7_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to check whether two arrays entered are equal.%n" +
                "Please enter the arrays elements:%n");
        String inputArrayOne = scanner.nextLine();
        String inputArrayTwo = scanner.nextLine();

        String[] inputOne = inputArrayOne.split(" ");
        String[] inputTwo = inputArrayTwo.split(" ");

        int[] arr1 = new int[inputOne.length];
        for (int i = 0; i < inputOne.length; i++) {
            arr1[i] = Integer.parseInt(inputOne[i]);
        }
        int[] arr2 = new int[inputTwo.length];
        for (int i = 0; i < inputTwo.length; i++) {
            arr2[i] = Integer.parseInt(inputTwo[i]);
        }
        int counterEqualElements = 0;
        if (arr1.length != arr2.length) {
            System.out.println("The arrays are not equal.");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    counterEqualElements++;
                }
            }
            if (counterEqualElements == arr1.length) {
                System.out.println("Arrays are equal.");
            } else {
                System.out.println("The arrays are not equal.");
            }
        }
    }
}

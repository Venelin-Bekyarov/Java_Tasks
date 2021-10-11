//Задача 3:
//Напишете програма, която чете от конзолата поредица от цели числа и
//отпечатва най-малкото и най-голямото от тях.

import java.util.Scanner;

public class C6_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to find the lowest and greatest between the integers entered.%n" +
                "Please describe the integers count to be compared:%n ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 2) System.out.printf("Invalid input%n");
        System.out.printf("Please enter the integers:%n");
        int lowest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (lowest > currentNumber) {
                lowest = currentNumber;
            }
            if (greatest < currentNumber) {
                greatest = currentNumber;
            }

        }
        System.out.printf("Lowest integer is %d%n", lowest);
        System.out.printf("Greatest integer is %d%n", greatest);
        System.out.println("Thank you.");
    }
}

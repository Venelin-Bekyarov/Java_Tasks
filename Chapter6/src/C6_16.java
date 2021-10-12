//Задача 16:
//Напишете програма, която по дадено число N отпечатва случайно число
//между 1 и N.


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class C6_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to generate a random number in range (1-N).%n" +
                "Please enter N:%n");
        while (true) {
            int max = Integer.parseInt(scanner.nextLine());

            if (max < 1) {
                System.out.printf("Invalid input!%n" +
                        "1 < N:%n");
                continue;
            }
            int min = 1;


            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

            System.out.printf("The generated random number is: %d",randomNum);
            System.exit(0);
        }
    }
}

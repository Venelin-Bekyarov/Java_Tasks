//Задача 11:
//Напишете програма, която пресмята на колко нули завършва факториела на дадено число.


import java.util.Scanner;

public class C6_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to check the number of '0' (zeros) in a factorial of N.%n" +
                "Please enter N in range (1-999):%n");
        while (true) {
            int n = Integer.parseInt(scanner.nextLine());

            if (n <= 0 || n > 999) {
                System.out.printf("Invalid input!%n" +
                        "N in range (1-999):%n");
                continue;
            }
            int zeros = 0;
            int divisor = 5;
            while (n / divisor >= 1) {
                zeros = zeros + (n / divisor);
                divisor *= 5;
            }
            System.out.printf("Number of zeros in N!: %d.", zeros);
            break;
        }
    }
}

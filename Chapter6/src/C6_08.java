//Задача 8:
//Напишете програма, която за дадено цяло число N, пресмята сумата:
//S = 1+1!/x + 2!/x^2 +...+ n!/x^n

import java.util.Scanner;

public class C6_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are going to solve equation: S = 1+1!/x+2!/x^2+...+n!/x^n.%n" +
                "Please enter N and X:%n");
        while (true) {
            int n = Integer.parseInt(scanner.nextLine());
            int x = Integer.parseInt(scanner.nextLine());
            if (n < 0 || n > 99 || x > 99) {
                System.out.printf("Invalid input!%n" +
                        "N in range (0...99), x <= 99:%n");
                continue;
            }
            double nFactorial = 1;
            double outcomeSum = 1;
            double xPowersOf = 1;
            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
                xPowersOf *= x;
                outcomeSum += (nFactorial / xPowersOf);

            }
            System.out.printf("Result is %.2f.", outcomeSum);
            break;
        }
    }
}
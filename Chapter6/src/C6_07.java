//Задача 7:
//Напишете програма, която пресмята N!*K!/(N-K)! за дадени N и K.


import java.util.Scanner;

public class C6_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are going to find result of !N*!K/(N-K)!.%n" +
                "Please enter N and K:%n");
        while (true) {
            int n = Integer.parseInt(scanner.nextLine());
            int k = Integer.parseInt(scanner.nextLine());
            if (k >= n || n <= 1 || k <= 1 || n > 100) {
                System.out.printf("Invalid input!%n" +
                        "N in range (3-100), K in range (2-99) and N not equal to K:%n");
                continue;
            }
            long factorialOne = 1;
            for (int i = n; i > (n - k); i--) {
                factorialOne *= i;
            }
            long factorialTwo = 1;
            for (int l = k; l > 1; l--) {
                factorialTwo *= l;
            }
            long outcome = factorialOne * factorialTwo;
            System.out.printf("Result is %d.", outcome);
            break;
        }
    }
}

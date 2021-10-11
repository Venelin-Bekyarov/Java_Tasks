//Задача 9:
//В комбинаториката числата на Каталан (Catalan’s numbers) се
//изчисляват по следната формула: Cn= (2n)!/(n+1)!n!, за n ≥ 0
//Напишете програма, която изчислява N-тото число на Каталан за дадено N.

import java.math.BigInteger;
import java.util.Scanner;

public class C6_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are going to find `N count` Catalan number." +
                "Please enter N in range (0...1000):%n");
        while (true) {
            int k = Integer.parseInt(scanner.nextLine());
            int n = k-1;
            if (k < 0 || k > 10000) {
                System.out.printf("Invalid input!%n" +
                        "N in range (0...1000):%n");
                continue;

            }
            BigInteger upperLine = new BigInteger("1");
            for (int i = 2 * n; i > n + 1; i--) {
                upperLine = upperLine.multiply(BigInteger.valueOf(i));
            }
            BigInteger bottomLine = new BigInteger("1");
            for (int l = n; l > 1; l--) {
                bottomLine = bottomLine.multiply(BigInteger.valueOf(l));
            }
            BigInteger outcome = upperLine.divide(bottomLine);
            System.out.printf("Result is %d.", outcome);
            break;

        }

    }
}

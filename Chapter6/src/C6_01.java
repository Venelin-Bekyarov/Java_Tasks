//Задача 1:
//Напишете програма, която отпечатва на конзолата числата от 1 до N.
//Числото N се чете от стандартния вход.


import java.util.Scanner;

public class C6_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(scanner.nextLine());
            if ((n <= 0) || (n > 100)) {
                System.out.printf("Invalid input! Range (1-100)%n");
                continue;
            }


            for (int i = 1; i <= n; i++) {
                System.out.printf("%d%n", i);
            }
            break;
        }

    }
}
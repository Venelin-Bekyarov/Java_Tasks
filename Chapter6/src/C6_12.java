//Задача 12:
//Напишете програма, която преобразува дадено число от десетична в
//двоична бройна система.


import java.util.Scanner;

public class C6_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a number N into a binary number.%n" +
                "Please enter N in range (1-10000):%n");
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 0) {
            System.out.println("Binary format of number N is: 0");
            System.exit(0);
        }

        while (true) {
            if (n < 0 || n >= 10000) {
                System.out.printf("Invalid input!%n" +
                        "N in range (1-10000):%n");
                continue;
            }

            String result = "";

            while (n > 0) {
                result += n % 2;
                n = n / 2;

            }
            String reversed = new StringBuilder(result).reverse().toString();
            System.out.printf("Binary format of number N is: %s", reversed);
            break;
        }

    }

}


import java.util.Scanner;

public class C9_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program consists of three sub-options.");
        System.out.println("To reverse (mirror) a number                 press 1");
        System.out.println("To calculate the average of sequence         press 2");
        System.out.println("To solve the linear equation a * x + b = 0   press 3");
        System.out.println("Please choose an option:  ");
        int option = Integer.parseInt(scanner.nextLine());
        while (option < 1 || option > 3) {
            System.out.println("Wrong option! Enter again: ");
            option = Integer.parseInt(scanner.nextLine());
        }

        if (option == 1) {
            option1();
        } else if (option == 2) {
            option2();
        } else {
            option3();
        }
    }

    private static void option3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = Integer.parseInt(scanner.nextLine());
        while (a == 0) {
            System.out.println("Wrong! Enter again:");
            a = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter number b:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.printf("x = %.2f", (-b / (double) a));
    }

    private static void option2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers to sum:");
        int n = Integer.parseInt(scanner.nextLine());
        while (n < 1) {
            System.out.println("Wrong! Enter again: ");
            n = Integer.parseInt(scanner.nextLine());
        }
        int[] array = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            array[i] = Integer.parseInt(scanner.nextLine());
            sum += array[i];
        }
        System.out.print("Avg is " + sum / n);
    }

    private static void option1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("The initial number is: " + num);
        System.out.println("The new number is: " + reverse(num));
    }

    static int countDigits(int num) {
        int counter = 0;
        while (num != 0) {
            num /= 10;
            counter++;
        }
        return counter;
    }

    static int reverse(int num) {
        int counterTwo = countDigits(num);
        int tempNumber = 0;
        for (int i = counterTwo - 1; i >= 0; i--) {
            tempNumber += (num % 10) * (int) Math.pow(10, i);
            num /= 10;
        }
        return tempNumber;
    }
}
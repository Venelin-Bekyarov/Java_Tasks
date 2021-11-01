import java.util.Scanner;

public class C9_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will use a program to mirror a number entered. %n" +
                "Please enter your number: ");

        int number = Integer.parseInt(scanner.nextLine());

        int reverse = reverse(number);
        System.out.printf("The mirrored number of '%d' is '%d'.", number, reverse);
    }

    static int countDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    static int reverse(int num) {
        int cnt = countDigits(num);
        int tempNumber = 0;
        for (int i = cnt - 1; i >= 0; i--) {
            tempNumber += (num % 10) * (int) Math.pow(10, i);
            num /= 10;
        }
        return tempNumber;
    }
}


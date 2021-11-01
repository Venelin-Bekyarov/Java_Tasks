import java.util.Scanner;

public class C9_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int reverse = reverse(number);
        System.out.println(reverse);
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
        int tempNum = 0;
        for (int i = cnt - 1; i >= 0; i--) {
            tempNum += (num % 10) * (int) Math.pow(10, i);
            num /= 10;
        }
        return tempNum;
    }
}


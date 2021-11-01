import java.util.Scanner;

public class C9_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find factorial of number 'N'. %n" +
                "Please enter 'N' in range (1..100): ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Factorial of 'N' is:");
        int[] arrayOfDigits = factorial(number);

        boolean hasValueTillNow = false;
        for (int i = arrayOfDigits.length - 1; i >= 0; i--) {
            if (arrayOfDigits[i] != 0 || hasValueTillNow) {
                hasValueTillNow = true;

                System.out.print(arrayOfDigits[i]);
            }
        }
    }

    static int[] factorial(int number) {
        final int maxArrayLength = 158;
        int[] arrayOfDigits = new int[maxArrayLength];

        arrayOfDigits[0] = 1;

        for (int i = 2; i <= number; i++) {
            int transferValue = 0;
            for (int j = 0; j < maxArrayLength; j++) {
                int currentResult = arrayOfDigits[j] * i;
                currentResult += transferValue;

                int currentDigit = currentResult % 10;
                arrayOfDigits[j] = currentDigit;

                currentResult /= 10;
                transferValue = currentResult;
            }
        }
        return arrayOfDigits;
    }
}

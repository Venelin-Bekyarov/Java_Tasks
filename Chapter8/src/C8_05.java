//Задача 5:
//Да се напише програма, която преобразува двоично число в десетично.


import java.util.Scanner;

public class C8_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long binaryNumber, decimalNumber = 0;
        long multiplicator = 1;
        long temporary;
        System.out.printf("You will reveal the decimal equivalent of a binary number. %n" +
                "Please enter a binary number: ");

        binaryNumber = scanner.nextLong();
        while (binaryNumber!=0) {
            temporary= binaryNumber%10;
            decimalNumber += temporary*multiplicator;
            multiplicator = multiplicator*2;
                    binaryNumber = binaryNumber/10;
        }
        System.out.println("Decimal equivalent: ");
        System.out.println(decimalNumber);
    }
}

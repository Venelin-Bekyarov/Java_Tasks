import java.util.Scanner;

public class C8_01A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("This program will convert a decimal number to its binary equivalent.%n" +
                "Enter the decimal number: ");
        float decimalToBinary = Float.parseFloat(scanner.nextLine());


        System.out.printf("the binary equivalent is: %s", Long.toBinaryString(Float.valueOf(decimalToBinary).longValue()));
    }
}


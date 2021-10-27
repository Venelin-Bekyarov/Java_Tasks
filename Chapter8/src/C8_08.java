//Задача 8:
//Да се напише програма, която преобразува шестнадесетично число в
//двоично.


import java.util.Scanner;

public class C8_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a hexadecimal number N into a binary number.%n" +
                "Please enter a hexadecimal number: %n");

        String inputHexRepresentation = scanner.nextLine();

        String binaryRepresentation = "";

        for (int i = inputHexRepresentation.length() - 1; i >= 0; i--) {
            char hexadecimalDigit = inputHexRepresentation.charAt(i);
            byte decimalRepresentation = 0;
            if (Character.isDigit(hexadecimalDigit)) {
                decimalRepresentation = (byte) (hexadecimalDigit - '0');
            }
            else
            {
                switch (hexadecimalDigit) {
                    case 'A':
                        decimalRepresentation = 10;
                        break;
                    case 'B':
                        decimalRepresentation = 11;
                        break;
                    case 'C':
                        decimalRepresentation = 12;
                        break;
                    case 'D':
                        decimalRepresentation = 13;
                        break;
                    case 'E':
                        decimalRepresentation = 14;
                        break;
                    case 'F':
                        decimalRepresentation = 15;
                        break;
                }
            }

            // Convert to binary
            while (decimalRepresentation != 0) {
                byte remainder = (byte) (decimalRepresentation % 2);
                binaryRepresentation = remainder + binaryRepresentation;
                decimalRepresentation = (byte) (decimalRepresentation / 2);
            }

            while (binaryRepresentation.length() % 4 != 0) {
                binaryRepresentation = '0' + binaryRepresentation;
            }
            binaryRepresentation = " " + binaryRepresentation;
        }

        System.out.printf("Binary equivalent of number '%s' is: %s",inputHexRepresentation, binaryRepresentation);
    }
}

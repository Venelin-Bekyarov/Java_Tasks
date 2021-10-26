//Задача 7:
//Да се напише програма, която преобразува шестнадесетично число в
//десетично.


import java.util.Scanner;

public class C8_07 {
    public static int getDecimal(String hexTemp) {
        String digits = "0123456789ABCDEF";
        hexTemp = hexTemp.toUpperCase();
        int decimalValue = 0;
        for (int i = 0; i < hexTemp.length(); i++) {
            char charIndex = hexTemp.charAt(i);
            int digitOfChar = digits.indexOf(charIndex);
            decimalValue = 16 * decimalValue + digitOfChar;
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexadecimalInput = scanner.nextLine();
        System.out.printf("Decimal of %s is: %s", hexadecimalInput, getDecimal(hexadecimalInput));

    }
}


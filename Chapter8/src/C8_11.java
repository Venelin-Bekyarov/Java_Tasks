//Задача 11:
//Да се напише програма, която преобразува римските числа в арабски.


import java.util.Scanner;

public class C8_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a Roman style digits number into a Arabic style digits number.%n" +
                "Please enter a Roman's digits number: %n");
        String romanNumber = scanner.nextLine();
        int decimalNumber = 0;
        char[] romans = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int[] arabics = {1000, 500, 100, 50, 10, 5, 1};
        for (int i = 0; i < romanNumber.length() - 1; i++) {
            int positionInRomans = 0;
            int positionInRomansNext = 0;
            for (int j = 0; j < romans.length; j++) {
                if (romanNumber.charAt(i) == romans[j]) {
                    positionInRomans = j;
                }
            }
            for (int j = 0; j < romans.length; j++) {
                if (romanNumber.charAt(i + 1) == romans[j]) {
                    positionInRomansNext = j;
                }
            }
            if (positionInRomans <= positionInRomansNext) {
                decimalNumber += arabics[positionInRomans];
            } else {
                decimalNumber -= arabics[positionInRomans];
            }
        }
        char lastChar = romanNumber.charAt(romanNumber.length() - 1);
        for (int i = 0; i < romans.length; i++) {
            int posLastChar = 0;
            if (lastChar == romans[i]) {
                posLastChar = i;
                decimalNumber += arabics[posLastChar];
            }

        }
        System.out.printf("Arabic style equivalent of number '%s' is: %d", romanNumber, decimalNumber);

    }
}

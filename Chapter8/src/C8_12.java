//Задача 12:
//Да се напише програма, която преобразува арабските числа в римски.


import java.util.Scanner;

public class C8_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform an Arabic style digits number into a Roman style digits number.%n" +
                "Please enter an Arabic's digits number: %n");
        short[] arabicRepresentation = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String[] romanRepresentation = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

        String inputArabicNumber = scanner.nextLine();
        int arabicNumber = Integer.parseInt(inputArabicNumber);
        String romanNumber = "";

        int currentPosition = arabicRepresentation.length;
        while ((arabicNumber > 0) && (currentPosition > 0))
        {
            while (arabicNumber >= arabicRepresentation[currentPosition - 1])
            {
                String romanDigit = romanRepresentation[currentPosition - 1];
                romanNumber = romanNumber + romanDigit;

                short arabicDigit = arabicRepresentation[currentPosition - 1];
                arabicNumber = arabicNumber - arabicDigit;
            }

            currentPosition--;
        }

        System.out.printf("Arabic style equivalent of number '%s' is: %s",inputArabicNumber,romanNumber);
    }
}

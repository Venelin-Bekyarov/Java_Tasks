//Задача 13:
//Да се напише програма, която определя (отпечатва) стойността на
//мантисата, знака на мантисата и стойността на експонентата за числа
//от тип float и double


import java.util.Scanner;

public class C8_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("The current program will print a floating point number's polarity, exponent and mantissa.%n" +
                "Please enter a floating point number: %n");
        float signedFloatNum = Float.parseFloat(scanner.nextLine());
        int exponentDec = 0;
        char sign = '0';
        int eightBit = 127;
        float normalizationLimit = 1;
        int pointOneFloatMantissa = 22;
        for (int i = 0; i < eightBit-1; i++) {
            normalizationLimit /= 2;
        }

        if (signedFloatNum < 0) {
            sign = '1';
            signedFloatNum = -signedFloatNum;
        }

        String exponentBin = "";
        String mantissaBin = "";

        if (signedFloatNum == 0) {
            exponentBin = "00000000";
            mantissaBin = "00000000000000000000000";
        } else if (signedFloatNum >= normalizationLimit) {
            if (signedFloatNum >= 2) {
                while (signedFloatNum >= 2) {
                    exponentDec++;
                    signedFloatNum /= 2;
                }
            }
            if (signedFloatNum < 1) {
                while (signedFloatNum < 1) {
                    exponentDec--;
                    signedFloatNum *= 2;
                }
            }

            float mantissaDec = signedFloatNum - 1;
            float tmpN = 0;
            float dN = 0.5f;

            for (int i = 0; i < pointOneFloatMantissa +1; i++) {
                if (mantissaDec >= tmpN + dN) {
                    tmpN += dN;
                    mantissaBin = mantissaBin + '1';
                } else {
                    mantissaBin += '0';
                }
                dN /= 2;
            }
            int exponentLengthDigits = 8;
            int exponentDecShift = exponentDec + eightBit;
            for (int i = 0; i < exponentDecShift; i++) {
                if (exponentDecShift % 2 == 1) {
                    exponentBin = "1" + exponentBin;
                } else {
                    exponentBin = "0" + exponentBin;
                }
                exponentDecShift /= 2;
            }
        } else {
            exponentBin = "00000000";
            signedFloatNum /= normalizationLimit;
            float mantissaDec = signedFloatNum;
            float tempNum = 0;
            float doubleNum = 0.5f;

            for (int i = 0; i < pointOneFloatMantissa +1; i++) {
                if (mantissaDec >= tempNum + doubleNum) {
                    tempNum += doubleNum;
                    mantissaBin = mantissaBin + '1';
                } else {
                    mantissaBin += '0';
                }
                doubleNum /= 2;
            }
        }
        System.out.println();
        System.out.printf("The floating point number's %n" +
                "polarity: %c %n" +
                "exponent: %s %n" +
                "mantissa: %s", sign, exponentBin, mantissaBin);

    }
}

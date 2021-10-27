//Задача 9:
//Да се напише програма, която преобразува двоично число в шестнадесетично.


import java.util.Scanner;

public class C8_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a binary number into a hexadecimal number.%n" +
                "Please enter a binary number: %n");
        double inputBinaryNumber = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        long overDecimal = 0;
        String hexaDecimal = "";
        while (inputBinaryNumber > 0) {
            overDecimal = overDecimal + (long) (Math.pow(2, counter) * (long) (inputBinaryNumber % 10));
            inputBinaryNumber = (long) inputBinaryNumber / 10;
            counter++;
        }
        while (overDecimal > 0) {
            long hexaIndex = overDecimal % 16;
            if (hexaIndex == 10) {
                hexaDecimal = "A" + hexaDecimal;
            } else if (hexaIndex == 11) {
                hexaDecimal = "B" + hexaDecimal;
            } else if (hexaIndex == 12) {
                hexaDecimal = "C" + hexaDecimal;
            } else if (hexaIndex == 13) {
                hexaDecimal = "D" + hexaDecimal;
            } else if (hexaIndex == 14) {
                hexaDecimal = "E" + hexaDecimal;
            } else if (hexaIndex == 15) {
                hexaDecimal = "F" + hexaDecimal;
            } else {
                hexaDecimal = hexaIndex + hexaDecimal;
            }
            overDecimal = overDecimal / 16;
        }
        System.out.println("The respective hexadecimal number is : " + hexaDecimal);
    }
}

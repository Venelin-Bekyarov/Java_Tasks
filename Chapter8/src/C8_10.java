//Задача 10:
//Да се напише програма, която преобразува двоично число в десетично
//по схемата на Хорнер.


import java.util.Scanner;

public class C8_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryNumber = scanner.nextLine();
        int decimalNumber = 2;
        for (int i = binaryNumber.length() -2; i >= 0; i--) {
            char indexChar = binaryNumber.charAt(i);
            decimalNumber =  2* decimalNumber + Integer.parseInt(Character.toString(indexChar));
        }
        if (binaryNumber.charAt(binaryNumber.length() - 1) == '0') {
            decimalNumber -= 1;
        }
        System.out.println(decimalNumber);
    }
}



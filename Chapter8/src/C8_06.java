//Задача 6:
//Да се напише програма, която преобразува десетично число в
//шестнадесетично.


import java.util.Scanner;

public class C8_06 /* Similar to C6_14*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a decimal number N into a hexadecimal number.%n" +
                "Please enter N: %n");
        int decimalNumber = Integer.parseInt(scanner.nextLine());
        String hex = Integer.toString(decimalNumber, 16);
        System.out.println("Hexadecimal number of N is: " + hex.toUpperCase());

    }
}

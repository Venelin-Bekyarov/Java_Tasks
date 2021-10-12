//Задача 14:
//Напишете програма, която преобразува дадено число от десетична в
//шестнадесетична бройна система.


import java.util.Scanner;

public class C6_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a decimal number N into a hexadecimal number.%n" +
                "Please enter N:%n");

        int decimal = Integer.parseInt(scanner.nextLine());
        String str = Integer.toHexString(decimal);
        System.out.printf("Hexadecimal number of N is: %s", str);
        System.exit(0);
    }
}

//Задача 15:
//Напишете програма, която преобразува дадено число от
//шестнадесетична в десетична бройна система.


import java.util.Scanner;

public class C6_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a hexadecimal number N into a decimal number.%n" +
                "Please enter N:%n");

        String hex = scanner.nextLine();
        int decimal=Integer.parseInt(hex,16);

        System.out.printf("The decimal equivalent of hexadecimal number N is: %d",decimal);
    }
}

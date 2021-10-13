//Задача 13:
//Напишете програма, която преобразува дадено число от двоична в
//десетична бройна система.


import java.util.Scanner;

public class C6_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will transform a binary number N into a decimal number.%n" +
                "Please enter N:%n");

        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);

        System.out.printf("The decimal equivalent of binary number N is: %d",decimal);
    }

}


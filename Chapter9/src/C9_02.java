//Задача 2:
//Създайте метод getMax() с два целочислени (int) параметъра, който
//връща по-голямото от двете числа. Напишете програма, която прочита
//три цели числа от конзолата и отпечатва най-голямото от тях, използвайки метода getMax().

import java.util.Scanner;

public class C9_02 {
    public static void main(String[] args) {
        System.out.printf("You are about to find the greatest of three numbers.%n" +
                "Please enter three numbers:%n");
        Scanner scanner = new Scanner(System.in);
        int aNumber = Integer.parseInt(scanner.nextLine());
        int bNumber = Integer.parseInt(scanner.nextLine());
        int cNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("The greatest number is:");
        System.out.println(GetMax(GetMax(aNumber, bNumber), cNumber));
    }

    private static int GetMax(int a, int b) {
        if (a > b) return a;
        else return b;
    }
}


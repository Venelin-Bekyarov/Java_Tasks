//Задача 1:
//Напишете метод, който при подадено име отпечатва в конзолата "Hello, <name>!"

import java.util.Scanner;

public class C9_01 {
    private static void printHello(String name) {
        System.out.printf("Hello, %s!", name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        printHello(inputName);
    }
}



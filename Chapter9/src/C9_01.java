//Задача 1:
//Напишете метод, който при подадено име отпечатва в конзолата "Hello, <name>!"

import java.util.Scanner;

public class C9_01 {
    public static void main(String[] args) {
        String myNameToBePrinted;
        myNameToBePrinted = InputName();
        System.out.printf("Hello, %s!", myNameToBePrinted);
    }

    private static String InputName() {
        Scanner scanner = new Scanner(System.in);
        String nameInput;
        System.out.println("Input your name ");
        nameInput = scanner.nextLine();
        return nameInput;
    }
}


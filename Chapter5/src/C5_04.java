import java.util.Scanner;

public class C5_04 {
    //Задача 4:
    //Напишете програма, която за дадена цифра (0-9), зададена като вход,
    //извежда името на цифрата на български език.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a whole number in range (0-9):");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0 || number > 9) {
            System.out.println("Error! Number must be in range (0-9)!");
        }

        switch (number) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
        }

    }
}

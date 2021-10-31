//Задача 3:
//Напишете метод, който връща английското наименование на последната
//цифра от дадено число.

import java.util.Scanner;

public class C9_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.parseInt(scanner.nextLine());

        String lastDigit = GetLast(num % 10);
        System.out.printf("The last digit is '%s'.", lastDigit);
    }

    static String GetLast(int num) {
        if (num < 0) num = -num;

        if (num == 0) return "Zero";
        else if (num == 1) return "One";
        else if (num == 2) return "Two";
        else if (num == 3) return "Three";
        else if (num == 4) return "Four";
        else if (num == 5) return "Five";
        else if (num == 6) return "Six";
        else if (num == 7) return "Seven";
        else if (num == 8) return "Eight";
        return "Nine";
    }
}

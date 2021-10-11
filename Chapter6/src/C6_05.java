//Задача 5:
//Напишете програма, която чете от конзолата числото N и отпечатва
//сумата на първите N члена от редицата на Фибоначи: 0, 1, 1, 2, 3, 5, 8,
//13, 21, 34, 55, 89, 144, 233, 377, ...


import java.util.Scanner;

public class C6_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are going to display the Fibonacci sequence.%n" +
                "Please enter the number of elements:%n");
        int n = Integer.parseInt(scanner.nextLine());

        int a = -1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            System.out.printf("%d%n", c);
            a = b;
            b = c;
        }
    }

}

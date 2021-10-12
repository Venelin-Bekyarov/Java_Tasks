//Задача 10:
//Напишете програма, която чете от конзолата положително цяло число N
//(N < 20) и отпечатва матрица с числа в квадратна фигура:


import java.util.Scanner;

public class C6_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("You are about to print an N rows and N columns square matrix figure.%n" +
                "Please enter N in range (1-19):%n");
        while (true) {
            int n = input.nextInt();
            if (n <= 0 || n >= 20) {
                System.out.printf("Invalid input!%n" +
                        "N in range (1-19):%n");
                continue;
            }
            for (int row = 0; row < n; row++) {
                int counter = row + 1;
                for (int col = 0; col < n; col++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
            } break;

        }
    }
}

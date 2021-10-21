//Задача 16:
//Напишете програма, която намира всички прости числа в диапазона
//[1..10 000 000].


import java.util.Scanner;

public class C7_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to find all prime numbers in range (0...N).%n" +
                "Enter (N): ");
        int n = Integer.parseInt(scanner.nextLine());
        boolean[] arrayFlag = new boolean[n];

        for (int i = 2; i < n; i++) {
            arrayFlag[i] = true;
        }

        for (int i = 2; i < n; i++) {
            if (arrayFlag[i]) {
                int j = i + 1;
                while (j < n) {
                    if (j % i == 0) {
                        arrayFlag[j] = false;
                    }
                    j++;
                }
            }
        }
        System.out.printf("The prime numbers in range (0...%d) are: ", n);
        for (int i = 2; i < n; i++) {
            if (arrayFlag[i]) {
                System.out.printf("%d  ", i);
            }
        }
    }
}

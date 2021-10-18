//Задача 6:
//Да се напише програма, която чете от конзолата две цели числа N и K,
//и масив от N елемента. Да се намерят тези K елемента, които имат
//максимална сума.

import java.util.Scanner;

public class C7_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("You will find the (K) elements in an array that creates a largest sum.%n" +
                "Enter array length (N): ");

        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter number of elements (K): ");
        int k = scan.nextInt();
        int sum = array[0];
        int sum2 = 0;
        int a = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Element number " + i + " = ");
            array[i] = scan.nextInt();
        }

        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < k; j++) {
                sum = array[i - 1] + array[i];
            }
            if (sum > sum2) {
                sum2 = sum;
                a = i;
            }
            sum = 0;
        }
        System.out.print("Largest sum of K elements: ");
        for (int i = k - 1; i > 0; i--) {
            System.out.print(array[a - i] + ", ");
        }
        System.out.print(array[a]);
    }
}
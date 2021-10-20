//Задача 7:
//Напишете програма, която сортира масив. Да се
//използва алгоритъма "Selection sort".


import java.util.Scanner;

public class C7_07 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to 'selection sort' an array entered.%n" +
                "Enter array length: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element number " + i + " = ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        int min;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
        System.out.print("Sorted array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", numbers[i]);
        }
    }
}

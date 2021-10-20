//Задача 13:
//Да се реализира двоично търсене (binary search) в сортиран
//целочислен масив.


import java.util.Arrays;
import java.util.Scanner;

public class C7_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to 'binary search' a required number in a sorted array entered.%n" +
                "Enter array's number of elements (length): ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element number " + i + " = ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);

        System.out.println("You are searching number: ");
        int toSearch = Integer.parseInt(scanner.nextLine());
        int begin = 0, end = n - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (toSearch == array[mid]) {
                break;
            } else {
                if (toSearch > array[mid]) {
                    begin = mid;
                } else {
                    end = mid;
                }

            }
        }
        int position = (begin + end) / 2;
        System.out.printf("The number %d is located at %d position in the SORTED array.", array[position], position);
    }
}

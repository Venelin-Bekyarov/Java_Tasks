//Задача 15:
//Напишете програма, която сортира целочислен масив по алгоритъма
//"quick sort".


import java.util.Random;
import java.util.Scanner;

public class C7_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to 'quick sort' an array entered.%n" +
                "Enter array's number of elements (length): ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element number " + i + " = ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        quickSort(array);
        System.out.println("Quick sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            Random pivotSelect = new Random();
            int pivot = pivotSelect.nextInt(left, right);
            int newPivot = partition(array, left, right, pivot);
            quickSortHelper(array, left, newPivot - 1);
            quickSortHelper(array, newPivot + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        int pivotValue = array[pivot];

        int swapValueForPivot = array[pivot];
        array[pivot] = array[right];
        array[right] = swapValueForPivot;

        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] < pivotValue) {
                int swapValueForStoreIndex = array[storeIndex];
                array[storeIndex] = array[i];
                array[i] = swapValueForStoreIndex;
                storeIndex++;
            }
        }

        int swapValueForFinalStoreIndex = array[storeIndex];
        array[storeIndex] = array[right];
        array[right] = swapValueForFinalStoreIndex;

        return storeIndex;
    }
}

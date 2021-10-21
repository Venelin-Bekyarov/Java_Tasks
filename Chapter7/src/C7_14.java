//Задача 14:
//Напишете програма, която сортира целочислен масив по алгоритъма
//"merge sort".


import java.util.Scanner;

public class C7_14 {

    public static void merge(int[] numbers, int left, int mid, int right) {

        int[] temp = new int[25];
        int i, leftEnd, numElements, tempPos;
        leftEnd = (mid - 1);
        tempPos = left;
        numElements = (right - left + 1);
        while ((left <= leftEnd) && (mid <= right)) {
            if (numbers[left] <= numbers[mid])
                temp[tempPos++] = numbers[left++];
            else
                temp[tempPos++] = numbers[mid++];
        }
        while (left <= leftEnd) {
            temp[tempPos++] = numbers[left++];
        }
        while (mid <= right) {
            temp[tempPos++] = numbers[mid++];
        }
        for (i = 0; i < numElements; i++) {
            numbers[right] = temp[right];
            right--;
        }
    }

    public static void mergeSort(int[] arrayNum, int left, int right) {
        int mid;
        if (right > left) {
            mid = (right + left) / 2;
            mergeSort(arrayNum, left, mid);
            mergeSort(arrayNum, (mid + 1), right);
            merge(arrayNum, left, (mid + 1), right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("You are about to 'merge sort' an array entered.%n" +
                "Enter array's number of elements (length): ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element number " + i + " = ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int len = n;
        mergeSort(array, 0, len - 1);
        System.out.println("Merge sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}


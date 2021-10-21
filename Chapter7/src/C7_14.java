//Задача 14:
//Напишете програма, която сортира целочислен масив по алгоритъма
//"merge sort".


import java.util.Scanner;

public class C7_14 {

    public static void merge(int[] numbers, int left, int mid, int right) {

        int[] temp = new int[25];
        int i, left_end, num_elements, tmp_pos;
        left_end = (mid - 1);
        tmp_pos = left;
        num_elements = (right - left + 1);
        while ((left <= left_end) && (mid <= right)) {
            if (numbers[left] <= numbers[mid])
                temp[tmp_pos++] = numbers[left++];
            else
                temp[tmp_pos++] = numbers[mid++];
        }
        while (left <= left_end) {
            temp[tmp_pos++] = numbers[left++];
        }
        while (mid <= right) {
            temp[tmp_pos++] = numbers[mid++];
        }
        for (i = 0; i < num_elements; i++) {
            numbers[right] = temp[right];
            right--;
        }
    }

    public static void mergeSort(int[] numbers, int left, int right) {
        int mid;
        if (right > left) {
            mid = (right + left) / 2;
            mergeSort(numbers, left, mid);
            mergeSort(numbers, (mid + 1), right);
            merge(numbers, left, (mid + 1), right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("You are about to merge sort an array entered.%n" +
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


import java.util.Scanner;

public class Test4_1 {

    static void combinationRepetitionUtil(int[] tempStore, int[] mainArray, int index, int k, int start, int end) {
        if (index == k) {
            for (int i = 0; i < k; i++) {
                System.out.printf("%d ", mainArray[tempStore[i]]);
            }
            System.out.printf("%n");
            return;
        }
        for (int i = start; i <= end; i++) {
            tempStore[index] = i;
            combinationRepetitionUtil(tempStore, mainArray, index + 1, k, i, end);
        }
    }

    static void combinationRepetition(int[] arr, int n, int k) {

        int[] chosen = new int[k + 1];
        combinationRepetitionUtil(chosen, arr, 0, k, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int k = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            combinationRepetition(arr, n, k);
        }
    }
}

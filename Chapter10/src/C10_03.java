import java.util.Scanner;

public class C10_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find all sub-sets of 'K'-number of strings %n" +
                "generated from elements of the aggregate given. %n" +
                "Please enter 'K': ");

        int k = Integer.parseInt(scanner.nextLine());
        String[] arr = {"test", "rock", "fun"};
        int n = arr.length;

        System.out.println("The sub-sets are: ");
        combRepeating(arr, n, k);
    }

    static void combRepeating(String[] arr, int n, int k) {

        int[] chosen = new int[k + 1];
        combinationLookUp(chosen, arr, 0, k, 0, n - 1);
    }

    static void combinationLookUp(int[] tempStore, String[] mainArray, int index, int k, int start, int end) {

        if (index == k) {
            for (int i = 0; i < k; i++) {
                System.out.printf("%S ", mainArray[tempStore[i]]);
            }
            System.out.printf("%n");
            return;
        }
        for (int i = start; i <= end; i++) {
            tempStore[index] = i;
            combinationLookUp(tempStore, mainArray, index + 1, k, i, end);
        }
    }
}


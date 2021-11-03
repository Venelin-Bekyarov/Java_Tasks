import java.util.Scanner;

public class C10_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find all repetitive combinations of 'K' elements over 'N'-elements aggregate. %n" +
                "Please enter 'N': ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        System.out.print("please enter 'K': ");
        int k = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("The combinations are: ");
        combRepeating(arr, n, k);
    }

    static void combRepeating(int[] arr, int n, int k) {

        int[] chosen = new int[k + 1];
        combinationLookUp(chosen, arr, 0, k, 0, n - 1);
    }

    static void combinationLookUp(int[] tempStore, int[] mainArray, int index, int k, int start, int end) {

        if (index == k) {
            for (int i = 0; i < k; i++) {
                System.out.printf("%d ", mainArray[tempStore[i]]);
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



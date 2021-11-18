import java.util.Scanner;

public class Test5_2 {
    static void chooseElement(int n, int k, int index, int[] holder) {
        if (index == k) {
            holderPrint(k, holder);
        } else {
            for (int i = 1; i <= n; i++) {
                holder[index] = i;
                chooseElement(n, k, index + 1, holder);
            }
        }
    }

    static void holderPrint(int k, int[] holder) {
        for (int i = 0; i < k; i++) {
            System.out.println(holder[i]);
            if (i < k - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int[] holder = new int[k];
        chooseElement(n, k, 0, holder);

    }
}

import java.util.Scanner;

public class C10_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find all repetitive variations of 'N' elements of 'K' class. %n" +
                "Please enter 'N': ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter 'K': ");
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println("The variations are: ");
        int[] holder = new int[k];

        chooseElement(n, k, 0, holder);
    }
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
            System.out.print(holder[i]);
            if (i < k - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

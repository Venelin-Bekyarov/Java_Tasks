import java.util.Scanner;

public class C10_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will reveal a number's permutations. %n" +
                "Please enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.printf("Permutations of '%d' are: %n", n);
        boolean[] usedNumbers = new boolean[n];
        int[] permutation = new int[n];
        findPermutations(n, 0, usedNumbers, permutation);
    }

    static void findPermutations(int n, int permIndex, boolean[] usedNumbers, int[] permutation) {
        if (permIndex == n) {
            printPermut(permutation);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (usedNumbers[i] == false) {
                permutation[permIndex] = i + 1;
                usedNumbers[i] = true;
                findPermutations(n, permIndex + 1, usedNumbers, permutation);
                usedNumbers[i] = false;
            }
        }
    }

    static void printPermut(int[] permutation) {
        for (int i = 0; i < permutation.length; i++) {
            System.out.print(permutation[i]);
            if (i < permutation.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

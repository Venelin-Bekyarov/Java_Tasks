import java.util.Scanner;

public class Test2 {
    public static int N;
    public static int K;
    public static int[] loops;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        N = input.nextInt();
        System.out.print("K = ");
        K = input.nextInt();
        input.close();
        loops = new int[N];
        nestedLoops(0);
    }
    public static void nestedLoops(int currentLoop) {
        if (currentLoop == N) {
            printLoops();
            return;
        }
        for (int counter = 1; counter<= K; counter++) {
            loops[currentLoop] = counter;
            nestedLoops(currentLoop + 1);
        }
    }
    public static void printLoops() {
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", loops[i]);
        }
        System.out.println();
    }
}


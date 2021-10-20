import java.util.Scanner;

public class C7_10B {
    public static void main(String[] args) {
//B
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will print a square matrix expanding in a snake shape.%n" +
                "Enter square length (rows/columns): ");
        int N = Integer.parseInt(scanner.nextLine());
        int[][] arrayNN = new int[N][N];

        int k = 0;
        for (int i = 0; i < N; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 1; j <= N; j++)
                {
                    arrayNN[j - 1][i] = i + j + k;
                }
                k += 2 * N - 1;
            }
            else
            {
                for (int j = 0; j < N; j++)
                {
                    arrayNN[j][i] = i - j + k;
                }
                k -= 1;
            }
        }
        System.out.println("The square matrix: ");
        for (int i = 0; i < arrayNN[0].length; i++)
        {
            for (int j = 0; j < arrayNN[1].length; j++)
            {
                System.out.printf("%s  ",arrayNN[i][j]);
            }
            if (i != arrayNN[0].length)
            {
                System.out.println();
            }
        }
    }
}

//Задача 10:
//Напишете програма, която създава квадратни матрици и ги
//извежда на конзолата във форматиран вид.


import java.util.Scanner;

public class C7_10A {
    public static void main(String[] args) {

//A
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will print a square matrix expanding in a vertical sequence.%n" +
                "Enter square length (rows/columns): ");
        int N = Integer.parseInt(scanner.nextLine());
        int[][] arrayNN = new int[N][N];

        int k = 0;
        for (int i = 0; i < N; i++)
        {

            for (int j = 0; j < N; j++)
            {
                arrayNN[j][i] = i + j + k + 1;
            }
            k += N - 1;
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

//Задача 11:
//Да се напише програма, която създава правоъгълна матрица с размер
//(n, m). Размерността и елементите на матрицата да се четат от
//конзолата. Да се намери подматрицата с размер (3,3), която има
//максимална сума.


import java.util.Scanner;

public class C7_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will create a square matrix array with (N) lines and (M) columns %n" +
                "and will get the highest sum subarray of 3x3 elements. %n" +
                "Enter array's lines number (N): ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Now enter array's columns number (M): ");
        int m = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[n][m];
        System.out.printf("Please enter N&M-count elements divided by space: %n");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] transformation = input.split(" ");
            for (int j = 0; j < m; j++) {
                array[i][j] = Integer.parseInt(transformation[j]);
            }

        }

        int currentSum = 0;
        int maxSum = 0;
        int maxSquareX = 0;
        int maxSquareY = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                for (int i2 = i; i2 < i + 3; i2++) {
                    for (int j2 = j; j2 < j + 3; j2++) {
                        currentSum += array[i2][j2];
                    }
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSquareX = j;
                    maxSquareY = i;
                }
                currentSum = 0;
            }
        }
        System.out.println("The highest sum 3x3 subarray is: ");
        for (int i2 = maxSquareY; i2 < maxSquareY + 3; i2++) {
            for (int j2 = maxSquareX; j2 < maxSquareX + 3; j2++) {
                System.out.print(array[i2][j2] + " ");
            }
            System.out.println();
        }


    }
}


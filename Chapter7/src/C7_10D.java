import java.util.Scanner;

public class C7_10D {
    public static void main(String[] args) {

//D
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will print a square matrix expanding in a helix.%n" +
                "Enter square length (rows/columns): ");
        int N = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[N][N];
        int xCoord = 0;
        int yCoord = 0;
        int direction = 0;
        int side = array[0].length;
        int[][] navigator = {
                { 1, 0 },
                { 0, 1 },
                { -1, 0 },
                { 0, -1 }
        };
        for (int k = 1; k <= side * side; k++)
        {
            array[xCoord][yCoord] = k;
            int nextXcoord = xCoord + navigator[direction][0];
            int nextYcoord = yCoord + navigator[direction][1];
            if (nextXcoord == side || nextXcoord == -1 || nextYcoord == side || nextYcoord == -1
                    || array[nextXcoord][nextYcoord] != 0)
            {
                direction++;
                direction %= 4;
            }
            xCoord += navigator[direction][0];
            yCoord += navigator[direction][1];
        }
        System.out.println("The square matrix: ");
        for (int i = 0; i < array[0].length; i++)
        {
            for (int j = 0; j < array[1].length; j++)
            {
                System.out.printf("%d  ", array[i][j]);
            }
            if (i != array[0].length)
            {
                System.out.println();
            }
        }
    }
}


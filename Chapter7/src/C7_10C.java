import java.util.Scanner;

public class C7_10C {
    public static void main(String[] args) {

//C

        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will print a square matrix expanding in a diagonal.%n" +
                "Enter square length (rows/columns): ");
        int N = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[N][N];

        int side = array[0].length;
        int coordX = side - 1;
        int coordY = 0;
        for (int counter = 1; counter <= side * side; counter++)
        {
            array[coordX][coordY] = counter;
            int nextX = coordX + 1;
            int nextY = coordY + 1;
            if (nextX == side && nextY != side)
            {
                coordX = (side - coordY - 2);
                coordY = 0;
            }
            else if (nextY == side)
            {
                coordY = (side - coordX);
                coordX = 0;
            }
            else
            {
                coordX = nextX;
                coordY = nextY;
            }
        }
        System.out.println("The square matrix: ");
        for (int i = 0; i < array[0].length; i++)
        {
            for (int j = 0; j < array[1].length; j++)
            {
                System.out.printf("%d  ",array[i][j]);
            }
            if (i != array[0].length)
            {
                System.out.println();
            }
        }
    }
}

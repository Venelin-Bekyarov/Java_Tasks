import java.util.Scanner;

public class C5_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your initial points:");

        int points = Integer.parseInt(scanner.nextLine());

        if ((points < 1) || (points > 9)) {
            System.out.println("Error! Initial points must be in range (1-9)");
        }

        switch (points) {
            case 1, 2, 3 -> {
                points = points * 10;
                System.out.printf("Final points are: %d", points);
            }
            case 4, 5, 6 -> {
                points = points * 100;
                System.out.printf("Final points are: %d", points);
            }
            case 7, 8, 9 -> {
                points = points * 1000;
                System.out.printf("Final points are: %d", points);
            }
        }
    }
}

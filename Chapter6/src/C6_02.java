import java.util.Scanner;

public class C6_02 {
    public static void main(String[] args) {
        System.out.printf("Please insert a whole number in range (1-100):%n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(scanner.nextLine());
            if ((n < 1) || (n > 100)) {
                System.out.printf("Invalid input! Range (1-100)%n");
                continue;
            }
            for (int i = 1; i <= n; i++) {
                if (i % 21 != 0) {
                    System.out.printf("%d%n", i);
                }
            }
            break;
        }

    }
}

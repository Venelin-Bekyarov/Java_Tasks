import java.util.Scanner;

public class C5_06a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("The greatest of five integers will be expressed.%n" +
                "Please insert five integers:%n");

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());

        if (a < b) {
            a = b;
        }
        if (a < c) {
            a = c;
        }
        if (a < d) {
            a = d;
        }
        if (a < e) {
            a = e;
        }

        System.out.printf("%d is the greatest integer.", a);

    }
}

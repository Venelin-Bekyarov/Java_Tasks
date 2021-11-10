import java.util.Scanner;

public class C11_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Math.sqrt(a*a +b*b);
        System.out.printf("Hypotenuse is: %f", c);
    }
}

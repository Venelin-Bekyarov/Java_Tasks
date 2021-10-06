import java.util.Scanner;

public class C5_02 {
    //Задача 2:
    //Напишете програма, която показва знака (+ или -) от частното на две
    //реални числа, без да го пресмята.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to check whether the division result is positive or negative.%nPlease input two numbers 'a' and 'b':%n");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        if (a > 0.0D && b > 0.0D) {
            System.out.println("result is (+)");
        } else if (a > 0.0D && b < 0.0D) {
            System.out.println("result is (-)");
        } else if (a < 0.0D && b > 0.0D) {
            System.out.println("result is (-)");
        } else if (a < 0.0D && b < 0.0D) {
            System.out.println("result is (+)");
        } else if (a == 0.0D || b == 0.0D) {
            System.out.println("result is (0)");
        }

    }
}

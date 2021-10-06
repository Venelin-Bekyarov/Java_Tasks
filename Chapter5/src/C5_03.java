import java.util.Scanner;

public class C5_03 {
    //Задача 4:
    //Напишете програма, която намира най-голямото по стойност число,
    //измежду три дадени числа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert three numbers to find the biggest one:");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        if (a > b) {
            if (a > c) {
                System.out.printf("Biggest number 'a'= %.2f", a);
            } else if (a < c) {
                System.out.printf("Biggest number 'c'= %.2f", c);
            } else {
                System.out.printf("Biggest numbers 'a'= %.2f and 'c'= %.2f", a, c);
            }
        } else if (a < b) {
            if (b > c) {
                System.out.printf("Biggest number 'b'= %.2f", b);
            } else if (b < c) {
                System.out.printf("Biggest number 'c'= %.2f", c);
            } else {
                System.out.printf("Biggest numbers 'b'= %.2f and 'c'= %.2f", b, c);
            }
        } else if (a == b) {
            if (a == c) {
                System.out.println("All numbers equal");
            } else if (a < c) {
                System.out.printf("Biggest number 'c'= %.2f", c);
            } else {
                System.out.printf("Biggest numbers 'a'= %.2f and 'b'= %.2f", a, b);
            }
        }

    }
}

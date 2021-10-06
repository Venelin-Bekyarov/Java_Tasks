import java.util.Scanner;
//Задача 1:
//Да се напише if-конструкция, която изчислява стойността на две
//целочислени променливи и разменя техните стойности, ако стойността
//на първата променлива е по-голяма от втората.

public class C5_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers 'a' and 'b'(on separate lines):");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a > b) {
            System.out.printf("'a' is greater than 'b', now 'a' = %d and 'b'= %d", b, a);
        } else if (a == b) {
            System.out.println("'a' is equal to 'b'!");
        } else {
            System.out.println("'b' is greater than 'a'!");
        }

    }
}

import java.util.Scanner;

public class C5_05 {
    //Задача 5:
    //Напишете програма, която при въвеждане на коефициентите (a, b и c)
    //на квадратно уравнение, изчислява и извежда неговите
    //реални корени.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are about to find the roots of a quadratic equation.%nPlease insert three numbers for (a), (b) and (c):");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double determinant = b * b - 4.0D * c * a;
        double root1;
        if (determinant == 0.0D) {
            root1 = -b / (2.0D * a);
            System.out.printf("root1 = root2 = %.2f", root1);
        } else if (determinant > 0.0D) {
            root1 = (-b + Math.sqrt(determinant)) / (2.0D * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2.0D * a);
            System.out.printf("root1 = %.2f%n", root1);
            System.out.printf("root2 = %.2f", root2);
        } else {
            System.out.println("No real root.");
        }

    }
}
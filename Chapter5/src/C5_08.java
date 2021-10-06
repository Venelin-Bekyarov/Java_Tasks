import java.util.Scanner;

public class C5_08 {
    //Задача 8:
    //Напишете програма, която прилага бонус точки към дадени точки в
    //интервала [1..9] чрез прилагане на следните правила:
    //- Ако точките са между 1 и 3, програмата ги умножава по 10.
    //- Ако точките са между 4 и 6, ги умножава по 100.
    //- Ако точките са между 7 и 9, ги умножава по 1000.
    //- Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.
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

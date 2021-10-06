import java.util.Scanner;

public class C5_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insert number between 0 and 999 and the program will express it with Bulgarian words:%n");

        int num = Integer.parseInt(scanner.nextLine());
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        if (a >= 1) {
            switch (a) {
                case 1 -> System.out.print("Сто ");
                case 2 -> System.out.print("Двеста ");
                case 3 -> System.out.print("Триста ");
                case 4 -> System.out.print("Четиристотин ");
                case 5 -> System.out.print("Петстотин ");
                case 6 -> System.out.print("Шестстотин ");
                case 7 -> System.out.print("Седемстотин ");
                case 8 -> System.out.print("Осемстотин ");
                case 9 -> System.out.print("Деветстотин ");
            }
            if ((b==1) && (c == 0)) {
                System.out.print("и ");
            }

            else if ((b <= 1) && (c!= 0)) {
                System.out.print("и ");
            }
        }
        if (b > 1) {
            switch (b) {
                case 2 -> System.out.print("двадесет ");
                case 3 -> System.out.print("тридесет ");
                case 4 -> System.out.print("четиридесет ");
                case 5 -> System.out.print("петдесет ");
                case 6 -> System.out.print("шестдесет ");
                case 7 -> System.out.print("седемдесет ");
                case 8 -> System.out.print("осемдесет ");
                case 9 -> System.out.print("деветдесет ");
            }
            if (c != 0) {
                System.out.print("и ");
            }
        }
        if ((b != 1) && (c != 0)) {
            switch (c) {
                case 1 -> System.out.print("едно");
                case 2 -> System.out.print("две");
                case 3 -> System.out.print("три");
                case 4 -> System.out.print("четири");
                case 5 -> System.out.print("пет");
                case 6 -> System.out.print("шест");
                case 7 -> System.out.print("седем");
                case 8 -> System.out.print("осем");
                case 9 -> System.out.print("девет");
            }
        }
        if (b == 1) {

            switch (c) {
                case 0 -> System.out.print("десет");
                case 1 -> System.out.print("единадесет");
                case 2 -> System.out.print("дванадесет");
                case 3 -> System.out.print("тринадесет");
                case 4 -> System.out.print("четиринадесет");
                case 5 -> System.out.print("петнадесет");
                case 6 -> System.out.print("шестнадесет");
                case 7 -> System.out.print("седемнадесет");
                case 8 -> System.out.print("осемнадесет");
                case 9 -> System.out.print("деветнадесет");
            }
        }
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("Нула");
        }
    }
}

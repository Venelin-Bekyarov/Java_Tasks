//Задача 9:
//Да се напише програма, която намира последователност от числа в
//масив, които имат сума равна на число, въведено от конзолата (ако има
//такава).


import java.util.Scanner;

public class mirroredNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int reminder;
        int mirrored = 0;
        while (n!=0) {
            reminder = n%10;
            mirrored = mirrored*10 + reminder;
            n=n/10;

        }
        System.out.println(mirrored);
    }
}

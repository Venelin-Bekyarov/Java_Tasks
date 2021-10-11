import java.util.Scanner;

public class C6_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("This is a standard deck of playing cards:%n");
        String[] rankType = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suitType = {" of Spades", " of Hearts", " of Clubs", " of Diamonds" };

        for (int i = 0; i < 52; i++) {
            System.out.printf("%s%s%n", rankType[i % 13], suitType[i / 13]);
        }

    }
}

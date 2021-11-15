import java.util.Scanner;

public class C13_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] defracted = sentence.split(" ");
        for (int i = defracted.length - 1; i >= 0; i--) {
            System.out.print(defracted[i] + " ");
        }
    }
}


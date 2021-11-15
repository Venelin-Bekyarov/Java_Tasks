import java.util.Scanner;

public class C13_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someText = scanner.nextLine();
        String reversed = reverseText(someText);
        System.out.println(reversed);
    }
    public static String reverseText(String niz) {
        StringBuilder sb = new StringBuilder();
        for (int i = niz.length() - 1; i >= 0; i--)
            sb.append(niz.charAt(i));
        return sb.toString();
    }
}

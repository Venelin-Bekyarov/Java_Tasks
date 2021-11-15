import java.util.Scanner;

public class C13_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find how many times a substring is used in a text. %n" +
                "Please enter the text to be checked: ");
        String textToBeChecked = scanner.nextLine();
        System.out.println("Please enter the substring you are looking for: ");
        String substring = scanner.nextLine();
        int count = countSubstringsAppearances(textToBeChecked.toLowerCase(), substring.toLowerCase());
        System.out.printf("Result is: %d",count);
    }

    private static int countSubstringsAppearances(String text, String substring) {
        if (substring.length() == 0) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while (true) {
            index = text.indexOf(substring, index);
            if (index == -1) {
                break;
            } else {
                count++;
                index++;
            }
        }
        return count;
    }
}

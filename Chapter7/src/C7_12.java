//Задача 12:
//Да се напише програма, която създава масив с всички букви от
//латинската азбука. Да се даде възможност на потребител да въвежда
//дума от конзолата и в резултат да се извеждат индексите на буквите от
//думата.


import java.util.Scanner;

public class C7_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alphabetArray = new String[26];
        System.out.printf("You will extract a letter indexes of a word. %n" +
                "Please enter a word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < 26; i++) {
            alphabetArray[i] = String.valueOf(Character.toChars(i + 65));
        }
        System.out.println();
        System.out.println("Indexes for the relevant letters are: ");
        for (int i = 0; i < word.length(); i++) {
            PrintIndexOfLetter(alphabetArray, word, i);
        }

    }

    private static void PrintIndexOfLetter(String[] alphabetArray, String word, int indexStart) {
        word = word.toUpperCase();

        for (int i = 0; i < 26; i++) {
            if (String.valueOf(word.charAt(indexStart)).equals(alphabetArray[i])) {
                System.out.printf("'%c': %d  ", word.charAt(indexStart), i);
                return;
            }
        }
        System.out.println("Error - Not a letter!");
    }
}


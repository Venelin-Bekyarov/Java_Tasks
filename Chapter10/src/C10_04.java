
import java.util.Arrays;
import java.util.Scanner;

public class C10_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find all sub-sets of a string aggregate. %n" +
                "Please enter number of strings: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter them strings: ");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        System.out.println("The sub-sets are: ");
        Arrays.sort(words);
        generateAllSubSets(words);

    }

    static void generateAllSubSets(String[] words) {
        for (int k = 1; k <= words.length; k++) {
            String[] subSet = new String[k];
            findSubSetsK(words, subSet, k, 0, 0);
        }
    }

    static void findSubSetsK(String[] words, String[] subSet, int k, int wordsStartInd, int subSetInd) {
        if (subSetInd < k) {
            for (int i = wordsStartInd; i <= words.length - k + subSetInd; i++) {
                subSet[subSetInd] = words[i];
                findSubSetsK(words, subSet, k, i + 1, subSetInd + 1);
            }
        } else {
            print(subSet);
        }
    }

    static void print(String[] subSet) {

        for (int i = 0; i < subSet.length; i++) {
            System.out.print(subSet[i]);
            if (i < subSet.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}

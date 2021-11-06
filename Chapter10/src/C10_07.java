import java.util.Arrays;
import java.util.Scanner;

public class C10_07 {
    static int[] array;
    static int n;
    static int[] bestSubset;
    static int sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will reveal the greatest (lexicographically) of all sub-sets with given sum. %n" +
                "Please enter the number of set's elements: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter the target sum: ");
        sum = Integer.parseInt(scanner.nextLine());
        bestSubset = new int[0];
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element number " + (i + 1) + " = ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The greatest sub-set equal to '%d' is: ", sum);
        Arrays.sort(array);
        for (int subsetLength = 1; subsetLength <= n; subsetLength++) {
            allSubSetsWithLengthK(subsetLength);
        }
        if (bestSubset.length == 0) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < bestSubset.length; i++) {
                System.out.printf("%d ", array[bestSubset[i]]);
            }
        }
    }

    static void combinations(int index, int[] holder, int added, int k) {
        if (index == k) {
            checkSubSet(holder);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (i > added) {
                holder[index] = i;
                combinations(index + 1, holder, i, k);
            }
        }
    }

    private static void checkSubSet(int[] newSubSetIndexes) {
        if (sumOfElements(newSubSetIndexes) == sum) {
            if (isNewSubSetGreaterLexicographically(newSubSetIndexes)) {
                makeBest(newSubSetIndexes);
            }
        }
    }


    private static void makeBest(int[] newSubsetIndexes) {
        bestSubset = new int[newSubsetIndexes.length];
        for (int i = 0; i < newSubsetIndexes.length; i++) {
            bestSubset[i] = newSubsetIndexes[i];
        }
    }

    private static int sumOfElements(int[] newSubSetIndexes) {
        int sum = 0;
        for (int i = 0; i < newSubSetIndexes.length; i++) {
            int toAddIndex = newSubSetIndexes[i];
            int toAdd = array[toAddIndex];
            sum += toAdd;
        }
        return sum;
    }

    private static boolean isNewSubSetGreaterLexicographically(int[] newSubsetIndexes) {
        int index = 0;
        boolean newSubSetIsGreater = true;
        while (index < newSubsetIndexes.length && index < bestSubset.length) {
            if (array[bestSubset[index]] == array[newSubsetIndexes[index]]) {
                index++;
            } else {
                newSubSetIsGreater = array[bestSubset[index]] < array[newSubsetIndexes[index]];
                break;
            }
        }

        return newSubSetIsGreater;
    }

    private static void allSubSetsWithLengthK(int k) {
        combinations(0, new int[k], -1, k);
    }
}

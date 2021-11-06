import java.util.Scanner;

public class C10_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will use 'merge-sort' to sort an elements of a set. %n" +
                "Please enter number of elements: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter them elements: ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            array[i] = number;
        }
        System.out.println("The elements sorted: ");
        array = mergeSort(array);
        printArray(array);

    }

    static int[] mergeSort(int[] toSort) {
        if (toSort.length <= 1) //an array of 1 item is sorted by default
        {
            return toSort;
        }
        int[] leftList, rightList;
        int middleIndex = toSort.length / 2;
        leftList = subList(0, middleIndex - 1, toSort);
        rightList = subList(middleIndex, toSort.length - 1, toSort);

        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);

        return mergeLists(leftList, rightList);
    }

    static int[] subList(int from, int to, int[] fromArray) {
        int[] resultingArray = new int[to - from + 1];
        for (int i = from; i <= to; i++) {
            resultingArray[i - from] = fromArray[i];
        }
        return resultingArray;
    }

    private static int[] mergeLists(int[] leftList, int[] rightList) {
        int leftLength = leftList.length;
        int rightLength = rightList.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int[] result = new int[leftLength + rightLength];
        int resultIndex = 0;
        while (leftIndex < leftLength || rightIndex < rightLength) {
            if (leftIndex < leftLength && rightIndex < rightLength) {
                if (leftList[leftIndex] <= rightList[rightIndex]) {
                    result[resultIndex++] = leftList[leftIndex];
                    leftIndex++;
                } else {
                    result[resultIndex++] = rightList[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftLength) {
                result[resultIndex++] = leftList[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex++] = rightList[rightIndex];
                rightIndex++;
            }
        }
        return result;
    }

    static void printArray(int[] listToPrint) {
        for (var listItem : listToPrint) {
            System.out.printf(" %d ", listItem);
        }
        System.out.println();
    }


}

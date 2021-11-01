//Задача 6:
//Напишете метод, който връща позицията на първия елемент на масив,
//който е по-голям от двата свои съседи едновременно, или -1, ако няма
//такъв елемент.


import java.util.Scanner;

public class C9_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find an array's element that is greater than its adjacent elements simultaneously. %n" +
                "Please describe how many elements you'll enter: ");

        int arrayLength = Integer.parseInt(scanner.nextLine());


        System.out.println("Please input the numbers: ");
        int[] array = new int[arrayLength];
        for (int indexes = 0; indexes < array.length; indexes++) {
            array[indexes] = Integer.parseInt(scanner.nextLine());
        }

        int result = checkAllNeighbours(array);
        if (result != -1) System.out.printf("Found at position %d", result);
        else System.out.println("Not found");
    }

    static int checkAllNeighbours(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (CheckNeighbors(array, i)) return i;
        }
        return -1;
    }

    static boolean CheckNeighbors(int[] array, int position) {
        if (array[position] > array[position - 1] && array[position] > array[position + 1]) {
            return true;
        } else return false;
    }
}

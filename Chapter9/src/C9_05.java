//Задача 5:
//Напишете метод, който проверява дали елемент, намиращ се на дадена
//позиция от масив, е по-голям, или съответно по-малък от двата му
//съседа.

import java.util.Scanner;

public class C9_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will check whether a number in an array is either bigger or smaller than its neighbours. %n" +
                "Please describe how many elements you'll enter: ");

        int arrayLength = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input the numbers: ");
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Enter position to check: ");
        int position = Integer.parseInt(scanner.nextLine());

        checkNeighbours(array, position);
    }

    static void checkNeighbours(int[] array, int position) {
        if (position == 0) {
            System.out.println("This is first element");
            return;
        }
        if (position == array.length - 1) {
            System.out.println("This is last element");
            return;
        }
        if (array[position] > array[position - 1] && array[position] > array[position + 1]) {
            System.out.println("Bigger than neighbours");
            return;
        }
        if (array[position] < array[position - 1] && array[position] < array[position + 1]) {
            System.out.println("Smaller than neighbours");
            return;
        } else System.out.println("Neither bigger or smaller than neighbours");
    }
}

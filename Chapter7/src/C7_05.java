//Задача 5:
//Напишете програма, която намира максималната редица от нарастващи
//елементи в масив. Пример: {3, 2, 3, 4, 2, 2, 4}  {2, 3, 4}.


import java.util.Scanner;

public class C7_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find the maximum increasing sequence of an array's elements.%n" +
                "Please enter the number of array's elements:%n");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.printf("Now enter the %d elements:%n", a);
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = 0;
        int counter = 0;
        int endIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                    endIndex = i - 1;
                }
                counter = 0;
            }
            if (i == array.length - 1) {
                if (counter > max) {
                    max = counter;
                    endIndex = i;
                }
            }
        }
        for (int i = endIndex - max; i <= endIndex; i++) {
            System.out.printf("%d", array[i]);
        }
        System.out.println(" is the maximum increasing sequence of elements.");
    }
}

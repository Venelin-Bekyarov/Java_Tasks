//Задача 4:
//Напишете програма, която намира максималната редица от еднакви
//елементи в масив. Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1}  {2, 2, 2}.


import java.util.Scanner;

public class C7_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find the maximum sequence of an array's element.%n" +
                "Please enter the number of array's elements:%n");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.printf("Now enter the %d elements:%n",a);
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int counter = 1;
        int max = 0;
        int element = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (max < counter) {

                max = counter;

                element = array[i];

            }
        }
        System.out.printf("The maximum sequence of equal %d elements is %d", max, element);
    }
}
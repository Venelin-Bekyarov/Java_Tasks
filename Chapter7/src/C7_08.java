//Задача 8:
//Напишете програма, която намира най-често срещания елемент в масив.


import java.util.Scanner;

public class C7_08 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find the most frequent number in an array.%n" +
                "Enter array length: ");

        int n = Integer.parseInt(scanner.nextLine());
        int array[] = new int[n];

        int mostFrequent = 0;
        int temp = 0;
        int count = 0;
        int tempCount;

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Element number " + i + " = ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = 0; j <= n - 1; j++) {
            temp = array[j];
            tempCount = 0;
            for (int k = 1; k <= n - 1; k++) {
                if (temp == array[k]) {
                    tempCount++;
                }
                if (count < tempCount) {
                    mostFrequent = array[k];
                    count = tempCount;
                }
            }

        }
        System.out.printf("The most frequent number is: %d.", mostFrequent);
    }
}

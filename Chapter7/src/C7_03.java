//Задача 3:
//Да се напише програма, която сравнява два масива от тип char
//лексикографски (буква по буква) и проверява кой от двата е по-рано в
//лексикографската подредба.


import java.util.Scanner;

public class C7_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will compare two strings and will check which of them%n" +
                "is further ahead in the lexicographical arrangement.%n" +
                "Please enter the elements:%n");
        String inputArrayOne = scanner.nextLine();
        String inputArrayTwo = scanner.nextLine();

        char[] arr1 = inputArrayOne.toCharArray();
        char[] arr2 = inputArrayTwo.toCharArray();

        int i = 0;
        boolean equal = false;

        while (i < arr1.length && i < arr2.length) {
            if (arr1[i] > arr2[i]) {
                System.out.printf("'%s' is further.", inputArrayTwo);
                equal = false;
                break;
            } else if (arr1[i] < arr2[i]) {
                System.out.printf("'%s' is further.", inputArrayOne);
                equal = false;
                break;
            } else {
                equal = true;
            }
            i++;

        }
        if (equal) {
            if (arr1.length < arr2.length) {
                System.out.printf("'%s' is further.", inputArrayOne);
            } else if (arr1.length > arr2.length) {
                System.out.printf("'%s' is further.", inputArrayTwo);
            } else {
                System.out.println("There's no difference - they are equal.");
            }
        }
    }
}

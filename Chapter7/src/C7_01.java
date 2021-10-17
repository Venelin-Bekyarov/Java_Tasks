//Задача 1:
//Да се напише програма, която създава масив с 20 елемента от
//целочислен тип и инициализира всеки от елементите със стойност равна
//на индекса на елемента умножен по 5. Елементите на масива да се
//изведат на конзолата.

import java.util.Scanner;

public class C7_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will create and print a 20 elements array. Each element is equal to its own index value multiplied by 5:%n");

        int[] a = new int[20];

            for (int i =0; i <a.length; i++){
                a[i] = i*5;
                System.out.printf("element %d = %d%n ", i+1, a[i]);
        }
    }
}

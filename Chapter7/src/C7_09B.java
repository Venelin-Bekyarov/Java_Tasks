//Задача 9:
//Да се напише програма, която намира последователност от числа в
//масив, които имат сума равна на число, въведено от конзолата (ако има
//такава).


import java.util.Scanner;

public class C7_09B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will find array's consecutive numbers which sum is equal to required sum (S).%n" +
                "Enter array length: ");
        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element number " + i + " = ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Enter the required sum (S) you are looking for: ");
        int s = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int indent = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + array[j];
            if (sum < s) {
                if (j < n - 1) {
                    continue;
                } else {
                    System.out.println("There's no such a sum.");
                    break;
                }
            } else {
                while (sum > s) {
                    sum = sum - array[indent];
                    indent++;
                }
            }
            if (sum == s) {
                System.out.println("The sum's equal consecutive elements are: ");
                for (int k = indent; k <= j; k++) {
                    System.out.print(array[k] + ", ");
                }
                break;
            } else if ((sum < s) && (j == n - 1)) {
                System.out.println("There's no such a sum.");
                break;
            }
        }
    }
}

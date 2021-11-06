import java.util.Scanner;

public class C10_08 {
    static long sum = 0;
    static int n;
    static int numbersAdded = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You will reveal whether there in an array given are elements which sum equals 'N'. %n" +
                "Please enter the sum to be compared: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter the number of array's elements: ");
        int numberElem = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numberElem];
        for (int i = 0; i < numberElem; i++) {
            System.out.print("Element number " + (i + 1) + " = ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("It is " + (findSubSetSum(numbers, 0))+ " statement that there are elements which sum equals to '%d'.", n);
    }

    static boolean findSubSetSum(int[] numbers, int currIndex) {
        if (currIndex == numbers.length) {
            if (sum == n && numbersAdded > 0) {
                return true;
            } else return false;
        }
        sum = sum + numbers[currIndex];
        numbersAdded++;
        if (findSubSetSum(numbers, currIndex + 1)) {
            return true;
        }
        sum = sum - numbers[currIndex];
        numbersAdded--;
        if (findSubSetSum(numbers, currIndex + 1)) {
            return true;
        }
        return false;
    }
}



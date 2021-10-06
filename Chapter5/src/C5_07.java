import java.util.Scanner;

public class C5_07 {
    public static void main(String[] args) {
        //Задача 7:
        //Дадени са няколко цели числа. Напишете програма, която намира онези
        //подмножества от тях, които имат сума 0.
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are going to check whether a sum of any integers equals 'zero'%n" +
                "Please insert three integers:%n");

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a+b == 0) System.out.printf("%d + %d = 0",a,b);
        if (a+c == 0) System.out.printf("%d + %d = 0",a,c);
        if (b+c == 0) System.out.printf("%d + %d = 0",b,c);
        if (a+b+c == 0) System.out.printf("%d + %d + %d = 0",a,b,c);

    }
}

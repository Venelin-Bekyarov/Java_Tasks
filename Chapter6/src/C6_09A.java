//Задача 9 - Втори вариант с преобразуване на формулата в Cn= (2n)!/((n!*n!) * (n+1)):
//В комбинаториката числата на Каталан (Catalan’s numbers) се
//изчисляват по следната формула: Cn= (2n)!/(n+1)!n!, за n ≥ 0
//Напишете програма, която изчислява N-тото число на Каталан за дадено N.


import java.math.BigInteger;
import java.util.Scanner;

public class C6_09A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int p = Integer.parseInt(scanner.nextLine());
        int n= p-1;
        BigInteger k = new BigInteger("1");

//n!

        for (int i = 1; i <= n; i++) {

            k = k.multiply(BigInteger.valueOf(i));

        }

//(n! * n!)

        k = k.multiply(k);

        BigInteger m = new BigInteger("1");

//(2n)!

        for (int l = 1; l <= 2 * n; l++) {

            m = m.multiply(BigInteger.valueOf(l));

        }

//(2n)! / (n! * n!)

        BigInteger outcome = m.divide(k);

//(2n)! / ((n! * n!) * (n+1))

        outcome = outcome.divide(BigInteger.valueOf(n + 1));

        System.out.println(outcome);

    }
}

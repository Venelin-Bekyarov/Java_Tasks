public class Test {
    public static long calcSum(int... elements) {
        long sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        long sum = calcSum(2, 5);
        System.out.println(sum);
        long sum2 = calcSum(4, 0, -2, 12);
        System.out.println(sum2);
        long sum3 = calcSum();
        System.out.println(sum3);
    }
}
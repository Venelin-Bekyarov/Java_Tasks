public class Test2 {
    public static void printTotalAmountForBooks(double... prices) {
        double totalAmount = 0;
        for (double singleBookPrice : prices) {
            totalAmount += singleBookPrice;
        }
        System.out.println("The total amount of all books is: " +
                totalAmount);
    }
    public static void main(String[] args) {
        double[] prices = new double[] { 3, 2.5 };
// Passing initialized array as var-arg:
        printTotalAmountForBooks(prices);
    }
}

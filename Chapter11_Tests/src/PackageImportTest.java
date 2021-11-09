
import java.util.*;

public class PackageImportTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        while (true) {
            System.out.println("Enter an int or a double:");
            if (input.hasNextInt()) {
                ints.add(input.nextInt());
            } else if (input.hasNextDouble()) {
                doubles.add(input.nextDouble());
            } else {
                break;
            }
        }
        System.out.printf("You entered these ints: %s%n",
                ints);
        System.out.printf("You entered these doubles: %s%n",
                doubles);
    }
}

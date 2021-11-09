
import java.util.Random;

public class LotTo649 {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int number = 1; number <= 6; number++) {
            int randomNumber = rand.nextInt(49) + 1;
            System.out.printf("%d ", randomNumber);
        }
    }
}


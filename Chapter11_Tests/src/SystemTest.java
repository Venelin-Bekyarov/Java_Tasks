public class SystemTest {
        public static void main(String[] args) {
            int sum = 0;
            long startTime = System.currentTimeMillis();
// The code fragment to be tested
            for(int i = 0; i < 10000000; i++) {
                sum++;
            }
            long endTime = System.currentTimeMillis();
            System.out.printf("The time elapsed is %f sec", (endTime - startTime)/1000.0);
        }
    }


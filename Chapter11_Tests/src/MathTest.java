public class MathTest {
        public static void main(String[] args) {
            java.util.Scanner
                    input = new java.util.Scanner(System.in);
            System.out.println("Length of the first side:");
            double a = input.nextDouble();
            System.out.println("Length of the second side:");
            double b = input.nextDouble();
            System.out.println("Size of the angle in degrees:");
            int angle = input.nextInt();
            System.out.printf("Face of the triangle: %f%n",
                    0.5 * a * b * Math.sin(Math.toRadians(angle)));

        }
    }


public class C9_10 {

    static int[] multiply(int[] firstPolyCoeff, int[] secondPolyCoeff, int sizeFirstPoly, int sizeSecondPoly) {

        int[] productPoly = new int[sizeFirstPoly + sizeSecondPoly - 1];
        for (int i = 0; i < sizeFirstPoly + sizeSecondPoly - 1; i++) {
            productPoly[i] = 0;
        }
        for (int i = 0; i < sizeFirstPoly; i++) {

            for (int j = 0; j < sizeSecondPoly; j++) {
                productPoly[i + j] += firstPolyCoeff[i] * secondPolyCoeff[j];
            }
        }
        return productPoly;
    }

    static void printPoly(int[] poly, int number) {

        for (int i = 0; i < number; i++) {
            System.out.print(poly[i]);
            if (i != 0) {
                System.out.print("x^" + i);
            }
            if (i != number - 1) {
                System.out.print(" + ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(" Multiplying two polynomials:");
        int[] firstPolyCoeff = {5, 0, 10, 6};
        int[] secondPolyCoeff = {1, 2, 4};
        int sizeFirstPoly = firstPolyCoeff.length;
        int sizeSecondPoly = secondPolyCoeff.length;

        System.out.print(" First polynomial is: ");
        printPoly(firstPolyCoeff, sizeFirstPoly);
        System.out.printf("%n Second polynomial is: ");
        printPoly(secondPolyCoeff, sizeSecondPoly);

        int[] prod = multiply(firstPolyCoeff, secondPolyCoeff, sizeFirstPoly, sizeSecondPoly);

        System.out.printf("%n Product polynomial is: ");
        printPoly(prod, sizeFirstPoly + sizeSecondPoly - 1);
    }
}

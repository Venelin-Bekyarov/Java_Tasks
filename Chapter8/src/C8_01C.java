//Задача 1:
//Превърнете числата 151, 35, 43, 251 и -0,41 в двоична бройна система.

public class C8_01C {
    public static void main(String[] args) {

        int number1 = 151;
        int number2 = 35;
        int number3 = 43;
        int number4 = 251;
        float number5 = (float) -0.41;
        float printNumber5 = number5;
        System.out.printf("%s %n", number1);
        System.out.printf("%s %n", number2);
        System.out.printf("%s %n", number3);
        System.out.printf("%s %n", number4);

        int i = 0;
        char[] decimalNumbers = new char[32];
        boolean isPositive = true;
        while (i < 32) {
            number5 *= 2;

            if (number5 < 0) {
                isPositive = false;
                number5 *= -1;
            }

            if (number5 - 1 > 0) {
                number5 -= 1;
                decimalNumbers[i] = (char) 1;
            } else {
                decimalNumbers[i] = (char) 0;
            }
            i++;
        }
        if (!isPositive) {
            System.out.print("-");
        }
        System.out.print("0.");

        for (var digit : decimalNumbers) {
            System.out.printf("%c", digit);
        }
        System.out.println();
    }
}

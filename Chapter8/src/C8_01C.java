//Задача 1:
//Превърнете числата 151, 35, 43, 251 и -0,41 в двоична бройна система.

public class C8_01C {
    public static void main(String[] args) {

        int number1 = 151;
        int number2 = 35;
        int number3 = 43;
        int number4 = 251;
        float number5 = -0.41f;
        float printNumber5 = number5;
        System.out.println(Integer.toString(number1,2));
        System.out.println(Integer.toString(number2,2));
        System.out.println(Integer.toString(number3,2));
        System.out.println(Integer.toString(number4,2));


        int i = 0;
        String[ ]numbs = new String[32];
        boolean isPositive = true;
        while (i < 32) {
            number5 *= 2;

            if (number5 < 0) {
                isPositive = false;
                number5 *= -1;
            }

            if (number5-1 > 0) {
                number5 -= 1;
                numbs[i]="1";
            } else {
                numbs[i]="0";
            }
            i++;
        }
        if (!isPositive) {
            System.out.print("-");
        }
        System.out.print("0.");

        for (var digit : numbs) {
            System.out.print(digit);
        }
        System.out.println();
    }
}

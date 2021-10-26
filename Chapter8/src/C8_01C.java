//Задача 1:
//Превърнете числата 151, 35, 43, 251 и -0,41 в двоична бройна система.

public class C8_01C {

    public static String Integer(int decimal) {

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }
        return (binary.toString());
    }

    public static void main(String[] args) {

        /*int decimalNumber1 = 151;
        int decimalNumber2 = 35;
        int decimalNumber3 = 43;
        int decimalNumber4 = 251;
        float decimalNumber5 = -0.41f;

        System.out.println(Integer.toString(decimalNumber1, 2));
        System.out.println(Integer.toString(decimalNumber2, 2));
        System.out.println(Integer.toString(decimalNumber3, 2));
        System.out.println(Integer.toString(decimalNumber4, 2));*/

        System.out.println(Integer(151));
        System.out.println(Integer(35));
        System.out.println(Integer(43));
        System.out.println(Integer(251));


        float decimalNumber5 = -0.41f;
        int i = 0;
        String[] bitNumbs = new String[32];
        boolean isPositive = true;
        while (i < 32) {
            decimalNumber5 *= 2;

            if (decimalNumber5 < 0) {
                isPositive = false;
                decimalNumber5 *= -1;
            }

            if (decimalNumber5 - 1 > 0) {
                decimalNumber5 -= 1;
                bitNumbs[i] = "1";
            } else {
                bitNumbs[i] = "0";
            }
            i++;
        }
        if (!isPositive) {
            System.out.print("-");
        }
        System.out.print("0.");

        for (var digit : bitNumbs) {
            System.out.print(digit);
        }
        System.out.println();


    }
}

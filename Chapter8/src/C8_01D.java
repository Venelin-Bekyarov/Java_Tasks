//Задача 1:
//Превърнете числата 151, 35, 43, 251 и -0,41 в двоична бройна система.

public class C8_01D {

    public static void main(String[] args) {
        System.out.println(Integer(151));
        System.out.println(Integer(35));
        System.out.println(Integer(43));
        System.out.println(Integer(251));
        System.out.println(Convert(-0.41));
    }

    public static String Integer(int decimal) {

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }
        return (binary.toString());

    }

    public static String Convert(double floatDecimal) {

        long longBit = Double.doubleToRawLongBits(floatDecimal);
        String result = Long.toBinaryString(longBit);

        return result;
    }
}


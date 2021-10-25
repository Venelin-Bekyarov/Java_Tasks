//Задача 1:
//Превърнете числата 151, 35, 43, 251 и -0,41 в двоична бройна система.


public class C8_01B {
    public static void main(String[] args) {
        System.out.println(convert("0.25"));
        System.out.println(convert("-0.41"));

    }

    public static String convert(String input) {

        double number = Double.parseDouble(input);
        long longBits = Double.doubleToLongBits(number);
        String result = Long.toBinaryString(longBits);

        return result.replaceAll("0+$", "");

    }

}
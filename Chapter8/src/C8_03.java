//Задача 3:
//Превърнете шестнайсетичните числа 2A3E, FA, FFFF, 5A0E9 в двоична и
//десетична бройна система.


public class C8_03 {
    public static void main(String[] args) {
        System.out.printf("The hexadecimal numbers '2A3E', 'FA', 'FFFF' and '5A0E9' %n");
        String hexNumber1 = "2A3E";
        String hexNumber2 = "FA";
        String hexNumber3 = "FFFF";
        String hexNumber4 = "5A0E9";


        int decNum1 = Integer.parseInt(hexNumber1,16);
        int decNum2 = Integer.parseInt(hexNumber2,16);
        int decNum3 = Integer.parseInt(hexNumber3,16);
        int decNum4 = Integer.parseInt(hexNumber4,16);

        System.out.printf("decimal equivalent is: %n");
        System.out.println();
        System.out.println(decNum1);
        System.out.println(decNum2);
        System.out.println(decNum3);
        System.out.println(decNum4);

        System.out.printf("and the binary equivalent is: %n");
        System.out.println();
        System.out.println(Integer.toString(decNum1, 2));
        System.out.println(Integer.toString(decNum2, 2));
        System.out.println(Integer.toString(decNum3, 2));
        System.out.println(Integer.toString(decNum4, 2));
    }
}

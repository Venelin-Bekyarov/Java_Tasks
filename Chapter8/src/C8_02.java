//Задача 2:
//Превърнете числото 1111010110011110(2) в шестнадесетична и десетична
//бройна система.

public class C8_02 {
    public static void main(String[] args) {
        String binNum = "1111010110011110";
        int dec = Integer.parseInt(binNum, 2);

        System.out.println(dec);
        System.out.printf("%5X", dec);
    }
}

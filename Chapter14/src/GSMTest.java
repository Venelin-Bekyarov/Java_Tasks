public class GSMTest {

    private static GSM[] handyTest = new GSM[3];

    public static void main(String[] args) {
        GSMTest.testPrint();
    }

    public static void testPrint() {
        handyTest[0] = new GSM("N95", "brand new Nokia", 50, "Simon",
                new Battery("BL-6F", 240, 3.5), new Display(2.8, 16));
        handyTest[1] = new GSM("N95", "used Nokia", 20, "Liam",
                new Battery("BS-5A", 160, 1.4), new Display(2.8, 16));
        handyTest[2] = new GSM("N95", "broken Nokia for spares", 10, "Mark",
                new Battery("BC-4H", 0, 0), new Display(2.8, 0));

        for (GSM handy : handyTest) {
            System.out.println(handy);
        }
    }
}

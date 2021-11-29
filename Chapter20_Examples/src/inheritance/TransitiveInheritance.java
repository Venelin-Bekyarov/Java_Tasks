package inheritance;


public class TransitiveInheritance {
    public static void main(String... args) {
        AfricanLion africanLion = new AfricanLion(true, 15);

        africanLion.isMale();

        africanLion.setMale(true);
    }
}

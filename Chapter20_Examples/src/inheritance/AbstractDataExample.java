package inheritance;

public class AbstractDataExample {
    public static void main(String... args) {
        Lion lion = new Lion(true, 150);
        Felidae bigCat1 = lion;
        AfricanLion africanLion = new AfricanLion(true,170);
        Felidae bigCat2 = africanLion;
    }
}


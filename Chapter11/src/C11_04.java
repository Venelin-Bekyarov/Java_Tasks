import C11_03_Cat_Package.C11_03_Cat;
import C11_03_Cat_Package.C11_03_Sequence;


public class C11_04 {
    public static void main(String[] args) {
        C11_03_Cat[] cats = new C11_03_Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new C11_03_Cat("Cat" + C11_03_Sequence.nextValue(), "green");
        }
        for (var cat : cats) {
            cat.sayMeow();
        }

    }
}

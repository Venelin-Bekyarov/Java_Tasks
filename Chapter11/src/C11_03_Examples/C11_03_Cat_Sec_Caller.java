package C11_03_Examples;
import C11_03_Cat_Package.*;

public class C11_03_Cat_Sec_Caller {
    public static void main(String[] args) {
        C11_03_Cat someCat = new C11_03_Cat();
        someCat.sayMeow();
        System.out.printf("Cat %s is %s colour", someCat.name, someCat.colour);
    }
}

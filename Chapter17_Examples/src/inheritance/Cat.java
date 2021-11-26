package inheritance;


public class Cat extends AnimalAbstract {
    @Override
    protected String getTypicalSound() {
        return "Miaoooow!";
    }
    public static void main(String[] args) {
        AnimalAbstract cat = new Cat();
        cat.printInformation();
// Output:
// I am Cat.
// Miaoooow!
    }
}

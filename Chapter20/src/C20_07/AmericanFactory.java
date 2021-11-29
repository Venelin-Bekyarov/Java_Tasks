package C20_07;

public class AmericanFactory extends ContinentalFactory {
    public HerbivorousAnimal createHerbivorousAnimal() {
        Bison bison = new Bison();
        return bison;
    }

    public CarnivorousAnimal createCarnivorousAnimal() {
        Wolf wolf = new Wolf();
        return wolf;
    }
}

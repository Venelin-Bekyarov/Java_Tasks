package C20_07;

public class AnimalWorld {
    private HerbivorousAnimal herbivorousAnimal;
    private CarnivorousAnimal carnivorousAnimal;

    public AnimalWorld(ContinentalFactory factory) {
        carnivorousAnimal = factory.createCarnivorousAnimal();
        herbivorousAnimal = factory.createHerbivorousAnimal();
    }

    public void runFoodChain() {
        carnivorousAnimal.eat(herbivorousAnimal);
    }
}


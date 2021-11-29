package C20_07;

public class AbstractFactory {
    public static void main(String[] args) {
        ContinentalFactory africa = new AfricanFactory();
        AnimalWorld world = new AnimalWorld(africa);
        world.runFoodChain();

        ContinentalFactory america = new AmericanFactory();
        world = new AnimalWorld(america);
        world.runFoodChain();
    }
}


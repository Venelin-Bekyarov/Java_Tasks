package C20_07;

public class AfricanFactory extends ContinentalFactory {
        public HerbivorousAnimal createHerbivorousAnimal()
        {
            Rabbit rabbit = new Rabbit();
            return rabbit;
        }

        public CarnivorousAnimal createCarnivorousAnimal()
        {
            Lion lion = new Lion();
            return lion;
        }
    }

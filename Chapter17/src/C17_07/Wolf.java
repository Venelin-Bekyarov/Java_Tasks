package C17_07;

public class Wolf extends CarnivorousAnimal {
    public void eat(HerbivorousAnimal herbivorousAnimal) {
        System.out.printf(" " + " eats " +
                herbivorousAnimal);
    }
}

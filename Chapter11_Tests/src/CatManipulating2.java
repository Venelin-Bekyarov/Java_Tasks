public class CatManipulating2 {
        public static void main(String[] args) {
            Cat someCat = new Cat();
            someCat.sayMeow();
            System.out.printf("The color of cat %s is %s.%n", someCat.name, someCat.color);

            Cat myBrownCat = new Cat("Johnny", "brown");myBrownCat.sayMeow();

            System.out.printf("The color of cat %s is %s.%n", myBrownCat.name, myBrownCat.color);
        }
}

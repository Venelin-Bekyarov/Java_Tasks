public class CatManipulating {
        public static void main(String[] args) {
            Cat myCat = new Cat();
            myCat.name = "Alfred";
            System.out.printf("The name of my cat is %s.%n", myCat.name);
            myCat.sayMeow();
        }


}
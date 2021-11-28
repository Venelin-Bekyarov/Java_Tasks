package inheritance;

public abstract class Lion extends Felidae {


    private int weight;

    public Lion(boolean male, int weight) {
        super(male);
        // Shall be explained in the next paragraph
        this.weight = weight;
    }


//    private movePaw(Paw paw) {
//    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    public boolean catchPray(Object pray) {
//        super.hide();
//        this.ambush();
//        super.run();
//    }
//
//    public void walk() {
//        this.movePaw(frontLeft);
//        this.movePaw(frontRight);
//        this.movePaw(bottomLeft);
//        this.movePaw(bottomRight);
//    }
//
//    public Mammal[] reproduce(Mammal anotherLion) {
//        return new Mammal[]{new Lion(), new Lion()};
//    }
}


package inheritance;

public abstract class Felidae { // Latin word for "cat"
    private boolean male;

    public Felidae() {
        this(true);
    }
    public abstract void walk();

    public abstract boolean catchPray(Object pray);

    public Felidae(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

}


package inheritance;

public abstract class AnimalAbstract {
    public void printInformation() {
        System.out.println("I am " +
                this.getClass().getSimpleName() + ".");
        System.out.println(getTypicalSound());
    }

    protected abstract String getTypicalSound();
}


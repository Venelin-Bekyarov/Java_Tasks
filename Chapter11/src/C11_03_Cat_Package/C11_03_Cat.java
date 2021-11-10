package C11_03_Cat_Package;

public class C11_03_Cat {
    public String name;

    public String colour;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public C11_03_Cat() {
        this.name = "Unnamed";
        this.colour = "gray";
    }

    public C11_03_Cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void sayMeow() {
        System.out.printf("Cat %s said: Meow!%n", name);
    }
}

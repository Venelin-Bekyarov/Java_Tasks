public class GSM {

    static private GSM nokiaN95;

    private Battery battery;
    private Display display;
    private String model;
    private String make;
    private double price;
    private String keeper;

    public GSM(String model, String make, double price, String keeper, Battery battery, Display display) {
        this.model = model;
        this.make = make;
        this.price = price;
        this.keeper = keeper;
        this.battery = battery;
        this.display = display;
    }
    public String toString() {
        return keeper + " got " + make + " " + model + ", " + getBattery().getBattModel() + " battery with " +
                getBattery().getIdleTime() + " hours of idle and " + getBattery().getHoursTalk() + " hours to talk capacity, " +
                getDisplay().getSize() + " TFT display with " + getDisplay().getColours() +
                " million colours. Price of " + price + "leva.";
    }
    /*public static void GSM() {
        nokiaN95 = new GSM("N95", "Nokia", 50, "Simon",
                new Battery("BL-6F", 240, 3.5), new Display(2.8, 16));
    }*/

    public static GSM getNokiaN95() {
        return nokiaN95;
    }

    public static void setNokiaN95(GSM nokiaN95) {
        GSM.nokiaN95 = nokiaN95;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getKeeper() {
        return keeper;
    }

    public void setKeeper(String keeper) {
        this.keeper = keeper;
    }
}

class Battery {
    private String battModel;
    private int idleTime;
    private double hoursTalk;

    public Battery(String battModel, int idleTime, double hoursTalk) {
        this.battModel = battModel;
        this.idleTime = idleTime;
        this.hoursTalk = hoursTalk;


    }

    public String getBattModel() {
        return battModel;
    }

    public void setBattModel(String battModel) {
        this.battModel = battModel;
    }

    public int getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(int idleTime) {
        this.idleTime = idleTime;
    }

    public double getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(double hoursTalk) {
        this.hoursTalk = hoursTalk;
    }
}

class Display {
    private double size;
    private int colours;

    public Display(double size, int colours) {
        this.size = size;
        this.colours = colours;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getColours() {
        return colours;
    }

    public void setColours(int colours) {
        this.colours = colours;
    }
}

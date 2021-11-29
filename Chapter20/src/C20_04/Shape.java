package C20_04;

public abstract class Shape {
    public double width;
    public double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateSurface() {
        double defaultSurface = 0.0;
        return defaultSurface;
    }
}


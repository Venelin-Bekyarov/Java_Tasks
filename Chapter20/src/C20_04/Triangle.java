package C20_04;

public class Triangle extends Shape {

    public Triangle(int width, int height) {
        super(width, height);
    }

    public double calculateSurface() {
        double triangleSurface = (getWidth() * getHeight()) / 2;
        return triangleSurface;
    }


    public String toString() {
        String triangleAsString = String.format("Triangle surface %.2f", calculateSurface());
        return triangleAsString;
    }
}

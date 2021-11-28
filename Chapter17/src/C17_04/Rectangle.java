package C17_04;

public class Rectangle extends Shape {

    public Rectangle (double width, double height) {
        super(width, height);
    }


    public double calculateSurface() {
        double rectangleSurface = getWidth() * getHeight();
        return rectangleSurface;
    }

    public String toString() {
        String rectangleAsString = String.format("Rectangle surface %.2f",
                calculateSurface());
        return rectangleAsString;
    }
}

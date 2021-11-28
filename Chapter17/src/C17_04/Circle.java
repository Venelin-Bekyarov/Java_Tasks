package C17_04;

public class Circle extends Shape {


    public Circle (double width, double height) throws Exception {
        super(width, height);

        if (width != height) {
            throw new Exception(
                    "Height (radius) is equal to width (radius) in circle shape");
        }
    }

    public double CalculateSurface() {
        double circleSurface = Math.PI * getWidth() * getHeight();
        return circleSurface;
    }


    public String toString() {
        String circleAsString = String.format("Circle surface %.2f",
                CalculateSurface());
        return circleAsString;
    }
}

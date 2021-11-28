package C17_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapesTest {

    //Input pattern:
    /**
     3
     Rectangle 10 10
     Triangle 10 10
     Circle 10 10

     **/


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputShapesCount = scanner.nextLine();
        int shapesCount = Integer.parseInt(inputShapesCount);

        ArrayList<Shape> shapes = readShapes(shapesCount);

        printShapes(shapes);
    }

    private static void printShapes(ArrayList<Shape> shapes) {
        for (var currentShape : shapes) {
            System.out.println(currentShape);
        }
    }


    private static ArrayList<Shape> readShapes(int shapesCount) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>(shapesCount);
        for (int i = 0; i < shapesCount; i++) {
            String line = scanner.nextLine();
            String[] splitLine = line.split("\\s+");
            String shapeType = splitLine[0];
            int firstMetric = Integer.parseInt(splitLine[1]);
            int secondMetric = Integer.parseInt(splitLine[2]);

            switch (shapeType) {
                case "Triangle": {
                    shapes.add(new Triangle(firstMetric, secondMetric));
                    break;
                }
                case "Rectangle": {
                    shapes.add(new Rectangle(firstMetric, secondMetric));
                    break;
                }
                case "Circle": {
                    shapes.add(new Circle(firstMetric, secondMetric));
                    break;
                }
                default: {
                    throw new Exception("Incorrect shape type");
                }
            }
        }
        return shapes;
    }
}
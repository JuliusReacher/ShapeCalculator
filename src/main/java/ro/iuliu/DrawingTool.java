package ro.iuliu;

import java.util.ArrayList;
import java.util.List;

public class DrawingTool {

    private List<Shape> shapes = new ArrayList<>();

    public boolean addShape(Shape shape) {
        for (Shape existing : shapes) {
            if (existing.getKey().equals(shape.getKey())) {
                System.out.println("Duplicate shape cannot be added.");
                return false;
            }
        }

        shapes.add(shape);
        return true;
    }

    public double getTotalArea() {
        double total = 0;

        for (Shape shape : shapes) {
            total += shape.getArea();
        }

        return total;
    }

    public double getTotalPerimeter() {
        double total = 0;

        for (Shape shape : shapes) {
            total += shape.getPerimeter();
        }

        return total;
    }

    public int getShapeCount() {
        return shapes.size();
    }
}
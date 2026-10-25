package ro.iuliu;

public class Main {

    public static void main(String[] args) {
        DrawingTool tool = new DrawingTool();

        tool.addShape(new Rectangle(3, 4));
        tool.addShape(new Square(2));
        tool.addShape(new Circle(1));
        tool.addShape(new Triangle(3, 4, 5));

        tool.addShape(new Square(2));

        System.out.println("Shapes: " + tool.getShapeCount());
        System.out.println("Total area: " + tool.getTotalArea());
        System.out.println("Total perimeter: " + tool.getTotalPerimeter());
    }
}
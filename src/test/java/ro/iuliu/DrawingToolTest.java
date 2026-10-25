package ro.iuliu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawingToolTest {

    @Test
    void shouldAddSingleShapeAndPair() {
        DrawingTool tool = new DrawingTool();

        tool.addShape(new Rectangle(3, 4));
        Assertions.assertEquals(1, tool.getShapeCount());
        Assertions.assertEquals(12.0, tool.getTotalArea(), 0.001);
        Assertions.assertEquals(14.0, tool.getTotalPerimeter(), 0.001);

        tool.addShape(new Square(2));
        Assertions.assertEquals(2, tool.getShapeCount());
        Assertions.assertEquals(16.0, tool.getTotalArea(), 0.001);
        Assertions.assertEquals(22.0, tool.getTotalPerimeter(), 0.001);
    }

    @Test
    void shouldAddAllShapeTypes() {
        DrawingTool tool = new DrawingTool();

        tool.addShape(new Rectangle(3, 4));
        tool.addShape(new Square(2));
        tool.addShape(new Circle(1));
        tool.addShape(new Triangle(3, 4, 5));

        Assertions.assertEquals(4, tool.getShapeCount());
        Assertions.assertEquals(22 + Math.PI, tool.getTotalArea(), 0.001);
        Assertions.assertEquals(34 + 2 * Math.PI, tool.getTotalPerimeter(), 0.001);
    }

    @Test
    void shouldNotAddDuplicate() {
        DrawingTool tool = new DrawingTool();

        tool.addShape(new Square(2));
        tool.addShape(new Square(2));

        Assertions.assertEquals(1, tool.getShapeCount());
        Assertions.assertEquals(4.0, tool.getTotalArea(), 0.001);
        Assertions.assertEquals(8.0, tool.getTotalPerimeter(), 0.001);
    }
}
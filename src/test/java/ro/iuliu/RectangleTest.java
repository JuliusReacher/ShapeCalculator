package ro.iuliu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void shouldCalculateAreaAndPerimeter() {
        Rectangle rectangle = new Rectangle(3, 4);

        Assertions.assertEquals(12.0, rectangle.getArea(), 0.001);
        Assertions.assertEquals(14.0, rectangle.getPerimeter(), 0.001);
    }
}
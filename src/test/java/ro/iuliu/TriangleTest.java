package ro.iuliu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void shouldCalculateAreaAndPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);

        Assertions.assertEquals(6.0, triangle.getArea(), 0.001);
        Assertions.assertEquals(12.0, triangle.getPerimeter(), 0.001);
    }
}
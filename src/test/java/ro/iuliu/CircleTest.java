package ro.iuliu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void shouldCalculateAreaAndPerimeter() {
        Circle circle = new Circle(3);

        Assertions.assertEquals(9 * Math.PI, circle.getArea(), 0.001);
        Assertions.assertEquals(6 * Math.PI, circle.getPerimeter(), 0.001);
    }
}
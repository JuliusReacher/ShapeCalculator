package ro.iuliu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void shouldCalculateAreaAndPerimeter() {
        Square square = new Square(2);

        Assertions.assertEquals(4.0, square.getArea(), 0.001);
        Assertions.assertEquals(8.0, square.getPerimeter(), 0.001);
    }
}
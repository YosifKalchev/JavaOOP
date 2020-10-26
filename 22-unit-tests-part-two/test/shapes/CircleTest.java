package shapes;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest {
    private Circle circle;

    @Test
    public void testCalculateAreaWhenRadiusIsZero() {
        this.circle = new Circle(0);
        double expected = 0.0;
        double actual = circle.calculateArea();
        assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateAreaWhenRadiusIsPositive() {
        this.circle = new Circle(1);
        double expected = 3.14159;
        double actual = circle.calculateArea();
        Assert.assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateDiameterWhenRadiusIsPositive() {
        this.circle = new Circle(1);
        int expected = 2;
        int actual = circle.findDiameter();
        Assert.assertEquals("The diameter is not as expected", expected, actual);
    }

    @Test
    public void testCalculatePerimeterWhenRadiusIsPositive() {
        this.circle = new Circle(1);
        double expected = 6.28318;
        double actual = circle.calculatePerimeter();
        Assert.assertEquals("The perimeter is not as expected", expected, actual, 0.001);
    }

}
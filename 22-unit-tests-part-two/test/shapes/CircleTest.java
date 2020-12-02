package shapes;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest {
    private Circle circle;

    @Test
    public void testCalculateDiameterWhenRadiusIsZeroThenReturnZero() {
        Circle circle = new Circle(0);
        double expected = 0.0;
        double actual = circle.findDiameter();

        assertEquals("The radius value is not expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateDiameterWhenRadiusIsPositiveThenReturnPositiveNumber() {
        Circle circle = new Circle(5);
        double expected = 2 * 5;
        double actual = circle.findDiameter();

        assertEquals("The radius calculation is wrong", expected, actual, 0.001);
    }

    @Test
    public void testCalculateDiameterWhenRadiusIsNegativeThenReturnZero() { //ok
        Circle circle = new Circle(-5);
        double expected = 0.0;
        double actual = circle.findDiameter();

        assertEquals("The radius value is not expected", expected, actual, 0.001);
    }


    @Test
    public void testCalculateAreaWhenRadiusIsZeroThenReturnZero() { //ok
        this.circle = new Circle(0);
        double expected = 0.0;
        double actual = circle.calculateArea();

        assertEquals("The area value is not expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateAreaWhenRadiusIsPositiveThenReturnPositiveNumber() { //ok
        this.circle = new Circle(5);
        double expected = Math.PI * 5 * 5;
        double actual = circle.calculateArea();

        Assert.assertEquals("The area calculation is wrong", expected, actual, 0.001);
    }

    @Test
    public void testCalculateAreaWhenRadiusIsNegativeThenReturnZero() {
        this.circle = new Circle(-5);
        double expected = 0;
        double actual = circle.calculateArea();

        Assert.assertEquals("The area value is not expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenRadiusIsZeroThenReturnZero() {
        this.circle = new Circle(0);
        double expected = 0;
        double actual = circle.calculatePerimeter();

        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenRadiusIsPositiveThenReturnPositiveNumber() {
        this.circle = new Circle(5);
        double expected = 2 * Math.PI * 5;
        double actual = circle.calculatePerimeter();

        Assert.assertEquals("The perimeter calculation is wrong", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenRadiusIsNegativeThenReturnZero() {
        this.circle = new Circle(-5);
        double expected = 0;
        double actual = circle.calculatePerimeter();

        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.001);
    }
}
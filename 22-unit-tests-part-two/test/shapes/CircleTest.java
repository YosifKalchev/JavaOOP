package shapes;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest {
    private Circle circle;

    @Test
    public void testCalculateDiameterWhenRadiusIsZeroThanReturnZero() {
        Circle circle = new Circle(0);
        double expected = 0.0;
        double actual = circle.findDiameter();
        assertEquals("The radius value is not expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateDiameterWhenRadiusIsPositiveThanReturnPositiveNumber() {
        Circle circle = new Circle(5);
        double expected = 2 * 5;
        double actual = circle.findDiameter();
        assertEquals("The radius value is not expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateDiameterWhenRadiusIsNegativeThanReturnZero() { //ok
        Circle circle = new Circle(-5);
        double expected = 0.0;
        double actual = circle.findDiameter();
        assertEquals("The radius value is not expected", expected, actual, 0.001);
    }


    @Test
    public void testCalculateAreaWhenRadiusIsZeroThanReturnZero() { //ok
        this.circle = new Circle(0);
        double expected = 0.0;
        double actual = circle.calculateArea();
        assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateAreaWhenRadiusIsPositiveThanReturnPositiveNumber() { //ok
        this.circle = new Circle(5);
        double expected = Math.PI * 5 * 5;
        double actual = circle.calculateArea();
        Assert.assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateAreaWhenRadiusIsNegativeThanReturnZero() {
        this.circle = new Circle(-5);
        double expected = 0;
        double actual = circle.calculateArea();
        Assert.assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenRadiusIsZeroThanReturnZero() {
        this.circle = new Circle(0);
        double expected = 0;
        double actual = circle.calculatePerimeter();
        Assert.assertEquals("The perimeter is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenRadiusIsPositiveThanReturnPositiveNumber() {
        this.circle = new Circle(5);
        double expected = 2 * Math.PI * 5;
        double actual = circle.calculatePerimeter();
        Assert.assertEquals("The perimeter is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenRadiusIsNegativeThanReturnZero() {
        this.circle = new Circle(-5);
        double expected = 0;
        double actual = circle.calculatePerimeter();
        Assert.assertEquals("The perimeter is not as expected", expected, actual, 0.001);
    }
}
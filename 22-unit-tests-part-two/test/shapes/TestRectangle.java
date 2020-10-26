package shapes;

import org.junit.Assert;
import org.junit.Test;

public class TestRectangle {

    @Test
    public void testCalculateAreaWhenBothSidesAreZero() {
        Rectangular rectangular = new Rectangular(0, 0);
        double expected = 0;
        double actual = rectangular.calculateArea();
        Assert.assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsZero() {
        Rectangular rectangular = new Rectangular(0, 2);
        double expected = 0;
        double actual = rectangular.calculateArea();
        Assert.assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculateAreaWhenSidesArePositive() {
        Rectangular rectangular = new Rectangular(1, 2);
        double expected = 2.0;
        double actual = rectangular.calculateArea();
        Assert.assertEquals("The area is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenBothSidesAreZero() {
        Rectangular rectangular = new Rectangular(0, 0);
        double expected = 0.0;
        double actual = rectangular.calculatePerimeter();
        Assert.assertEquals("The perimeter is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsZeroThenResultIsZero() {
        Rectangular rectangular = new Rectangular(0, 2);
        double expected = 0.0;
        double actual = rectangular.calculatePerimeter();
        Assert.assertEquals("The perimeter is not expected", expected, actual, 0.001);
    }

    @Test
    public void testCalculatePerimeterWhenSidesArePositive() {
        Rectangular rectangular = new Rectangular(1, 2);
        double expected = 6.0;
        double actual = rectangular.calculatePerimeter();
        Assert.assertEquals("The perimeter is not as expected", expected, actual, 0.001);
    }

    @Test
    public void testIsSquareWhenSidesAreNotEqualThenReturnFalse() {
        Rectangular rectangular = new Rectangular(2, 3);
        boolean actual = rectangular.isSquare();
        Assert.assertFalse("The rectangular given is not a square", actual);
    }

    @Test
    public void testIsSquareWhenSidesAreEqualThenReturnTrue() {
        Rectangular rectangular = new Rectangular(2, 2);
        boolean actual = rectangular.isSquare();
        Assert.assertTrue("The rectangular given is not a square", actual);
    }

    @Test
    public void testCalculateDiagonal() {
        Rectangular rectangular = new Rectangular(3, 4);
        double expected = 5.0;
        double actual = rectangular.calculateDiagonal();
        Assert.assertEquals("The diagonal is not as expected", expected, actual, 0.001);
    }

}
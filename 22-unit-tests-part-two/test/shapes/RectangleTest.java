package shapes;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testCalculateDiagonalWhenBothSidesArePositiveThenReturnPositiveNumber() {
        Rectangle rectangle = new Rectangle(4, 5);
        double expected = Math.sqrt((4 * 4) + (5 * 5));
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenBothSidesAreNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, -5);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenBothSidesAreZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenOneSideIsPositiveOtherIsZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(4, 0);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenOneSideIsZeroOtherIsPositiveThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, 5);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenOneSideIsNegativeOtherIsZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, 0);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenOneSideIsZeroOtherIsNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, -5);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenOneSideIsPositiveOtherIsNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(4, -5);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateDiagonalWhenOneSideIsNegativeOtherIsPositiveThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, 5);
        double expected = 0;
        double actual = rectangle.calculateDiagonal();
        Assert.assertEquals("The diagonal value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenBothSidesArePositiveThenReturnPositiveNumber() {
        Rectangle rectangle = new Rectangle(4, 5);
        double expected = 4 * 5;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenBothSidesAreNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, -5);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenBothSidesAreZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsPositiveOtherIsZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(4, 0);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsZeroOtherIsPositiveThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, 5);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsNegativeOtherIsZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, 0);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsZeroOtherIsNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, -5);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsPositiveOtherIsNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(4, -5);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsNegativeOtherIsPositiveThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, 5);
        double expected = 0;
        double actual = rectangle.calculateArea();
        Assert.assertEquals("The area value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenBothSidesArePositiveThenReturnPositiveNumber() {
        Rectangle rectangle = new Rectangle(4, 5);
        double expected = 2 * ( 4 + 5);
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenBothSidesAreNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, -5);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenBothSidesAreZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsPositiveOtherIsZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(4, 0);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsZeroOtherIsPositiveThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, 5);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsNegativeOtherIsZeroThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, 0);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsZeroOtherIsNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(0, -5);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsPositiveOtherIsNegativeThenReturnZero() {
        Rectangle rectangle = new Rectangle(4, -5);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsNegativeOtherIsPositiveThenReturnZero() {
        Rectangle rectangle = new Rectangle(-4, 5);
        double expected = 0;
        double actual = rectangle.calculatePerimeter();
        Assert.assertEquals("The perimeter value is not expected", expected, actual, 0.0001);
    }

    @Test
    public void testIsSquareWhenSidesAreEqualThanReturnTrue() {
        Rectangle rectangle = new Rectangle(4, 4);
        Assert.assertTrue("The shape should be a rectangle", rectangle.isSquare());
    }

    @Test
    public void testIsSquareWhenSidesAreNotEqualThanReturnFalse() {
        Rectangle rectangle = new Rectangle(4, 5);
        Assert.assertFalse("The shape should not be a rectangle", rectangle.isSquare());
    }
}
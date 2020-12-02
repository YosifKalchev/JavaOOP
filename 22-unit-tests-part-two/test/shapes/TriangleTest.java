package shapes;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testCalculatePerimeterWhenSidesPositiveAndNonZeroThenReturnPositiveNumber() {
        Triangle triangle = new Triangle(3, 4, 5);
        double expected = 3 + 4 + 5;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("Perimeter calculation is wrong", expected, actual, 0.000001);
    }

    @Test
    public void testCalculatePerimeterWhenSidesNegativeAndNonZeroThenReturnZero() {
        Triangle triangle = new Triangle(-3, -4, -5);
        double expected = 0;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("The triangle with negative sides does not exist", expected, actual, 0.000001);
    }

    @Test
    public void testCalculatePerimeterWhenSidesAreZeroThenReturnZero() {
        Triangle triangle = new Triangle(0, 0, 0);
        double expected = 0;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("The triangle does not exist", expected, actual, 0.000001);
    }

    @Test
    public void testCalculatePerimeterWhenOneSideIsNegativeOtherSidesNonZeroThenReturnZero() {
        Triangle triangle = new Triangle(-3, 4, 5);
        double expected = 0;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("The triangle with negative side does not exist", expected, actual, 0.000001);
    }


    @Test
    public void testCalculatePerimeterWhenOneSideIsZeroOtherSidesPositiveThenReturnZero() {
        Triangle triangle = new Triangle(0, 4, 5);
        double expected = 0;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("The triangle with zero-equal side does not exist", expected, actual, 0.000001);
    }


    @Test
    public void testCalculateAreaWhenSidesArePositiveThenReturnPositiveNumber() {
        Triangle triangle = new Triangle(6, 8, 10);
        double expected = Math.sqrt(12 * (12 - 6) * (12 - 8) * (12 - 10));
        double actual = triangle.calculateArea();

        Assert.assertEquals("Area calculation is wrong", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsZeroOtherSidesPositiveThenReturnZero() {
        Triangle triangle = new Triangle(0, 4, 5);
        double expected = 0;
        double actual = triangle.calculateArea();

        Assert.assertEquals("The triangle with zero-equal side does not exist", expected, actual, 0.0001);
    }

    @Test
    public void testCalculateAreaWhenOneSideIsNegativeOtherSidesPositiveThenReturnZero() {
        Triangle triangle = new Triangle(-3, 4, 5);
        double expected = 0;
        double actual = triangle.calculateArea();

        Assert.assertEquals("The triangle with negative side does not exist", expected, actual, 0.0001);
    }

    @Test
    public void testIsEquilateralWhenAllSidesAreEqualAndPositiveThenReturnTrue() {
        Triangle triangle = new Triangle(4, 4, 4);

        Assert.assertTrue("Triangle should be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralWhenAllSidesAreEqualAndNegativeThenReturnFalse() {
        Triangle triangle = new Triangle(-4, -4, -4);

        Assert.assertFalse("The triangle with negative sides does not exist", triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralWhenOnlyTwoSidesAreEqualThenReturnFalse() {
        Triangle triangle = new Triangle(4, 4, 7);

        Assert.assertFalse("Triangle should not be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralWhenOtherTwoSidesAreEqualThenReturnFalse() {
        Triangle triangle = new Triangle(7, 4, 4);

        Assert.assertFalse("Triangle should not be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsEquilateralWhenTheLastTwoSidesAreEqualThenReturnFalse() {
        Triangle triangle = new Triangle(4, 7, 4);

        Assert.assertFalse("Triangle should not be equilateral", triangle.isEquilateral());
    }


    @Test
    public void testIsEquilateralWhenAllSidesAreNotEqualThenReturnFalse() {
        Triangle triangle = new Triangle(3, 4, 5);

        Assert.assertFalse("Triangle should not be equilateral", triangle.isEquilateral());
    }

    @Test
    public void testIsIsoscelesWhenTwoSidesAreEqualThenReturnTrue(){
        Triangle triangle = new Triangle(4, 4, 7);

        Assert.assertTrue("Triangle should be isosceles.", triangle.isIsosceles());
    }

    @Test
    public void testIsIsoscelesWhenOtherTwoSidesAreEqualThenReturnTrue(){
        Triangle triangle = new Triangle(7, 4, 4);

        Assert.assertTrue("Triangle should be isosceles.", triangle.isIsosceles());
    }

    @Test
    public void testIsIsoscelesWhenTheLastTwoSidesAreEqualThenReturnTrue(){
        Triangle triangle = new Triangle(4, 7, 4);

        Assert.assertTrue("Triangle should be isosceles.", triangle.isIsosceles());
    }

    @Test
    public void testIsIsoscelesWhenAllSidesAreEqualThenReturnTrue(){
        Triangle triangle = new Triangle(4, 4, 4);

        Assert.assertTrue("Triangle should be isosceles.", triangle.isIsosceles());
    }

    @Test
    public void testIsRightAngleWhenAllSidesPositiveThenReturnPositiveNumber() {
        Triangle triangle = new Triangle (3, 4, 5);

        Assert.assertTrue("The calculation is wrong", triangle.isRightAngle());
    }

    @Test
    public void testIsRightAngleWhenOneSideIsNegativeOtherSidesPositiveThenReturnFalse() {
        Triangle triangle = new Triangle (-3, 4, 5);

        Assert.assertFalse("The triangle with negative side does not exist", triangle.isRightAngle());
    }

    @Test
    public void testIsRightAngleWhenOneSideIsZeroOtherSidesPositiveThenReturnFalse() {
        Triangle triangle = new Triangle (0, 4, 5);

        Assert.assertFalse("The triangle with zero-equal side does not exist", triangle.isRightAngle());
    }
}

package highway.vehicle;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void testDoesItMoveWhenCarIsStartedThenSpeedIsPositiveNumber() {
        Car car = new Car("RegNumber", 100);
        car.start();

        Assert.assertTrue("Car should be moving", car.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenCarIsCreatedThenSpeedIsZero() {
        Car car = new Car("RegNumber", 100);

        Assert.assertFalse("Car should be still", car.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenCarIsStoppedThenSpeedIsZero() {
        Car car = new Car("RegNumber", 100);
        car.start();
        car.stop();

        Assert.assertFalse("Car should be not moving when stopped", car.doesItMove());
    }

    @Test
    public void testGetTaxWhenHorsepowerIsPositiveThenReturnPositive() {
        Car car = new Car("RegNumber", 100);
        double expected = 100 * 0.2;
        double actual = car.getTax();

        Assert.assertEquals("The calculation is wrong", expected, actual, 0.0001);
    }

    @Test
    public void testGetTaxWhenHorsepowerIsZeroThenReturnZero() {
        Car car = new Car("RegNumber", 0);
        double expected = 0;
        double actual = car.getTax();

        Assert.assertEquals("The tax should be zero", expected, actual, 0.0001);
    }

    @Test
    public void testGetTaxWhenHorsepowerIsNegativeThenReturnZero() {
        Car car = new Car("RegNumber", -100);
        double expected = 0;
        double actual = car.getTax();

        Assert.assertEquals("Car with negative HP does not exist", expected, actual, 0.0001);
    }
}

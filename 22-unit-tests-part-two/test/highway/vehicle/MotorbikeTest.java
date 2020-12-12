package highway.vehicle;

import org.junit.Assert;
import org.junit.Test;

public class MotorbikeTest {

    @Test
    public void testDoesItMoveWhenMotorbikeIsStartedThenSpeedIsPositiveNumber() {
        Motorbike motorbike = new Motorbike("RegNumber", 200);
        motorbike.start();

        Assert.assertTrue("Motorbike should be moving", motorbike.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenMotorbikeIsCreatedThenSpeedIsZero() {
        Motorbike motorbike = new Motorbike("RegNumber", 200);

        Assert.assertFalse("Motorbike should be still", motorbike.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenMotorbikeIsStoppedThenSpeedIsZero() {
        Motorbike motorbike = new Motorbike("RegNumber", 200);
        motorbike.start();
        motorbike.stop();

        Assert.assertFalse("Motorbike should be not moving when stopped", motorbike.doesItMove());
    }

    @Test
    public void testGetTaxWhenHorsepowerIsPositiveThenReturnPositive() {
        Motorbike motorbike = new Motorbike("RegNumber", 200);
        double expected = 200 * 0.1;
        double actual = motorbike.getTax();

        Assert.assertEquals("The calculation is wrong", expected, actual, 0.0001);
    }

    @Test
    public void testGetTaxWhenHorsepowerIsZeroThenReturnZero() {
        Motorbike motorbike = new Motorbike("RegNumber", 0);
        double expected = 0;
        double actual = motorbike.getTax();

        Assert.assertEquals("The tax should be zero", expected, actual, 0.0001);
    }

    @Test
    public void testGetTaxWhenHorsepowerIsNegativeThenReturnZero() {
        Motorbike motorbike = new Motorbike("RegNumber", -200);
        double expected = 0;
        double actual = motorbike.getTax();

        Assert.assertEquals("Motorbike with negative HP does not exist", expected, actual, 0.0001);
    }
}

package highway.vehicle;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void testDoesItMoveWhenCarIsStartedThenSpeedIsNotZero() {
        Car car = new Car("AS1234AS", 200);
        car.start();

        Assert.assertTrue("Car should be moving", car.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenCarIsCreatedThenSpeedIsZero() {
        Car car = new Car("AS1234AS", 200);

        Assert.assertFalse("Car should be still", car.doesItMove());
    }

    @Test
    public void testDoesItMoveWhenCarIsStoppedThenSpeedIsZero() {
        Car car = new Car("AS1234AS", 200);
        car.start();
        car.stop();

        Assert.assertFalse("Car should be not moving when stopped", car.doesItMove());
    }
}

package highway;

import highway.vehicle.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HighwayTest {

    private Highway highway;

    @Before
    public void initHighway() {
        this.highway = new Highway();
    }

    @Test
    public void testGetTaxWhenCarAddedThenTaxIsPositive() {
        Car car = new Car("asd", 200);
        highway.addNewVehicle(car);
        double expected = 40;

        Assert.assertEquals("Tax should be correct", expected, highway.getTaxGathered(), 0.0001);
    }
}

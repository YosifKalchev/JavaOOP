package highway;

import highway.vehicle.Car;
import highway.vehicle.Motorbike;
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
    public void testGetTaxGatheredWhenThereAreVehiclesOnTheHighwayThenReturnPositiveNumber() {
        Car car = new Car("RegNumber", 100);
        Motorbike motorbike = new Motorbike("RegNumber", 200);
        highway.addNewVehicle(car);
        highway.addNewVehicle(motorbike);

        double expected = (100 * 0.2) + ( 200 * 0.1);
        double actual = car.getTax() + motorbike.getTax();

        Assert.assertEquals("The calculation is wrong", expected, actual, 0.0001);

    }

    @Test
    public void testGetTaxGatheredWhenThereAreNoVehiclesOnTheHighwayThenReturnZero() {

        Car car = new Car("RegNumber", 100);
        Motorbike motorbike = new Motorbike("RegNumber", 200);

        double expected = 0;
        double actual = highway.getTaxGathered();

        Assert.assertEquals("The tax gathered value should be zero", expected, actual, 0.0001);

    }



    @Test
    public void testGetNumberOfVehiclesWhenVehiclesAreOnTheHighwayAndAddedAgainThenReturnTheCorrectNumberOfVehicles() {
        Car car = new Car("RegNumber", 100);
        Motorbike motorbike = new Motorbike("RegNumber", 200);

        highway.addNewVehicle(car);
        highway.addNewVehicle(car);
        highway.addNewVehicle(car);
        highway.addNewVehicle(motorbike);
        highway.addNewVehicle(motorbike);
    // vehicle already on the highway can not be added again
        
        double actual = 2;
        double expected = highway.getNumberOfVehicles();

        Assert.assertEquals("It should be only 1 vehicle on the highway", actual, expected, 0.0001);
    }

    @Test
    public void testRemoveVehicleWhenVehicleIsRemovedThenReturnFalse() {
        Car car = new Car("RegNumber", 100);
        highway.addNewVehicle(car);
        highway.removeVehicle(car);

        Assert.assertFalse("The vehicle should not be on the highway.", car.isOnHighway());
    }

    @Test
    public void testAddVehicleWhenVehicleIsAddedThenReturnTrue() {
        Car car = new Car("RegNumber", 100);
        highway.addNewVehicle(car);

        Assert.assertTrue("The vehicle should be on the highway", car.isOnHighway());
    }

}

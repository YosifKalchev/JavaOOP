package highway;

import highway.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collection;

public class Highway {

    private Collection<Vehicle> vehiclesOnHighway;
    private double taxGathered;

    public Highway() {
        this.taxGathered = 0;
        this.vehiclesOnHighway = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle) {
        this.vehiclesOnHighway.add(vehicle);
        taxGathered += vehicle.getTax();
    }

    public double getTaxGathered() {
        return taxGathered;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehiclesOnHighway.remove(vehicle);
    }

    public int getNumberOfVehicles() {
        return this.vehiclesOnHighway.size();
    }

}
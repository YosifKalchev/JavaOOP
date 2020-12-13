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

    public double getTaxGathered() {
        return taxGathered;
    }

    public int getNumberOfVehicles() {
        return this.vehiclesOnHighway.size();
    }


    public void addNewVehicle(Vehicle vehicle) {
        if (vehicle.isOnHighway()) {
            System.out.println("This vehicle is already on the highway.");
        } else {

            this.vehiclesOnHighway.add(vehicle);
            taxGathered += vehicle.getTax();
            vehicle.setIsOnHighway(true);
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (!vehicle.isOnHighway()) {
            System.out.println("This vehicle is not on the highway.");
        } else {
            this.vehiclesOnHighway.remove(vehicle);
            vehicle.setIsOnHighway(false);
        }
    }
    
}
package taxi.models;

import java.util.Set;

public class Trip {

    public Driver driver;
    public Set<Passenger> passengers;
    // the trip duration in minutes
    public int duration;
    // the trip distance in km
    public double distance;
    // the percentage of discount (in 0.0..1.0 if not null)
    public Double discount = null;

    public double getCost() {
        return (1 - (discount == null ? 0.0 : discount)) * (duration + distance);
    }

    public Trip(Driver driver, Set<Passenger> passengers, int duration, double distance, Double discount) {
        this.driver = driver;
        this.passengers = passengers;
        this.duration = duration;
        this.distance = distance;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "driver=" + driver +
                ", passengers=" + passengers +
                ", duration=" + duration +
                ", distance=" + distance +
                ", discount=" + discount +
                '}';
    }
}

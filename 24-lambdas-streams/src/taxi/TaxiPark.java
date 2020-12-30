package taxi;

import kotlin.ranges.IntRange;
import taxi.models.Driver;
import taxi.models.Passenger;
import taxi.models.Trip;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaxiPark {

    public Set<Driver> allDrivers;
    public Set<Passenger> allPassengers;
    public List<Trip> trips;

    public TaxiPark(Set<Driver> allDrivers, Set<Passenger> allPassengers, List<Trip> trips) {
        this.allDrivers = allDrivers;
        this.allPassengers = allPassengers;
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "allDrivers=" + allDrivers +
                ", allPassengers=" + allPassengers +
                ", trips=" + trips +
                '}';
    }

    // TASKS

    /*
     * Task #1. Find all the drivers who performed no trips.
     */
    public Set<Driver> findFakeDrivers() {
        return allDrivers
                .parallelStream()
                .filter(driver ->
                        !trips.parallelStream()
                                .map(trip -> trip.driver)
                                .collect(Collectors.toSet())
                                .contains(driver)

                )
                .collect(Collectors.toSet());
    }

    /*
     * Task #2. Find all the clients who completed at least the given number of trips.
     */
    Set<Passenger> findFaithfulPassengers(int minTrips) {
        if(minTrips == 0) return allPassengers;

        Map<String, List<Passenger>> map = trips.stream()
                .flatMap(trip -> trip.passengers.parallelStream())
                .collect(Collectors.groupingBy(passenger -> passenger.name));
//        System.out.println(map);
        return map.values().stream()
                .filter(passengers -> passengers.size() >= minTrips)
                .map(passengers -> passengers.get(0))
                .collect(Collectors.toSet());
    }

    /*
     * Task #3. Find all the passengers, who were taken by a given driver more than once.
     */
    Set<Passenger> findFrequentPassengers(Driver driver) {
//        return trips.stream().filter(trip -> trip.driver.equals(driver));
        return null;
    }

    /*
     * Task #4. Find the passengers who had a discount for majority of their trips.
     */
    Set<Passenger> findSmartPassengers() {
        return null;
    }

    /*
     * Task #5. Find the most frequent trip duration among minute periods 0..9, 10..19, 20..29, and so on.
     * Return any period if many are the most frequent, return `null` if there're no trips.
     */
    IntRange findTheMostFrequentTripDurationPeriod() {
        return null;
    }

    /*
     * Task #6.
     * Check whether 20% of the drivers contribute 80% of the income.
     */
    Boolean checkParetoPrinciple() {
        return false;
    }

}

import highway.Highway;
import highway.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Highway highway = new Highway();

        Car car = new Car("reg", 100);
        Car car2 = new Car("reg2", 100);

        System.out.println(highway.getNumberOfVehicles()); //0

        highway.addNewVehicle(car);                         // This vehicle is already on the highway.
        System.out.println(highway.getNumberOfVehicles()); //0

        highway.addNewVehicle(car2);                        // This vehicle is already on the highway.
        System.out.println(highway.getNumberOfVehicles()); //0

        highway.addNewVehicle(car2);                        // This vehicle is already on the highway.
        System.out.println(highway.getNumberOfVehicles()); //0
    }
}

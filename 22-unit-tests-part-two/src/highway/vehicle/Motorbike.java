package highway.vehicle;

public class Motorbike extends VehicleBase {


    public Motorbike(String registrationNumber, int horsepower) {
        super(registrationNumber, horsepower);
    }

    @Override
    public void start() {
        this.speed = 10;
    }

    @Override
    public void stop() {

        this.speed = 0;
    }

    @Override
    public boolean doesItMove() {
        return this.speed > 0;
    }

    @Override
    public double getTax() {

        return exists() ? getHorsepower() * 0.1 : 0;
    }

    @Override
    public boolean isOnHighway() {
        return false;
    }
}
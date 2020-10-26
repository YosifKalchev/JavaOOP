package highway.vehicle;

public class Car extends VehicleBase {

    protected boolean isProtectionOn;

    public Car(String registrationNumber, int horsepower) {
        super(registrationNumber, horsepower);
    }

    @Override
    public void start() {
        this.isProtectionOn = true;
        this.speed = 10;
    }

    @Override
    public void stop() {
        this.speed = 0;
        this.isProtectionOn = false;
    }

    @Override
    public boolean doesItMove() {
        return this.speed > 0;
    }

    @Override
    public double getTax() {
        return getHorsepower() * 0.2;
    }

}
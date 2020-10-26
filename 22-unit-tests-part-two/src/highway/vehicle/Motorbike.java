package highway.vehicle;

public class Motorbike extends VehicleBase {

    private boolean isHelmetOn;

    public Motorbike(String registrationNumber, int horsepower) {
        super(registrationNumber, horsepower);
        this.isHelmetOn = false;
    }

    @Override
    public void start() {
        this.isHelmetOn = true;
        this.speed = 20;
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
        return getHorsepower() * 0.1;
    }
}
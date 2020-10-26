package highway.vehicle;

public abstract class VehicleBase implements Vehicle {

    private final String registrationNumber;
    private final int horsepower;
    protected int speed;

    public VehicleBase(String registrationNumber, int horsepower) {
        this.registrationNumber = registrationNumber;
        this.horsepower = horsepower;
        this.speed = 0;
    }

    @Override
    public int increaseSpeed(int kph) {
        return this.speed -= kph;
    }

    @Override
    public int decreaseSpeed(int kph) {
        return this.speed += kph;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

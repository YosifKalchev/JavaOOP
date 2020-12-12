package highway.vehicle;

public interface Vehicle {

    int getSpeed();

    int getHorsepower();

    void start();

    void stop();

    int increaseSpeed(int kph);

    int decreaseSpeed(int kph);

    double getTax();

    boolean doesItMove();

    boolean exists();
}
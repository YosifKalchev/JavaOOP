package highway.vehicle;

public interface Vehicle {
    int getSpeed();

    int getHorsepower();

    void start();

    int increaseSpeed(int kph);

    int decreaseSpeed(int kph);

    void stop();

    boolean doesItMove();

    double getTax();
}
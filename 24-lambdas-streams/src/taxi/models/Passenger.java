package taxi.models;

import java.util.Objects;

public class Passenger {

    public String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger=" + name + ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(name, passenger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package shapes;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int findDiameter() {
        return exists() ? 2 * radius : 0;
    }

    @Override
    public double calculateArea() {

        return exists() ? Math.PI * radius * radius : 0;
    }

    @Override
    public double calculatePerimeter() {

        return exists() ? 2 * Math.PI * radius : 0;
    }

    public boolean exists() {
        return radius > 0;
    }
}
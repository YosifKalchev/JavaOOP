package shapes;

public class Rectangle implements Shape {
    private final int aSide;
    private final int bSide;

    public Rectangle(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }


    public double calculateDiagonal() {
        return exists() ? Math.sqrt((aSide * aSide) + (bSide * bSide)) : 0;
    }

    @Override
    public double calculateArea() {
        return exists() ? aSide * bSide : 0;
    }

    @Override
    public double calculatePerimeter() {
        return exists() ? 2 * (aSide + bSide) : 0;
    }


    public boolean exists() {

        return aSide > 0 && bSide > 0;
    }

    public boolean isSquare() {

        return aSide == bSide;

    }

}
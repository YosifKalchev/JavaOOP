package shapes;

public class Triangle implements Shape {

    int aSide;
    int bSide;
    int cSide;

    public Triangle(int aSide, int bSide, int cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = this.calculatePerimeter() * 1.0 / 2;
        //we are using the Heron formula
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSide) *
                (halfPerimeter - bSide) * (halfPerimeter - cSide));
    }

    @Override
    public double calculatePerimeter() {
        return exists() ? aSide + bSide + cSide : 0;
    }

    public boolean isEquilateral() {
        return aSide == bSide && aSide == cSide;
    }

    public boolean isIsosceles() {
        return aSide == bSide || aSide == cSide || bSide == cSide;
    }

    public boolean isRight() {
        //we are using the Pythagorean formula
        return (aSide * aSide) + (bSide * bSide) == cSide * cSide ||
                (bSide * bSide) + (cSide * cSide) == aSide * aSide ||
                (aSide * aSide) + (cSide * cSide) == bSide * bSide;
    }

    public boolean exists() {
        return aSide < bSide + cSide && bSide < aSide + cSide && cSide < aSide + bSide;
    }
}
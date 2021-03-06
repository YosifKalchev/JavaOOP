package shapes;

public class Triangle implements Shape {

    private final int aSide;
    private final int bSide;
    private final int cSide;


    public Triangle(int aSide, int bSide, int cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }



    @Override
    public double calculatePerimeter() {
        return exists() ? aSide + bSide + cSide : 0.0;
    }

    @Override
    public double calculateArea() {

        double halfPerimeter = this.calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSide) *
                (halfPerimeter - bSide) * (halfPerimeter - cSide));
    }

    public boolean isEquilateral() {
        return exists() && (aSide == bSide && aSide == cSide);
    }

    public boolean isIsosceles() {
        return exists() && (aSide == bSide || aSide == cSide || bSide == cSide);
    }

    public boolean isRightAngle() {
        //we are using the Pythagorean formula
        return exists() && ((aSide * aSide) + (bSide * bSide) == cSide * cSide ||
                (bSide * bSide) + (cSide * cSide) == aSide * aSide ||
                (aSide * aSide) + (cSide * cSide) == bSide * bSide);
    }

    public boolean exists() {
        return aSide < bSide + cSide && bSide < aSide + cSide && cSide < aSide + bSide;
    }
}
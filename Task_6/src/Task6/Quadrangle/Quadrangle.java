package Task6.Quadrangle;

import Task6.Figure;

public class Quadrangle extends Figure {
    protected double sideFirst;
    protected double sideSecond;
    protected double sideThird;
    protected double sideFourth;
    protected double angle;

    public Quadrangle(int number, String name, double sideFirst, double sideSecond, double sideThird, double sideFourth, double angle) {
        super(number, name);
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
        this.sideFourth = sideFourth;
        this.angle = angle;
    }

    public Quadrangle(int number, String name, double sideFirst, double angle) {
        super(number, name);
        this.sideFirst = sideFirst;
        this.angle = angle;
    }

    public Quadrangle(int number, String name, double sideFirst, double sideSecond, double angle) {
        super(number, name);
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.angle = angle;
    }

    public Quadrangle(int number, String name, double sideFirst, double sideThird, double sideFourth, double angle) {
        super(number, name);
        this.sideFirst = sideFirst;
        this.sideThird = sideThird;
        this.sideFourth = sideFourth;
        this.angle = angle;
    }

    public double getSideFirst() {
        return sideFirst;
    }

    public double getSideSecond() {
        return sideSecond;
    }

    public double getSideThird() {
        return sideThird;
    }

    public double getSideFourth() {
        return sideFourth;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", sideThird=" + sideThird +
                ", sideFourth=" + sideFourth +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}


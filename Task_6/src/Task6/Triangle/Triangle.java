package Task6.Triangle;

import Task6.Figure;

public class Triangle extends Figure {
    protected double sideFirst;
    protected double sideSecond;
    protected double angle;

    public Triangle(int number, String name, double sideFirst, double sideSecond, double angle) {
        super(number, name);
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.angle = angle;
    }

    public Triangle(int number, String name, double sideFirst, double angle) {
        super(number, name);
        this.sideFirst = sideFirst;
        this.angle = angle;
    }

    public Triangle(int number, String name, double sideFirst) {
        super(number, name);
        this.sideFirst = sideFirst;
    }

    @Override
    public String toString() {
        return "Task6.Task6.Triangle.Triangle{" +
                "sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public double getSideFirst() {
        return sideFirst;
    }

    public double getSideSecond() {
        return sideSecond;
    }

    public double getAngle() {
        return angle;
    }
}

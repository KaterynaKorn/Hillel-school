package Task6.Circle;

import Task6.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(int number, String name, double radius) {
        super(number, name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Task6.Circle.Task6.Circle{" +
                "radius=" + radius +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

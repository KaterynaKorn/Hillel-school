package Task6.Quadrangle;

public class Rectangle extends Quadrangle{
    public Rectangle(int number, String name, double sideFirst, double sideSecond) {
        super(number, name, sideFirst, sideSecond, 90);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

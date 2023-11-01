package Task6.Quadrangle;

public class Square extends Quadrangle{
    public Square(int number, String name, double sideFirst) {
        super(number, name, sideFirst, 90);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideFirst=" + sideFirst +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

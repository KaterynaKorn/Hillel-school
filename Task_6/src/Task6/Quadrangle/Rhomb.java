package Task6.Quadrangle;

public class Rhomb extends Quadrangle{
    public Rhomb(int number, String name, double sideFirst, double angle) {
        super(number, name, sideFirst, angle);
    }

    @Override
    public String toString() {
        return "Rhomb{" +
                "sideFirst=" + sideFirst +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

package Task6.Triangle;

public class Isosceles extends Triangle{

    public Isosceles(int number, String name, double sideFirst, double angle) {
        super(number, name, sideFirst, angle);
    }

    @Override
    public String toString() {
        return "Isosceles{" +
                "sideFirst=" + sideFirst +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

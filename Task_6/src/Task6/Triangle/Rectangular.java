package Task6.Triangle;

public class Rectangular extends Triangle{

    public Rectangular(int number, String name, double sideFirst, double sideSecond) {
        super(number, name, sideFirst, sideSecond, 90);
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

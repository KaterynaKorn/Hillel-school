package Task6.Quadrangle;

public class Parallelogram extends Quadrangle{

    public Parallelogram(int number, String name, double sideFirst, double sideSecond, double angle) {
        super(number, name, sideFirst, sideSecond, angle);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", angle=" + angle +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

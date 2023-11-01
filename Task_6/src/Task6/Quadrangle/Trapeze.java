package Task6.Quadrangle;

public class Trapeze extends Quadrangle{
    public Trapeze(int number, String name, double sideFirst, double sideThird, double sideFourth, double angle) {
        super(number, name, sideFirst, sideThird, sideFourth, angle);
        this.sideSecond=sideFirst;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
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

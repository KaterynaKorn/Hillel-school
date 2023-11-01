package Task6.Triangle;

public class Equilateral extends Triangle{
private double sideThird;

    public Equilateral(int number, String name, double sideFirst) {
        super(number, name, sideFirst);
        this.sideThird = sideFirst;
        this.sideSecond=sideFirst;
    }

    @Override
    public String toString() {
        return "Equilateral{" +
                " sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", sideThird=" + sideThird +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public double getSideThird() {
        return sideThird;
    }
}

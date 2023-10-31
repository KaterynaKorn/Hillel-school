public class Triangle {
    private double sideFirst;
    private double sideSecond;
    private double sideThird;

    public Triangle(double sideFirst, double sideSecond, double sideThird) {
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
    }

    public void setSideFirst(double sideFirst) {
        this.sideFirst = sideFirst;
    }

    public void setSideSecond(double sideSecond) {
        this.sideSecond = sideSecond;
    }

    public void setSideThird(double sideThird) {
        this.sideThird = sideThird;
    }

    public double getSideFirst() {
        return sideFirst;
    }

    public double getSideSecond() {
        return sideSecond;
    }

    public double getSideThird() {
        return sideThird;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideFirst=" + sideFirst +
                ", sideSecond=" + sideSecond +
                ", sideThird=" + sideThird +
                '}';
    }

    public double perimetr(){
        double perimetr=sideFirst+sideSecond+sideThird;
        return perimetr;
}
    public double area(){
        double perimetrHalf = (sideFirst+sideSecond+sideThird)/2;
        double area = Math.sqrt(perimetrHalf*(perimetrHalf-sideFirst)*(perimetrHalf-sideSecond)*(perimetrHalf-sideThird));
        return area;
    }
}

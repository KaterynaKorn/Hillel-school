package Task6;

public class Figure {
    protected int number;
    protected String name;


    public Figure(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Task6.Figure{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

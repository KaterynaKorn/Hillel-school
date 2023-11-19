package Vehickle;

public abstract class Vehickle {
    protected String name;
    protected String color;

    public Vehickle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void noize();
}

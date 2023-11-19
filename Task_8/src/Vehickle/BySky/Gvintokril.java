package Vehickle.BySky;

import Interface.Flyable;
import Vehickle.Vehickle;

public class Gvintokril extends Vehickle implements Flyable {
    public Gvintokril(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Gvintokrill");
    }

    @Override
    public void fly() {
        System.out.println("Gvintokril is flying");
    }
}

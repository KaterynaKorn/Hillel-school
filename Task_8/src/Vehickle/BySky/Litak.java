package Vehickle.BySky;

import Interface.Flyable;
import Vehickle.Vehickle;

public class Litak extends Vehickle implements Flyable {
    public Litak(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Litak");
    }

    @Override
    public void fly() {
        System.out.println("Litak is flying");
    }
}

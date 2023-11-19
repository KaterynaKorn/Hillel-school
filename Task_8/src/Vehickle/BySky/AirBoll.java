package Vehickle.BySky;

import Interface.Flyable;
import Vehickle.Vehickle;

public class AirBoll extends Vehickle implements Flyable {
    public AirBoll(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Airboll");
    }

    @Override
    public void fly() {
        System.out.println("Airboll is flying");
    }
}

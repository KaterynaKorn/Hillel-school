package Vehickle.ByRoad;

import Interface.Movable;
import Vehickle.Vehickle;

public class Bus extends Vehickle implements Movable {
    public Bus(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Bus");
    }

    @Override
    public void move() {
        System.out.println("Bus is moving");
    }
}

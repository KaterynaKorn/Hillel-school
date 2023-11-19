package Vehickle.ByRoad;

import Interface.Movable;
import Vehickle.Vehickle;

public class Tractor extends Vehickle implements Movable {
    public Tractor(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Tractor");
    }

    @Override
    public void move() {
        System.out.println("Tractor is moving");
    }
}

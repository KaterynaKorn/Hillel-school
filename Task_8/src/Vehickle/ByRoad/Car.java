package Vehickle.ByRoad;

import Interface.Movable;
import Vehickle.Vehickle;

public class Car extends Vehickle implements Movable {
    public Car(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Car");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

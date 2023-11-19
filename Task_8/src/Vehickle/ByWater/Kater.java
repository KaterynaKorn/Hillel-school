package Vehickle.ByWater;

import Interface.Swimable;
import Vehickle.Vehickle;

public class Kater extends Vehickle implements Swimable {
    public Kater(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Kater");
    }

    @Override
    public void swim() {
        System.out.println("Kater is swimming");
    }
}

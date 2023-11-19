package Vehickle.ByWater;

import Interface.Swimable;
import Vehickle.Vehickle;

public class Barja extends Vehickle implements Swimable {
    public Barja(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Barja");
    }

    @Override
    public void swim() {
        System.out.println("Barja is swimming");
    }
}

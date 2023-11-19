package Vehickle.ByWater;

import Interface.Swimable;
import Vehickle.Vehickle;

public class Lodka extends Vehickle implements Swimable {
    public Lodka(String name, String color) {
        super(name, color);
    }

    @Override
    public void noize() {
        System.out.println("Lodka");
    }

    @Override
    public void swim() {
        System.out.println("Lodka is swimming");
    }
}

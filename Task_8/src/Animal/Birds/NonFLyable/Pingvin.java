package Animal.Birds.NonFLyable;

import Animal.Animal;
import Interface.Movable;
import Interface.Swimable;

public class Pingvin extends Animal implements Movable, Swimable {

    public Pingvin(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Pingvin");
    }

    @Override
    public void move() {
        System.out.println("Pingvin is moving");
    }

    @Override
    public void swim() {
        System.out.println("Pingvin is swimming");
    }
}

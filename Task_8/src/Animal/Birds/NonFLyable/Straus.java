package Animal.Birds.NonFLyable;

import Animal.Animal;
import Interface.Movable;

public class Straus extends Animal implements Movable {
    public Straus(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Straus");
    }

    @Override
    public void move() {
        System.out.println("Straus is moving");
    }
}

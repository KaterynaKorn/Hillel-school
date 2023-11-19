package Animal.Pet;

import Animal.Animal;
import Interface.Movable;

public class Humster extends Animal implements Movable {
    public Humster(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Humster");
    }

    @Override
    public void move() {
        System.out.println("Humster can run");
    }
}

package Animal.Pet;

import Animal.Animal;
import Interface.Movable;

public class Dog extends Animal implements Movable {
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Gav gav");
    }

    @Override
    public void move() {
        System.out.println("Dog can run");
    }
}

package Animal.Pet;

import Animal.Animal;
import Interface.Movable;

public class Cat extends Animal implements Movable {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Myau");
    }

    @Override
    public void move() {
        System.out.println("Cat can run");
    }
}

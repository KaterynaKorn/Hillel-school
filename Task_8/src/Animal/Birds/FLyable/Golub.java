package Animal.Birds.FLyable;

import Animal.Animal;
import Interface.Flyable;

public class Golub extends Animal implements Flyable {
    public Golub(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Guli guli");
    }

    @Override
    public void fly() {
        System.out.println("Golub is flying");
    }
}

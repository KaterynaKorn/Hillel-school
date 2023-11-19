package Animal.Birds.NonFLyable;

import Animal.Animal;
import Interface.Flyable;
import Interface.Swimable;

public class Duck extends Animal implements Flyable, Swimable {

    public Duck(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Krja");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

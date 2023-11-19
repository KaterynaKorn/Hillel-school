package Animal.Birds.FLyable;

import Animal.Animal;
import Interface.Flyable;

public class Orel extends Animal implements Flyable {
    public Orel(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Orel");
    }

    @Override
    public void fly() {
        System.out.println("Orel is flying");
    }
}

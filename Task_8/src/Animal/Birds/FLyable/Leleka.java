package Animal.Birds.FLyable;

import Animal.Animal;
import Interface.Flyable;

public class Leleka extends Animal implements Flyable {
    public Leleka(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Leleka");
    }

    @Override
    public void fly() {
        System.out.println("Leleka is flying");
    }
}

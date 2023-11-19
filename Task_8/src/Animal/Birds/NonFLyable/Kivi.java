package Animal.Birds.NonFLyable;

import Animal.Animal;
import Interface.Movable;

public class Kivi extends Animal implements Movable {

    public Kivi(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Kivi");
    }

    @Override
    public void move() {
        System.out.println("Kivi is moving");
    }
}

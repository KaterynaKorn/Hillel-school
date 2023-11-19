package Animal.Fish;

import Animal.Animal;
import Interface.Swimable;

public class Shuka extends Animal implements Swimable {
    public Shuka(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Shuka doesn't speak");
    }

    @Override
    public void swim() {
        System.out.println("Shuka is swimming");
    }
}

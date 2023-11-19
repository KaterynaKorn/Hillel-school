package Animal.Fish;

import Animal.Animal;
import Interface.Swimable;

public class Som extends Animal implements Swimable {
    public Som(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Som doesn't speak");
    }

    @Override
    public void swim() {
        System.out.println("Som is swimming");
    }
}

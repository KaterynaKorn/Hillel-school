package Animal.Fish;

import Animal.Animal;
import Interface.Swimable;

public class Karas extends Animal implements Swimable {
    public Karas(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Karas doesn't speak");
    }

    @Override
    public void swim() {
        System.out.println("Karas is swimming");
    }
}

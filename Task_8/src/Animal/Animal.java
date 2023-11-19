package Animal;

import java.util.Scanner;

public abstract class Animal {
    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public abstract void voice();
}





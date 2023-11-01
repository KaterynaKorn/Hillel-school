package Task6;

import Task6.Circle.Circle;
import Task6.Quadrangle.*;
import Task6.Triangle.Equilateral;
import Task6.Triangle.Isosceles;
import Task6.Triangle.Rectangular;
import Task6.Triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure fig = new Figure(1, "Any");
        System.out.println(fig);
        Circle circle = new Circle(2,"circle", 5);
        System.out.println(circle);
        System.out.println();
        Triangle triangle = new Triangle(3, "triangle", 3,3,60);
        System.out.println(triangle);
        Rectangular rectangular = new Rectangular(5,"rectangular", 4, 5);
        System.out.println(rectangular);
        Isosceles isosceles = new Isosceles(6,"isosceles", 8, 60);
        System.out.println(isosceles);
        Equilateral equilateral = new Equilateral(7,"equilateral", 4);
        System.out.println(equilateral);
        System.out.println();

        Quadrangle quadrangle = new Quadrangle(4,"quad", 2,3,4 ,5,60);
        System.out.println(quadrangle);
        Square square = new Square(8, "square", 5);
        System.out.println(square);
        Rectangle rectangle = new Rectangle(9, "rectangle", 5, 8);
        System.out.println(rectangle);
        Parallelogram parallelogram = new Parallelogram(10, "parallelogram", 4, 5, 60);
        System.out.println(parallelogram);
        Trapeze trapeze = new Trapeze(11,"trapeze", 4,7,10,40);
        System.out.println(trapeze);
        Rhomb rhomb = new Rhomb(12, "rhomb", 16, 45);
        System.out.println(rhomb);
    }
}
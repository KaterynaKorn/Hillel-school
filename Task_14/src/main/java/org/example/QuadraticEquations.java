package org.example;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquations {
    double coef1;
    double coef2;
    double coef3;

    public QuadraticEquations(double coef1, double coef2, double coef3) {
        this.coef1 = coef1;
        this.coef2 = coef2;
        this.coef3 = coef3;
    }

    public List<Double> quadraticEquations (){
        double rootFirst;
        double rootSec;
        List<Double> roots = new ArrayList<>();

        Double descriminant = coef2*coef2-4*coef1*coef3;
        if (descriminant<0){
            System.out.println("There are no real roots of the equation");
        } else if (descriminant==0) {
            rootFirst = -coef2/(2*coef1);
            roots.add(rootFirst);
            System.out.println(rootFirst);
        }
        else {
            rootFirst=((-coef2+Math.sqrt(descriminant))/(2*coef1));
            roots.add(rootFirst);
            rootSec=((-coef2-Math.sqrt(descriminant))/(2*coef1));
            roots.add(rootSec);
            System.out.println(rootFirst + " " + rootSec);

        }

        return roots;
    }

}

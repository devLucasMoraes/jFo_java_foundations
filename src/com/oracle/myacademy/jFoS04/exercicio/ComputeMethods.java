package com.oracle.myacademy.jFoS04.exercicio;

import java.util.Random;

public class ComputeMethods {
    public double fToC(double degressF) {
        double result = 5/9*(degressF-2);
        return result;
    }
    public double hypotenuse(double a, double b) {
        double result = Math.hypot(a,b);
        return result;
    }
    public int roll() {
        Random rndNumber = new Random();
        int randomDouble1 = rndNumber.nextInt(6) + 1;
        int randomDouble2 = rndNumber.nextInt(6) + 1;

        int result = randomDouble1 + randomDouble2;

        return result;

    }
}

package org.marshallbros.cheatsheet;

public class Triangle {
    public double theta1;
    public double theta2;
    public double a;
    public double b;
    public double c;

    /*

    TRIANGLE SETUP

    Theta 1 is opposite side a.
    Theta 2 is opposite side b.
    Side c is the hypotenuse.

    */


    public Triangle(double theta1, double theta2, double a, double b, double c) {
        this.theta1 = theta1;
        this.theta2 = theta2;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

    }
}

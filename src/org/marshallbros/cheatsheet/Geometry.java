package org.marshallbros.cheatsheet;

public class Geometry {
    //MISCELLANEOUS
    public double pythagoreanTheorem(double a, double b, double c) {
        double answer = -1.0;

        if(a == -1.0) answer = c * c - b * b;
        else if(b == -1.0) answer = c * c - a * a;
        else if(c == -1.0) answer = a * a + b * b;

        return answer;
    }

    public String checkTriangleType(double a, double b, double c) {
        if(a * a + b * b == c * c) return "right";
        else if(a * a + b * b > c * c) return "acute";
        else return "obtuse";
    }

    //SHAPES
    //2D Shapes
    public double regularNGonArea(double numberOfSides, double length) {
        double theta = 360 / (numberOfSides * 2);
        double apothem = length / (2 * Math.tan(theta));
        double perimeter = length * numberOfSides;

        return 0.5 * apothem * perimeter;
    }

    public double rectangleArea(double l, double h) {
        return l * h;
    }

    public double trapezoidArea(double b1, double b2, double h) {
        return 0.5 * (b1 + b2) * h;
    }

    public double triangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    public double circleArea(double r) {
        return Math.PI * r * r;
    }

    //3D Shapes
    //Prisms
    public double nGonPrismVolume(double numberOfSides, double l, double h) {
        return regularNGonArea(numberOfSides, l) * h;
    }

    public double rectangularPrismVolume(double l, double w, double h) {
        return rectangleArea(l, w) * h;
    }

    public double triangularPrismVolume(double l, double w, double h) {
        return triangleArea(l, w) * h;
    }

    //Pyramids
    public double regularNGonPyramidVolume(double numberOfSides, double l, double h) {
        return nGonPrismVolume(numberOfSides, l, h) / 3;
    }

    public double rectangularPyramidVolume(double l, double w, double h) {
        return rectangularPrismVolume(l, w, h) / 3;
    }

    public double triangularPyramidVolume(double l, double w, double h) {
        return triangularPrismVolume(l ,w ,h) / 3;
    }

    //Other
    public double sphereVolume(double r) {
        return (4 * Math.PI * r * r * r) / 3;
    }

    public double cylinderVolume(double r, double h) {
        return circleArea(r) * h;
    }

    double coneVolume(double r, double h) {
        return cylinderVolume(r, h) / 3;
    }
}

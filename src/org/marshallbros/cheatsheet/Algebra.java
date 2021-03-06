package org.marshallbros.cheatsheet;

import java.awt.*;

public class Algebra {
    public static double[] quadraticFormula(double a, double b, double c) {
        double[] answers = new double[2];

        answers[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        answers[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        return answers;
    }

    public static Point findQuadraticVertex(double a, double b, double c) {
        double x = (-b) / (2 * a);
        double y = a * x * x + b * x + c;

        return new Point(x, y);
    }

    public static double distanceFormula(Point a, Point b) {
        double xDiff = Math.abs(a.x - b.x);
        double yDiff = Math.abs(a.y - b.y);

        return Geometry.pythagoreanTheorem(xDiff, yDiff, -1.0);

    }
}

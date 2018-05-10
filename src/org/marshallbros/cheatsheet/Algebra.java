package org.marshallbros.cheatsheet;

import java.awt.*;

public class Algebra {
    public Algebra() {

    }

    public double[] quadraticFormula(double a, double b, double c) {
        double[] answers = new double[2];

        answers[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        answers[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        return answers;
    }

    public double[] findQuadraticVertex(double a, double b, double c) {
        double[] answer = new double[2];

        answer[0] = (-b) / (2 * a);
        answer[1] = 0;

        return answer;
    }
}

package org.marshallbros.cheatsheet;

public class Trigonometry {
    public Triangle solveTriangle(Triangle triangle) {
        /*
        Theta 1 is opposite side a.
        Theta 2 is opposite side b.
        Side c is the hypotenuse.

        -1 is passed in to signify a value to solve for
         */

        if(triangle.theta1 != -1.0) {
            if(triangle.a != -1.00) {
                triangle.b = triangle.a / Math.tan(triangle.theta1);
                triangle.c = triangle.a / Math.sin(triangle.theta1);

                triangle.theta2 = 90 - triangle.theta1;
            } else if(triangle.b != -1.0) {
                triangle.a = triangle.b * Math.tan(triangle.theta1);
                triangle.c = triangle.b / Math.cos(triangle.theta1);

                triangle.theta2 = 90 - triangle.theta1;
            } else if(triangle.c != -1.0) {
                triangle.a = triangle.c * Math.sin(triangle.theta1);
                triangle.b = triangle.c * Math.cos(triangle.theta1);
            }
        } else if(triangle.theta2 != -1.0) {
            if(triangle.a != -1.0) {
                triangle.b = triangle.a * Math.tan(triangle.theta2);
                triangle.c = triangle.a / Math.cos(triangle.theta2);

                triangle.theta1 = 90 - triangle.theta2;
            } else if(triangle.b != -1.0) {
                triangle.a = triangle.b / Math.tan(triangle.theta2);
                triangle.c = triangle.b / Math.sin(triangle.theta2);

                triangle.theta1 = 90 - triangle.theta2;
            } else if(triangle.c != -1.0) {
                triangle.a = triangle.c * Math.cos(triangle.theta2);
                triangle.b = triangle.c * Math.sin(triangle.theta2);

                triangle.theta1 = 90 - triangle.theta2;
            }
        } else {
            //To Be Continued
        }

        //Return error code
        return triangle;
    }
}

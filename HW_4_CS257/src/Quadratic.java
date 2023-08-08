/**
 * Class Quadratic - represents quadratic equations
 * of the form a * x^2 + b * x + c
 *
 * @author spc 2/2/06
 * @version 1/18/23
 * Comments added by: Roshan Poudel
 */

import java.util.Scanner;

public class Quadratic {
    private double a; // x squared term coefficient
    private double b; // x term coefficient
    private double c; // constant coefficient


    /**
     * Constructs a new Quadratic object with the given coefficients.
     *
     * @precondition A is not zero.
     * @param A the coefficient of the x squared term
     * @param B the coefficient of the x term
     * @param C the constant
     * @throws IllegalArgumentException if A is zero.
     * @postcondition The Quadratic object is initialized with the given coefficients A, B, and C.
     */
    public Quadratic(double A, double B, double C) {
        if (A == 0) {
            throw new IllegalArgumentException("Coefficient of x squared term cannot be zero");
        }
        a = A;
        b = B;
        c = C;
    }

    /**
     * Evaluates the quadratic equation for the given value of x.
     *
     * @param x the value of x to evaluate the quadratic equation at
     * @return the result of the evaluation
     * @postcondition The quadratic equation is evaluated for the given value of x.
     */
    public double evaluate(double x) {
        return a*x*x + b*x + c;
    }

    /**
     * Computes the roots of the quadratic equation using the quadratic formula.
     *
     * @precondition: a is not zero and the discriminant is not negative
     * @throws IllegalStateException if the discriminant is negative
     * @throws IllegalArgumentException if a is zero
     * @postcondition The roots of the quadratic equation are computed and printed.
     */
    public void quadFormula() {
        if (a != 0) {
            double disc = b * b - 4 * a * c;
            if (disc >= 0) {
                double root1 = (-b + Math.sqrt(disc)) / (2 * a);
                double root2 = (-b - Math.sqrt(disc)) / (2 * a);
                System.out.println("root 1 is " + root1 + ", root 2 is " + root2);
            } else {
                throw new IllegalStateException ("Error: negative discriminant");
            }
        } else {
            throw new IllegalArgumentException ("Error: attempt to divide by zero");
        }
    }

}

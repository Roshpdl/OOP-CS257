package Q4;

import java.util.Arrays;

/**
 * Class Quadratic - represents quadratic equations
 * of the form a * x^2 + b * x + c
 *
 * @author spc 2/2/06
 * @version 1/18/23
 * Modified by: Roshan Poudel (HW#5)
 * Comments added by: Roshan Poudel
 */

public class Quadratic {
    private int[] coefficients;


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
    public Quadratic(int A, int B, int C) {
        coefficients = new int[3];
        coefficients[0] = C;
        coefficients[1] = B;
        coefficients[2] = A;
//        if (A == 0) {
//            throw new IllegalArgumentException("Error: A cannot be zero");
//        }
    }

    /**
     * Evaluates the quadratic equation for the given value of x.
     *
     * @param x the value of x to evaluate the quadratic equation at
     * @return the result of the evaluation
     * @postcondition The quadratic equation is evaluated for the given value of x.
     */
    public double evaluate(double x) {
        return coefficients[2] * x * x + coefficients[1] * x + coefficients[0];
    }

    /**
     * Returns the coefficients of the quadratic equation
     * @return the coefficients of the quadratic equation
     */
    public int[] getCoefficients() {
        return coefficients;
    }


    /**
     * Computes the roots of the quadratic equation using the quadratic formula.
     * @precondition: coefficient of the x^2 term is not zero and the discriminant is not negative
     * @throws IllegalStateException if the discriminant is negative
     * @throws IllegalArgumentException if the coefficient of the x^2 term is zero
     * @return returns an array containing the roots of the quadratic equation
     * @postcondition The roots of the quadratic equation are computed and returned.
     */
    public double[] roots() {
        if (coefficients[2] != 0) {
            double disc = Math.pow(coefficients[1], 2) - 4 * coefficients[2] * coefficients[0];
            if (disc >= 0) {
                double root1 = (-coefficients[1] + Math.sqrt(disc)) / (2 * coefficients[2]);
                double root2 = (-coefficients[1] - Math.sqrt(disc)) / (2 * coefficients[2]);
                return new double[]{root1, root2};
            } else {
                throw new IllegalStateException("Error: negative discriminant");
            }
        }else{
            throw new IllegalArgumentException("Error: Cannot divide by zero");
        }
    }

    /**
     * Returns a string representation of the quadratic equation
     * @return a string representation of the quadratic equation
     */
    @Override
    public String toString(){
        String s = "";
        if (coefficients[2] != 0) {
            s += coefficients[2] + "x^2";
        }
        if (coefficients[1] != 0){
            s += (coefficients[2] == 0 ? "": " + ") + coefficients[1] + "x";
        }
        if (coefficients[0] != 0){
            s += (coefficients[1] == 0 && coefficients[2] == 0 ? "" : " + ") + coefficients[0];
        }
        return s;
    }

    /**
     * Returns true if the two quadratic equations are equal
     * @param other the other quadratic equation
     * @return true if the two quadratic equations are equal
     */
    public boolean equals(Quadratic other) {
        return Arrays.equals(coefficients, other.getCoefficients());
    }
}


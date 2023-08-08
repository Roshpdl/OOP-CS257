/**
 * Class Quadratic - represents quadratic equations
 *   of the form a * x^2 + b * x + c
 *
 * @author spc 2/2/06
 * @version 1/18/23
 */

import java.util.Scanner;

public class Quadratic {
    private double a; // x squared term coefficient
    private double b; // x term coefficient
    private double c; // constant coefficient

    public Quadratic(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
    }

    // evaluate
    // post: given any value of x, returns the result of computing the equation
    public double evaluate(double x) {
        return a*x*x + b*x + c;
    }

    // quadraticFormula
    // pre: coefA != 0 && b*b >= 4*a*c
    // post: computes and displays the roots using System.out.println
    public void quadFormula() {
        if (a != 0) {
            double disc = b * b - 4 * a * c;
            if (disc >= 0) {
                double root1 = (-b + Math.sqrt(disc)) / (2 * a);
                double root2 = (-b - Math.sqrt(disc)) / (2 * a);
                System.out.println("root 1 is " + root1 + ", root 2 is " + root2);
            } else {
                System.out.println("Error: negative discriminant");
            }
        } else {
            System.out.println("Error: attempt to divide by zero");
        }
    }

    public static void main(String[] args) {
        int fst, scnd, thrd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficients for quadratic eqn: ");
        fst = input.nextInt();
        scnd = input.nextInt();
        thrd = input.nextInt();
        Quadratic q = new Quadratic(fst, scnd, thrd);
        System.out.print("Enter value for x: ");
        double x = input.nextDouble();
        System.out.println("Evaluating eqn at " + x + " gives "+ q.evaluate(x));
        System.out.print("Finding roots of the eqn...");
        q.quadFormula();
    }

}

import java.util.Arrays;

/**
 * Class Main - contains tests for class Quadratic
 * @author Roshan Poudel
 */

public class Main {
    public static void main(String[] args) {

        //testing the constructor
        System.out.println("Testing the constructor");
        Quadratic test1Quad = new Quadratic(1, 6, 3);
        Quadratic test2Quad = new Quadratic(0, 3, 3);
        Quadratic test3Quad = new Quadratic(1, 2, 0);
        Quadratic test4Quad = new Quadratic(1, 0, 3);
        System.out.println("Objects created successfully");
        System.out.println();

        //testing the evaluate method
        System.out.println("Testing the evaluate method");
        System.out.println(test1Quad.evaluate(1));
        System.out.println(test2Quad.evaluate(2));
        System.out.println(test3Quad.evaluate(3));
        System.out.println(test4Quad.evaluate(5));
        System.out.println();

        //testing the getCoefficients method
        System.out.println("Testing the getCoefficients method");
        System.out.println(Arrays.toString(test1Quad.getCoefficients()));
        System.out.println(Arrays.toString(test2Quad.getCoefficients()));
        System.out.println(Arrays.toString(test3Quad.getCoefficients()));
        System.out.println(Arrays.toString(test4Quad.getCoefficients()));
        System.out.println();

        //testing the roots method
        try {
            System.out.println("Testing the roots method");
            System.out.println("The roots for first quadratic equation are " + Arrays.toString(test1Quad.roots()));
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("The roots for second quadratic equation are " + Arrays.toString(test2Quad.roots()));
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("The roots for third quadratic equation are " + Arrays.toString(test3Quad.roots()));
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("The roots for fourth quadratic equation are " + Arrays.toString(test4Quad.roots()));
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        //testing the toString method
        System.out.println("Testing the toString method");
        System.out.println(test1Quad);
        System.out.println(test2Quad);
        System.out.println(test3Quad);
        System.out.println(test4Quad);
    }
}

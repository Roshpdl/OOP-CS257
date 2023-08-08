/**
 * CS257 Object-Oriented Programming
 * Ackermann.java - This program computes the Ackermann function recursively for non-negative long integers m and n.
 * @author Roshan Poudel
 * @version 1.0 04/20/2023
 */

import java.util.Scanner;

public class Ackermann {

    public static void main(String[] args) {
        long m, n;
        Scanner in = new Scanner(System.in);
        System.out.println("This program calculates ackermann function for the given values of m and n");
        String contd = "y";
        while (contd.equalsIgnoreCase("y")){
            System.out.print("Enter m: ");
            m = in.nextLong();
            System.out.print("Enter n: ");
            n = in.nextLong();
            System.out.println("Computing Ackermann Function (This may take a while ...): ");
            System.out.println(ackermann(m, n));
            System.out.println("Continue(y/n) ?");
            contd = in.next();
        }
    }

    /**
     * This method computes the Ackermann function for non-negative long integers m and n.
     * The Ackermann function is defined recursively as follows for all non-negative m and n:
     * A(0, n) = n + 1
     * A(m, 0) = A(m - 1, 1)
     * A(m, n) = A(m - 1, A(m, n - 1))
     *
     * @precondition m and n must be non-negatives
     * @param m the first non-negative long integer input to the Ackermann function
     * @param n the second non-negative long integer input to the Ackermann function
     * @return the value of the Ackermann function for the given inputs
     * @throws IllegalArgumentException if either m or n is negative
     */
    public static long ackermann(long m, long n){
        if (m < 0 || n < 0) //precondition
            throw new IllegalArgumentException("m and n must be non-negatives");
        if (m == 0){
            return n + 1;
        }else if (n == 0){
            return ackermann(m-1, 1);
        }else {// if m>0 && n>0
            return ackermann(m-1, ackermann(m, n-1));
        }
    }
}

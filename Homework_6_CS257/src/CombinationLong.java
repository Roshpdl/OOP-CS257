/**
 * CS257 Object-Oriented Programming
 * CombinationLong.java - This program computes the number of ways to choose k items from n items recursively.
 * @author Roshan Poudel
 * @version 1.0 04/20/2023
 */

import java.util.Scanner;

public class CombinationLong {
    public static void main(String[] args) {
        int n, k;
        String continueChoice = "y";
        while (continueChoice.equalsIgnoreCase("y")){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter n: ");
            n = in.nextInt();
            System.out.print("Enter k: ");
            k = in.nextInt();
            System.out.println("Using choose1 method:");
            System.out.println("choose1(" + n + ", " + k + ") = " + choose1(n, k));
            System.out.println("Using choose2 method:");
            System.out.println("choose2(" + n + ", " + k + ") = " + choose2(n, k));
            System.out.println();
            System.out.print("Continue? (y/n): ");
            continueChoice = in.next();
        }
    }

    /**
     * choose1 - computes the number of ways to choose k items from n items recursively, but using factorial method.
     * @precondition: n > 0 && n > k >= 0
     * @param n number of items
     * @param k number of items to choose
     * @return number of ways to choose k items from n items
     */
    public static long choose1(int n, int k)
    {
        // use the fact method to compute the number of ways to choose k items from n items
        // Combination formula: n! / (k! * (n-k)!)
        return fact(n) / (fact(k) * fact(n - k));
    }

    /**
     * choose2 - computes the number of ways to choose k items from n items recursively using pascal's identity.
     *
     * @param n number of items
     * @param k number of items to choose
     * @return number of ways to choose k items from n items
     * @precondition: n > 0 && n > k >= 0
     */
    public static long choose2(int n, int k)
    {
        if (n <= 0 || k < 0) // precondition
            throw new IllegalArgumentException("n and k must be >= 0");
        if (k == 0) // first base case
            return 1;
        else if (n == k) // second base case
            return 1;
        else // recursive step
            return choose2(n-1, k) + choose2(n-1, k-1);
    }

    /**
     * fact - computes the factorial of n recursively
     * @precondition: n >= 0
     * @param n number to compute factorial of
     * @return factorial of n
     */
    public static long fact(int n)
    {
        if (n < 0) // precondition
            throw new IllegalArgumentException("n must be >= 0");
        if (n < 2) // base case
            return 1;
        else // recursive step (call in bold)
            return (n * fact(n - 1));
    }
}


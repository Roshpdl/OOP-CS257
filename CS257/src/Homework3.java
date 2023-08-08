/**
 * Author: Roshan Poudel, CS257
 * Part 3 - Arrays
 * Homework3.java
 * Date: Feb 10, 2023
 */

import java.util.Arrays;

public class Homework3 {
    /**
     * Return a new array containing the pairwise maximum value of
     * the arguments. For each subscript i, the return value at [i]
     * will be the larger of x[i] and y[i].
     *
     * @param x an array of double values
     * @param y an array of double values
     * @return pairwise max of x and y
     */
    public static double[] pairwiseMax(double[] x, double[] y) {
        int arrLen = Math.min(x.length, y.length);
        double[] pairMax = new double[arrLen];
        for(int i = 0; i < arrLen; i++) pairMax[i] = Math.max(x[i], y[i]);
        return pairMax;
    }

    /**
     * Computes the final average grade for a student. The labs are
     * worth 40% and the exams are worth 60%. All scores range from
     * 0 to 100, inclusive.
     *
     * @param labs the student's lab scores
     * @param exams the student's exam scores
     * @return weighted average of all scores
     */
    public static double finalGrade(int[] labs, int[] exams) {
        double avgLabs = 0;
        double avgExams = 0;
        for (int lab: labs) avgLabs += lab;
        for (int exam: exams) avgExams += exam;
        avgLabs /= labs.length;
        avgExams /= exams.length;
        return avgLabs * 0.4 + avgExams * 0.6;
    }

    public static void main(String[] args) {
        double[] arr1 = {3.0, 6.0, 9.0 , 4.5, 6.7, 8.4, 9.5};
        double[] arr2 = {4.5, 2.5, 6.2, 5.4, 7.8, 3.9, 8.5};
        double[] maxPair = pairwiseMax(arr1, arr2);
        System.out.println("Pairwise Max: " + Arrays.toString(maxPair));

        int[] labs = {70, 60, 80, 90, 99, 88, 85, 69, 95};
        int[] exams = {95, 85, 77, 98};
        System.out.printf("The final grade is %.2f", finalGrade(labs, exams));
    }

}

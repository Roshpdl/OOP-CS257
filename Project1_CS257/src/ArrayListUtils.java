/**
 * Class containing static methods for operations on ArrayLists of integers
 * CS 257 Object-Oriented Programming
 * @author Roshan Poudel
 * @date 2023-02-20
 */

import java.util.ArrayList;

public class ArrayListUtils {
    /**
     * Checks if the array is null or empty
     * @param array
     */
    public static void checkArray(ArrayList<Integer> array) {
        if (array == null || array.size() == 0) {
            throw new IllegalArgumentException("Array input is null or empty");
        }
    }

    /**
     * Returns the smallest value in the array
     * @param array the array to search
     * @return the smallest value in the array
     */
    public static int minVal(ArrayList<Integer> array) {
        checkArray(array);
        int smallest = array.get(0);
        for (int value : array) {
            if (value < smallest) smallest = value;
        }
        return smallest;
    }

    /**
     * Returns the largest value in the array
     * @param array the array to search
     * @return the largest value in the array
     */
    public static int maxVal(ArrayList<Integer> array) {
        checkArray(array);
        int largest = array.get(0);
        for (int value : array) {
            if (value > largest) largest = value;
        }
        return largest;
    }

    /**
     * Given an integer value target, return true if it is contained in the array
     * @param array the array to search
     * @param target the target to search for
     * @return true if the target is in the array
     */
    public static boolean contains(ArrayList<Integer> array, int target) {
        checkArray(array);
        for (int value : array) {
            if (value == target) return true;
        }
        return false;
    }

    /**
     * Returns the sum of all the values in the array
     * @param array the array to sum
     * @return the sum of all the values in the array
     */
    public static int sum(ArrayList<Integer> array) {
        checkArray(array);
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    /**
     * Returns the average of all the values in the array
     * @param array the array to average
     * @return the average of all the values in the array
     */
    public static double average(ArrayList<Integer> array) {
        checkArray(array);
        return (double) sum(array) / array.size();
    }

    /**
     * appends a value into an array
     * @param array the partially filled array to insert into
     * @param value the value to insert
     */
    public static void insertAtIndex(ArrayList<Integer> array, int value, int index) {
        array.set(index, value);
    }

    /**
     * Remove the element stored at a given index
     * @param array the array to remove from
     * @param index the index of the element to remove
     */
    public static void removeAtIndex(ArrayList<Integer> array, int index) {
        checkArray(array);
        if (index < 0 || index >= array.size()) {
            throw new IllegalArgumentException("Index is out of bounds");
        }
        array.remove(index);
    }
}

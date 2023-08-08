/**
 * Class containing static methods for operations on static integer arrays
 * CS 257 Object-Oriented Programming
 * @author Roshan Poudel
 * @date 2023-02-20
 */

public class ArrayUtils {

    /**
     * Checks if the array is null or empty
     * @param array
     */
    public static void checkArray(int[] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array input is null or empty");
        }
    }

    /**
     * Returns the smallest value in the array
     * @param array the array to search
     * @return the smallest value in the array
     */
    public static int minVal(int[] array) {
        checkArray(array);
        int smallest = array[0];
        for (int value: array){
            if (value < smallest) smallest = value;
        }
        return smallest;
    }

    /**
     * Returns the largest value in the array
     * @param array the array to search
     * @return the largest value in the array
     */
    public static int maxVal(int[] array) {
        checkArray(array);
        int largest = array[0];
        for (int value: array){
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
    public static boolean contains(int[] array, int target){
        checkArray(array);
        for (int value: array){
            if (value == target) return true;
        }
        return false;
    }

    /**
     * Returns the sum of all the values in the array
     * @param array the array to sum
     * @return the sum of all the values in the array
     */
    public static int sum(int[] array) {
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
    public static double average(int[] array) {
        checkArray(array);
        return (double) sum(array) / array.length;
    }

    /**
     * inserts a value into the array at a given index
     * @param array the partially filled array to insert into
     * @param value the value to insert
     * @param index the index to insert the value at
     */
    public static void insertAtIndex(int[] array, int value, int index) {
        checkArray(array);
        if (index < 0 || index > array.length) {
            throw new IllegalArgumentException("Index is out of bounds");
        }
        // Shift the elements to the right to make room for the new value
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new value at the specified index
        array[index] = value;
    }



    /**
     * Remove the element stored at a given index
     * @param array the array to remove from
     * @param index the index of the element to remove
     */
    public static void removeAtIndex(int[] array, int index) {
        checkArray(array);
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Index is out of bounds");
        }
        // Shift the elements to the left to remove the value
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        // Set the last element of the array to 0
        array[array.length - 1] = 0;
    }
}

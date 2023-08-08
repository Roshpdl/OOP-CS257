/**
 * CS257 Object-Oriented Programming and Data Structures
 * RecursiveBinarySearch.java
 * Purpose: To demonstrate the use of recursion in a binary search algorithm.
 * Spring 2023
 *
 */

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] data = {3, 7, 31, 127, 8191, 131071, 524287};
        int index = binarySearch(data, 8191);
        System.out.println(index);

    }

    /** binarySearch - searches array for a target value (recursive version)
     *  @precondition: data is in sorted order
     *  @postcondition - returns index of array where target found, or -1 if not found
     */
    public static int binarySearch(int[] data, int x) {
        return binarySearch( data, x, 0, data.length -1 );
    }

    /**
     * "Hidden" recursive routine.
     */
    private static int binarySearch(int[] data, int x, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (data[mid] < x)
            return binarySearch(data, x, mid + 1, high);
        else if (data[mid] > x)
            return binarySearch(data, x, low, mid - 1);
        else
            return mid;
    }
}

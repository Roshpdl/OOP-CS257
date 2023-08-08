/**
 * Searches.java - This program implements linear and binary search algorithms
 * Author - Dr.Stephen Carl
 * Modified by - Roshan Poudel
 * PROGRAMMING PROJECT 4, CS257, SPRING 2023
 * Date - 5/03/2023
 */

package Q1_Q2;

public final class Searches<T extends Comparable<T>> {

    // contains: search for an item in an array
    // precondition: data != null
    // postcondition: if target is found in array, returns true; otherwise, returns false
    public static <T> boolean contains(T[] data, T target) {
        boolean found = false;

        for (int i = 0; i < data.length && !found; i++) {
            found = data[i].equals(target);
        }
        return found;
    }

    // linearSearch: search for an item in an array
    // precondition: data != null
    // postcondition: if target is found in array, returns its index; otherwise, returns -1
    public static <T extends Comparable<T>> int linearSearch(T[] data, T target) {
        int found = -1;

        for (int i = 0; i < data.length && (found == -1); i++) {
            if (data[i].equals(target)) {
                found = i;
            }
        }
        return found;
    }

    // binarySearch: search for an item in an array
    // precondition: array data is sorted
    // postcondition: if target is found in array, returns true; otherwise, returns false
    public static <T extends Comparable<T>> boolean binarySearchIT(T[] data, T target) {
        int low = 0, high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (data[mid].compareTo(target) == 0) {
                return true;
            } else if (data[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> int binarySearchR(T[] data, T target, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (data[mid].compareTo(target) < 0)
            return binarySearchR(data, target, mid + 1, high);
        else if (data[mid].compareTo(target) > 0)
            return binarySearchR(data, target, low, mid - 1);
        else
            return mid;
    }
}

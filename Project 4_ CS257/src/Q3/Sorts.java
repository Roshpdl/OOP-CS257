/**
 * Sorts.java - This program contains various sorting algorithms
 * Author - Dr.Stephen Carl
 * Modified by - Roshan Poudel
 * PROGRAMMING PROJECT 4, CS257, SPRING 2023
 * Date - 5/03/2023
 */

package Q3;

/**
 * Class containing various sorting algorithms.
 * Author - Dr.Stephen Carl
 * Modified by - Roshan Poudel
 * PROGRAMMING PROJECT 4, CS257, SPRING 2023
 * Date - 5/03/2023
 */


public final class Sorts<T extends Comparable<T>> {

    /**
     * Simple insertion sort.
     * @param data an array of comparable elements
     * @precondition data != null
     * @postcondition values in data sorted in non-decreasing order
     */
    public static <T extends Comparable<T>> void insertionSort(T[] data) {
        for( int i = 1; i < data.length; i++ ) {
            T tmp = data[i];
            int j;

            for(j = i; j > 0 && tmp.compareTo(data[j - 1]) < 0; j--)
                data[ j ] = data[ j - 1 ];
            data[ j ] = tmp;
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T data[], int n) {
        int numSorted = 1;  // number of values in place
        int index;      // general index
        while (numSorted < n) {
            // take the first unsorted value
            T temp = data[numSorted];
            // ...and insert it among the sorted:
            for (index = numSorted; index > 0; index--) {
                if (temp.compareTo(data[index-1]) < 0) {
                    data[index] = data[index-1];
                } else {
                    break;
                }
            }
            // reinsert value
            data[index] = temp;
            numSorted++;
        }
    }

    /**
     * Simple selection sort
     * @param data an array of comparable elements
     * @precondition 0 <= n <= data.length
     * @postcondition values in data[0..n-1] sorted in non-decreasing order
     */
    public static <T extends Comparable<T>> void selectionSort(T[] data) {
        int numUnsorted = data.length;
        int index;  // general index
        int max;    // index of largest value
        while (numUnsorted > 0) {
            // determine maximum value in array
            max = 0;
            for (index = 1; index < numUnsorted; index++) {
                if (data[max].compareTo(data[index]) < 0) max = index;
            }
            swap(data,max,numUnsorted-1);
            numUnsorted--;
        }
    }

    /**
     * Method to swap two elements in an array.
     * @param data an array of comparable elements
     * @param i the index of the first element
     * @param j the index of the second element
     * @precondition: 0 <= i,j < data.length
     * @postcondition: data[i] and data[j] are exchanged
     */
    public static <T> void swap(T[] data, int i, int j) {
        T temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}


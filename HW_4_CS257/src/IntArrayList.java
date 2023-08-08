/**
 * IntArrayList.java
 * @author Eric Roberts, modifications due to spc
 * Comments added by: Roshan Poudel
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntArrayList {

    /**
     *  Private constants
     */
    private static final int INITIAL_CAPACITY = 10;

    /**
     *  Private instance variables
     */
    private int[] array;
    private int capacity;
    private int count;

    /**
     * Creates a new IntArrayList object with the default capacity.
     *
     * @postcondition Creates a new IntArrayList object with the default capacity.
     */
    public IntArrayList() {
        capacity = INITIAL_CAPACITY;
        array = new int[capacity];
        count = 0;
    }

    /**
     * Returns the number of values in the list.
     *
     * @return the length of the list
     * @postcondition Returns the number of values in the list.
     */
    public int size() {
        return count;
    }

    /**
     * Adds a new value to the end of the list.
     *
     * @param value The new int value to add
     * @postcondition Adds a new value to the end of the list.
     */
    public void add(int value) {
        if (count == capacity) expandCapacity();
        array[count++] = value;
    }

    /**
     * Adds a new value to the list at the specified index.
     *
     * @precondition: 0 <= k <= size()
     * @param k The index at which the new value is to be inserted
     * @param value The new int value to add
     * @throws IndexOutOfBoundsException if k is less than 0 or greater than the size of the list
     * @postcondition Adds a new value to the list at the specified index.
     */
    public void add(int k, int value) {
        if (k < 0 || k > size()) {
            throw new IndexOutOfBoundsException("Index " + k + " out of bounds");
        }
        if (count == capacity) expandCapacity();
        for (int i = count; i > k; i--) {
            array[i] = array[i - 1];
        }
        array[k] = value;
        count++;
    }

    /**
     * Removes the value at the specified index from the list.
     *
     * @precondition: 0 <= k < size()
     * @param k The index of the value to remove
     * @throws IndexOutOfBoundsException if k is less than 0 or greater than or equal to the size of the list
     * @postcondition Removes the value at the specified index from the list.
     */
    public void remove(int k) {
        if (k < 0 || k >= size()) {
            throw new IndexOutOfBoundsException("Index " + k + " out of bounds");
        }
        for (int i = k + 1; i < count; i++) {
            array[i - 1] = array[i];
        }
        count--;
    }

    /**
     * Returns an element from the list at the specified index.
     *
     * @precondition: 0 <= k < size()
     * @throws IndexOutOfBoundsException if k is less than 0 or greater than or equal to the size of the list
     * @return The value at the specified index
     * @postcondition Returns an element from the list at the specified index.
     */
    public int get(int k) {
        if (k < 0 || k >= count) {
            throw new IndexOutOfBoundsException("index " + k + " out of bounds");
        }
        return array[k];
    }

    /**
     * Sets the value at the specified index.
     *
     * @precondition: 0 <= k < size()
     * @param k The index of the value to set
     * @param value The new value to set
     * @throws IndexOutOfBoundsException if k is less than 0 or greater than or equal to the size of the list
     * @postcondition Sets the value at the specified index.
     */
    public void set(int k, int value) {
        if (k < 0 || k >= count) {
            throw new IndexOutOfBoundsException("index " + k + " out of bounds");
        }
        array[k] = value;
    }

    /**
     * Returns true if the list is empty.
     *
     * @return true if the list is empty
     * @postcondition Returns true if the list is empty.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Removes all values from the list.
     *
     * @postcondition count is set to 0.
     */
    public void clear() {
        count = 0;
    }

    /**
     * Removes the first occurrence of the specified value from the list.
     *
     * @param value The value to remove
     * @postcondition Removes the first occurrence of the specified value from the list.
     */
    public void removeVal(int value) {
        remove(indexOf(value));
    }

    /**
     * Returns true if the list contains the specified value.
     *
     * @param value The value to search for
     * @return true if the list contains the specified value
     * @postcondition Returns true if the list contains the specified value.
     */
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    /**
     * Returns the index of the first occurrence of the specified value in the list.
     *
     * @param value The value to search for
     * @return The index of the first occurrence of the specified value in the list
     * @postcondition Returns the index of the first occurrence of the specified value in the list.
     */
    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    /**
     * Return the string representation of the list.
     *
     * @return The string representation of the list
     * @postcondition Returns the string representation of the list.
     */
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < count; i++) {
            if (i > 0) str += ", ";
            str += array[i];
        }
        return "[" + str + "]";
    }

    /**
     * Returns an iterator for this list.
     *
     * @return An iterator for this list
     * @postcondition an iterator for this list is returned.
     */
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    /**
     * Implementation notes: expandCapacity
     * ------------------------------------
     * This private method doubles the size of the array whenever the old one
     * runs out of space.  To do so, expandCapacity allocates a new array,
     * copies the old elements to the new array, and then replaces the old
     * array with the new one.
     *
     * @postcondition The size of the array is doubled.
     */
    private void expandCapacity() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    /**
     * Implements an iterator for the ArrayList class.
     */
    private class ArrayListIterator implements Iterator {

        /**
         * Constructs a new iterator for this ArrayList.
         *
         * @postcondition currentIndex is set to 0.
         */
        public ArrayListIterator() {
            currentIndex = 0;
        }

        /**
         * Returns true if there are more elements in the ArrayList
         */

        public boolean hasNext() {
            return currentIndex < count;
        }

        /**
         *  Returns the next element in the ArrayList and advances the index to the next element.
         *
         *  @return The next element in the ArrayList
         *  @throws NoSuchElementException if there are no more elements in the ArrayList.
         *  @postcondition Returns the next element in the ArrayList and advances the index to the next element.
         */

        public Object next() {
            throw new UnsupportedOperationException("remove not implemented");
        }

        /**
         *  Unsupported operation defined by Iterator but not implemented here
         *
         *  @throws UnsupportedOperationException if called.
         */

        public void remove() {
            throw new UnsupportedOperationException("remove not implemented");
        }

        /**
         *  Private instance variables
         *  --------------------------
         *  currentIndex -- The index of the current element
         */

        private int currentIndex;

    }

}
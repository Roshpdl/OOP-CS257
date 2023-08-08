/**
 * Test class for Sorts class
 * Author - Roshan Poudel
 * PROGRAMMING PROJECT 4, CS257, SPRING 2023
 * Date - 5/03/2023
 */

package Q4;

public class SortTest {
    public static void main(String[] args) {
        String[] strings = {"hello", "foo", "asap", "bar", "baz", "world", "qux", "xyzzy"};
        Quadratic[] quadratics = {new Quadratic(1, 2, 3), new Quadratic(2, 3, 4)};

        // Testing string array
        System.out.println("Before sorting:");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
        Sorts.insertionSort(strings);
        System.out.println("After sorting:");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // Testing Quadratic array - uncomment the line below to see the error
//        Sorts.insertionSort(quadratics);

    }
}


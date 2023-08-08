/**
 * Tester Class for Classes ArrayUtils and ArrayListUtils
 * CS 257 Object-Oriented Programming
 * @author Roshan Poudel
 * @date 2023-02-20
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilTester {

    public static void main(String[] args) {
        testOnStaticArrays();
        newline();
        System.out.println("Running tests on Dynamic arrays");
        newline();
        testOnArrayLists();
        System.out.println("Finished testing");
    }

    public static void newline() {
        System.out.println();
    }

    public static void testOnStaticArrays(){
        int[] array1 = {1, 2, 3, 4, 5, 6, 8, 9, 10, 35, 20, 15, 12, 11, 13, 14, 16, 17, 18, 19, 21, 22, 23};
        int[] array2 = new int[4];
        array2[0] = 5;
        array2[1] = 10;
        array2[2] = 15;

        System.out.println("Running tests on static arrays");

        System.out.println("Testing minVal");
        System.out.println("Your output: " + ArrayUtils.minVal(array1));
        System.out.println("Expected output: 1");
        newline();

        System.out.println("Testing maxVal");
        System.out.println("Your output: " + ArrayUtils.maxVal(array1));
        System.out.println("Expected output: 35");
        newline();

        System.out.println("Testing contains");
        System.out.println("Your output: " + ArrayUtils.contains(array1, 23));
        System.out.println("Expected output: true");
        newline();

        System.out.println("Testing sum");
        System.out.println("Your output: " + ArrayUtils.sum(array1));
        System.out.println("Expected output: 304");
        newline();

        System.out.println("Testing average");
        System.out.printf("Your output:%.2f\n" , ArrayUtils.average(array1));
        System.out.println("Expected output: 13.22");
        newline();

        System.out.println("Testing insertAtIndex");
        ArrayUtils.insertAtIndex(array2, 24, 2);
        System.out.println("Your output: " + Arrays.toString(array2));
        System.out.println("Expected output: [5, 10, 24, 15]");
        newline();

        System.out.println("Testing removeAtIndex");
        ArrayUtils.removeAtIndex(array2, 0);
        System.out.println("Your output: " + Arrays.toString(array2));
        System.out.println("Expected output: [10, 24, 15, 0]");
    }

    public static void testOnArrayLists(){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(6);
        array.add(9);
        array.add(12);

        System.out.println("Testing minVal");
        System.out.println("Your output: " + ArrayListUtils.minVal(array));
        System.out.println("Expected output: 3");
        newline();

        System.out.println("Testing maxVal");
        System.out.println("Your output: " + ArrayListUtils.maxVal(array));
        System.out.println("Expected output: 12");
        newline();

        System.out.println("Testing contains");
        System.out.println("Your output: " + ArrayListUtils.contains(array, 23));
        System.out.println("Expected output: false");
        newline();

        System.out.println("Testing sum");
        System.out.println("Your output: " + ArrayListUtils.sum(array));
        System.out.println("Expected output: 30");
        newline();

        System.out.println("Testing average");
        System.out.printf("Your output:%.2f\n" , ArrayListUtils.average(array));
        System.out.println("Expected output: 7.50");
        newline();

        System.out.println("Testing insertAtIndex");
        ArrayListUtils.insertAtIndex(array, 24, 2);
        System.out.println("Your output: " + array.toString());
        System.out.println("Expected output: [3, 6, 24, 12]");
        newline();

        System.out.println("Testing removeAtIndex");
        ArrayListUtils.removeAtIndex(array, 0);
        System.out.println("Your output: " + array.toString());
        System.out.println("Expected output: [6, 24, 12]");
    }
}

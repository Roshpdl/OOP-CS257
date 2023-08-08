/**
 * SortTest.java - This program tests the Sorting algorithms
 * Author - Dr.Stephen Carl
 * Modified by - Roshan Poudel
 * PROGRAMMING PROJECT 4, CS257, SPRING 2023
 * Date - 5/03/2023
 */

package Q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Provide the name of the file to read as a command-line argument");
            System.exit(1);
        }

        File file = new File(args[0]);
        int numWords = 0;

        try (Scanner scanner = new Scanner(file)) {
            numWords = scanner.nextInt();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(1);
        }

        String[] words = new String[numWords];

        try (Scanner scanner = new Scanner(file)) {
            scanner.nextLine(); // consume the first line with the number of words
            for (int i = 0; i < numWords; i++) {
                words[i] = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(1);
        }

        Sorts.selectionSort(words);
        System.out.println("Selection Sort: ");
        for (int i = 0; i < 500; i++) {
            System.out.print(words[i] + ", ");
        }

        System.out.println();
        Sorts.insertionSort(words);
        System.out.println("Insertion Sort: ");
        for (int i = 0; i < 500; i++) {
            System.out.print(words[i] + ",  ");
        }


    }
}

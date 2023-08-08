/**
 * SearchTest.java - This class tests the linear and binary search algorithms.
 * Author - Dr.Stephen Carl
 * Modified by - Roshan Poudel
 * PROGRAMMING PROJECT 4, CS257, SPRING 2023
 * Date - 5/03/2023
 */

package Q1_Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchTest {
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

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word to search for (or t to terminate): ");
            String word = input.nextLine();
            if (word.equals("t")) {
                break;
            }
            boolean found = false;
            int index = Searches.linearSearch(words, word);
            if (index != -1) {
                found = true;
            }
            System.out.println("linearSearch: " + word + " was " + (found ? "found" : "not found"));

            boolean binaryFound = Searches.binarySearchIT(words, word);
            System.out.println("binarySearch: " + word + " was " + (binaryFound ? "found" : "not found"));
        }
    }
}

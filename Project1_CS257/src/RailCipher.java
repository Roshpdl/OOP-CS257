/**
 * This program encodes and decodes a string using the rail cipher algorithm
 * CS 257 Object-Oriented Programming
 * @author Roshan Poudel
 * @date 2023-02-20
 */

import java.lang.String;
import java.util.Scanner;

public class RailCipher {
    public static void main(String[] args) {
        String contd = "yes";
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("What do you want to encode?");
            String toEncode = in.nextLine();
            String encoded = encode(toEncode);
            String decoded = decode(encoded);
            System.out.printf("Encoded Format: \n%s\n", encoded);
            System.out.printf("Decoded String: \n%s\n", decoded);
            System.out.println("Enter any key to continue, no to exit: ");
            contd = in.nextLine();
        }while (!contd.equals("no"));

    }

    /**
     * This method adds spaces to the string every given step
     * @param str the string to add spaces to
     * @param step the index to add a space at
     * @return the string with spaces added
     */
    public static String addSpacesIn(String str, int step){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);

            //add space after every __ step
            if ((i + 1) % step == 0 && i != str.length() - 1) {
                result += " ";
            }
        }
        return result;
    }

    /**
     * This method encodes the string using the rail cipher algorithm
     * @param str the string to encode
     * @return the encoded string
     */
    public static String encode(String str){
        //removing the spaces from the string
        String toEncode = str.replaceAll(" ", "");
        String encoded = "";

        //adding the even characters to the string
        for (int j = 0; j < toEncode.length(); j++){
            if (j % 2 == 0) {
                encoded += toEncode.charAt(j);
            }
        }

        //adding the odd characters to the string
        for (int j = 0; j < toEncode.length(); j++){
            if (j % 2 != 0) {
                encoded += toEncode.charAt(j);
            }
        }

        //adding spaces to the string
        encoded = addSpacesIn(encoded, 5);
        return encoded;
    }

    /**
     * This method decodes the string that was encoded using the rail cipher algorithm
     * @param encoded the string to decode
     * @return the decoded string
     */
    public static String decode(String encoded) {
        // removing the spaces from the string
        String toDecode = encoded.replaceAll(" ", "");

        int length = toDecode.length();
        int halfLength = length / 2;

        // add an extra character if length is odd
        if (length % 2 != 0) {
            halfLength++;
            toDecode += " ";
        }

        // adding the characters to the string in alternate positions
        String decoded = "";
        for (int i = 0; i < halfLength; i++) {
            decoded += toDecode.charAt(i);
            decoded += toDecode.charAt(halfLength + i);
        }

        return decoded;
    }
}

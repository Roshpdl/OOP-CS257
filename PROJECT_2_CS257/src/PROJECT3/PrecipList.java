
/**
 * PrecipList.java
 * @description This class is used to read a list of rainfall/snowfall data from a given file.
 * @author Roshan Poudel
 * @Course: CS 257, Spring 2023
 * @Project: Project 3
 * @Date: 04/13/2023
 */


package PROJECT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * PrecipList - reads a list of rainfall/snowfall totals from a given file.
 */
public class PrecipList {
    private double maxPrecip;
    private ArrayList<String> precip_list;

    /**
     * PrecipList constructor.
     * Initializes the PrecipList object with data from the default file path.
     * @postcondition the PrecipList object is initialized with data from the default file path
     */
    public PrecipList(){
        precip_list = getData("/Users/roshan/Documents/PROJECT_2_CS257/src/PROJECT3/precip.txt");
        maxPrecip = computeMax();
    }

    /**
     * Another constructor for PrecipList.
     * Initializes the PrecipList object with data from the specified file path.
     * @param filepath the file path to read data from
     * @postcondition the PrecipList object is initialized with data from the specified file path
     */
    public PrecipList(String filepath) {
        precip_list = getData(filepath);
        // call a helper to compute the max value
        maxPrecip = computeMax();
    }

    /**
     * Computes the maximum precipitation amount in the list.
     * @return the maximum precipitation amount
     * @postcondition the maximum precipitation amount is returned
     */
    private double computeMax() {
        double max = 0;
        for (String elmnt : precip_list) {
            String[] val = elmnt.split(" ");
            double value = Double.parseDouble(val[0]);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Gets the maximum precipitation amount.
     * @return the maximum precipitation amount
     * @postcondition the maximum precipitation amount is returned
     */
    public double getMaxPrecip() {
        return maxPrecip;
    }

    /**
     * Gets the list of recorded precipitation amounts.
     * @return an ArrayList containing recorded precipitation amounts
     * @postcondition the ArrayList is returned
     */
    public ArrayList<String> getList() {
        return precip_list;
    }

    /**
     * Reads the file and returns the ArrayList containing the file content.
     * @param filepath the file path to read data from
     * @return an ArrayList containing the lines in the file
     * @throws FileNotFoundException if the file is not found
     * @postcondition the file is read and the ArrayList is returned
     */
    public ArrayList<String> getData(String filepath) {
        ArrayList<String> data = new ArrayList<>();
        try (Scanner reader = new Scanner(new File(filepath))) {
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                data.add(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        return data;
    }
}

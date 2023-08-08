package PROJECT2;

/**
 *   PrecipList - reads and maintains a list of rainfall/snowfall totals
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PrecipList {
    private double maxPrecip;
    private ArrayList<Double> precip_list;

    /**
     *  PrecipList constructor
     */
    public PrecipList() {
        // read the data from a file, or failing that, use this fake random arraylist I made
        precip_list = new ArrayList<Double>();

        int size = (int) (Math.random()*200);
        for (int i = 0; i < size; i++) {
            // stuff a random precipitation value in the list
            precip_list.add(Math.random() * 12);
        }

        // call a helper to compute the max value
        maxPrecip = computeMax();
    }

    private double computeMax() {
        double max = 0;
        for (Double dl : precip_list) {
            double val = dl;
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    /**
     *  getMaxPrecip returns the largest precipitation amount
     */
    public double getMaxPrecip() {
        return maxPrecip;
    }

    /**
     *  getList returns an arraylist containing recorded precip amounts
     */
    public ArrayList<Double> getList() {
        return precip_list;
    }

}

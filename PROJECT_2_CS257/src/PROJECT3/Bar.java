/**
 * Bar.java
 * @description This class is used to create a bar object for the bar chart.
 * @author Roshan Poudel
 * @Course: CS 257, Spring 2023
 * @Project: Project 3
 * @Date: 04/13/2023
 */


package PROJECT3;

import java.awt.*;

/**
 * A bar of a bar chart.
 */
public class Bar {
    private String label1;
    private String label2;
    private double value;
    public static final int HEIGHT = 20;

    /**
     * Constructs a bar with a given label1 and value.
     *
     * @param date  the label1 for this bar
     * @param label the label2 for this bar
     * @param aValue the value of this bar
     * @postcondition this bar has the given label1, label2, and value
     */
    public Bar(String date, String label, double aValue) {
        label1 = date;
        label2 = label;
        value = aValue;
    }

    /**
     * Draws this bar.
     *
     * @param g     the Graphics object
     * @param y     the top of the bar
     * @param scale the horizontal scale factor for fitting the bar into the component
     * @precondition y must be positive and less than the height of the component
     * @postcondition the bar is drawn
     */
    public void draw(Graphics g, int y, double scale) {
        final int GAP = 2;
        g.setColor(Color.RED); // Set the color before drawing the bar
        g.fillRect(100, y, (int) (value * scale), HEIGHT);
        g.setColor(Color.WHITE);
        g.drawString(label1, GAP, y + HEIGHT - GAP);
        g.drawString(label2, 100, y + HEIGHT - GAP);
    }
}

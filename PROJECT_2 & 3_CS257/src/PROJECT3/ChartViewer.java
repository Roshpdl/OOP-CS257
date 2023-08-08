/**
 * ChartViewer.java
 * @description This class is used to create a frame for the bar chart.
 * @author Roshan Poudel
 * @Course: CS 257, Spring 2023
 * @Project: Project 3
 * @Date: 04/13/2023
 */

package PROJECT3;

import javax.swing.*;

/**
 This program displays a bar chart containing precipitation values data
 */
public class ChartViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new PrecipFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

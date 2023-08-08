/**
 * PrecipFrame.java
 * @description This class is used to create a frame for the bar chart.
 * @author Roshan Poudel
 * @Course: CS 257, Spring 2023
 * @Project: Project 3
 * @Date: 04/13/2023
 */

package PROJECT3;

import javax.swing.*;
import java.awt.*;

/**
 * A JFrame that displays a bar chart of precipitation data using ChartComponent.
 */
public class PrecipFrame extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    private static final int CHART_WIDTH = 500;
    private static final int CHART_HEIGHT = 500;

    private JLabel label;
    private JPanel panel;
    private ChartComponent chart;

    /**
     * Constructs a PrecipFrame object.
     */
    public PrecipFrame() {
        chart = new ChartComponent();
        chart.setPreferredSize(new Dimension(CHART_WIDTH, CHART_HEIGHT));
        chart.drawPrecip();

        createLabel();
        createPanel();

        this.setTitle("Precipitation Data");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLayout(new BorderLayout());
        this.setContentPane(panel);
        this.pack();
    }

    /**
     * Creates a label for the frame.
     */
    private void createLabel() {
        label = new JLabel("2016 Precipitation for Chattanooga TN"); // creating label with title Precipitation
        label.setBackground(Color.BLUE); // setting background color to blue
        label.setForeground(Color.WHITE); // setting text color to white
        label.setOpaque(true); // making label opaque
        label.setHorizontalAlignment(JLabel.CENTER); // setting label to center within panel (which is label's container)
        label.setVerticalAlignment(JLabel.TOP); // setting label to top within panel (which is label's container)
    }

    /**
     * Creates a panel for the frame.
     */
    private void createPanel() {
        panel = new JPanel(); // creating panel
        panel.setBackground(Color.BLACK); // setting background color to black
        panel.setLayout(new BorderLayout()); // setting panel's layout to BorderLayout
        panel.add(label, BorderLayout.NORTH); // adding label to panel's NORTH
        panel.add(chart, BorderLayout.CENTER); // adding chart to panel's CENTER
        this.add(panel); // adding panel to frame
    }
}

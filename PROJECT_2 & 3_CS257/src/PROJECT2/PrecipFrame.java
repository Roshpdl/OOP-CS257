/**
 * PrecipFrame.java
 * A frame that contains a chart component displaying precipitation data in Chattanooga TN for 2016.
 * @author:  Roshan Poudel
 * @version:  1.0
 * @since:  2023-04-05
 * @see:  ChartComponent.java, PrecipList.java, Bar.java, ChartViewer.java
 * @course:  CS 257, Spring 2023
 * @assignment:  Project 2
 */


package PROJECT2;

import javax.swing.*;
import java.awt.*;

public class PrecipFrame extends JFrame {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final int CHART_WIDTH = 400;
    private static final int CHART_HEIGHT = 400;

    private JLabel label;
    private JPanel panel;
    private ChartComponent chart;

    public PrecipFrame() {
        chart = new ChartComponent();
        chart.setPreferredSize(new Dimension(CHART_WIDTH, CHART_HEIGHT));
        chart.drawPrecip();

        createLabel();
        createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setContentPane(panel);
        this.pack();
    }

    private void createLabel() {
        label = new JLabel("2016 Precipitation for Chattanooga TN"); //creating label with title Precipitation
        label.setBackground(Color.BLUE); //setting background color to white
        label.setForeground(Color.WHITE); //setting text color to black
        label.setOpaque(true); //making label opaque
        label.setHorizontalAlignment(JLabel.CENTER); //setting label to center within panel (which is label's container)
        label.setVerticalAlignment(JLabel.TOP); //setting label to top within panel (which is label's container)
    }

    private void createPanel() {
        panel = new JPanel(); //creating panel
        panel.setBackground(Color.LIGHT_GRAY); //setting background color to Yellow
        panel.setLayout(new BorderLayout()); //setting panel's layout to BorderLayout
        panel.add(label, BorderLayout.NORTH); //adding label to panel's NORTH
        panel.add(chart, BorderLayout.CENTER); //adding chart to panel's CENTER
        this.add(panel); //adding panel to frame
    }
}

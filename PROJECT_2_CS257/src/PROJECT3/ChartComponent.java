/**
 * ChartComponent.java
 * @description This class is used to create a bar chart component.
 * @author Roshan Poudel
 * @Course: CS 257, Spring 2023
 * @Project: Project 3
 * @Date: 04/13/2023
 */

package PROJECT3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * A component that draws a bar chart.
 */
public class ChartComponent extends JComponent {
    private ArrayList<Bar> bars;
    private double maxValue;
    private PrecipList precipList;

    /**
     * Constructs an empty chart.
     */
    public ChartComponent() {
        bars = new ArrayList<Bar>();
        precipList = new PrecipList();
        maxValue = precipList.getMaxPrecip();
    }

    /**
     * Appends a bar to this chart.
     *
     * @param date  the date for the bar
     * @param label the label for the bar
     * @param value the value of the bar
     * @precondition label != null and value >= 0
     * @postcondition the bar is added to the end of the chart
     */
    public void append(String date, String label, double value) {
        bars.add(new Bar(date, label, value));
        repaint();
    }

    /**
     * Paints this component.
     *
     * @param g the Graphics object to paint
     * @postcondition the chart is drawn
     */
    @Override
    public void paintComponent(Graphics g) {
        final int GAP = 5;
        int y = GAP;
        double scale = this.getWidth() / maxValue;
        for (Bar b : bars) {
            b.draw(g, y, scale);
            y += Bar.HEIGHT + GAP;
        }
    }

    /**
     * Draws precipitation data on the chart.
     *
     * @postcondition precipitation data is added to the chart
     */
    public void drawPrecip() {
        ArrayList<String> list = precipList.getList();
        for (String str : list) {
            String[] valAndDate = str.split(" ");
            String date = valAndDate[1];
            double value = Double.parseDouble(valAndDate[0]);
            this.append(date + ":", String.format("Precipitation Amount: %.2f", value), value);
        }
    }
}

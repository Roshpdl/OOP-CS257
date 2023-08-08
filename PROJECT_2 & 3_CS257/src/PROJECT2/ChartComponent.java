package PROJECT2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * A component that draws a bar chart.
 */
public class ChartComponent extends JComponent
{
    private ArrayList<Bar> bars;
    private double maxValue;
    private PrecipList precipList;

    /**
     Constructs an empty chart.
     */
    public ChartComponent()
    {
        bars = new ArrayList<Bar>();
        precipList = new PrecipList();
        maxValue = precipList.getMaxPrecip();;
    }

    /**
     * Appends a bar to this chart.
     * @precondition label != null and value >= 0
     * @param label the label for the bar
     * @param value the value of the bar
     * @postcondition the bar is added to the end of the chart
     */
    public void append(String label, double value)
    {
        bars.add(new Bar(label, value));
//      if (value > maxValue) { maxValue = value; }
        repaint();
    }

    /**
     * Removes the last bar of this chart.
     * @precondition the chart is not empty
     * @postcondition the last bar is removed from the chart
     */
    public void removeLast()
    {
        int n = bars.size();
        if (n == 0) { return; }
        bars.remove(n - 1);
        repaint();
    }

    /**
     * Paints this component.
     * @param g the Graphics object to paint
     * @postcondition the chart is drawn
     */
    @Override
    public void paintComponent(Graphics g)
    {
        final int GAP = 5;
        int y = GAP;
        double scale = this.getWidth() / maxValue;
        for (Bar b : bars)
        {
            b.draw(g, y, scale);
            y += Bar.HEIGHT + GAP;
        }
    }

    public void drawPrecip() {
        ArrayList<Double> list = precipList.getList();
        for (Double aDouble : list) {
            append(String.format("Precipitation Amount: %.2f", aDouble), aDouble);
        }
    }
}
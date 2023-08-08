package PROJECT2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A frame that allows users to edit a bar chart.
 */
public class ChartFrame extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    private static final int CHART_WIDTH = 300;
    private static final int CHART_HEIGHT = 300;

    private static final String DEFAULT_LABEL = "Description";
    private static final double DEFAULT_VALUE = 100;

    private JTextField labelField;
    private JTextField valueField;
    private JButton addButton;
    private JButton removeButton;
    private ChartComponent chart;

    /**
     * Constructs a frame with a chart and buttons for adding and removing bars.
     */
    public ChartFrame()
    {
        chart = new ChartComponent();
        chart.setPreferredSize(new Dimension(CHART_WIDTH, CHART_HEIGHT));
        chart.append(DEFAULT_LABEL, DEFAULT_VALUE);

        createTextFields();
        createButtons();
        createPanel();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    /**
     * Creates the text fields for the label and value.
     */
    private void createTextFields()
    {
        final int LABEL_FIELD_WIDTH = 20;
        labelField = new JTextField(LABEL_FIELD_WIDTH);
        labelField.setText(DEFAULT_LABEL);
        final int VALUE_FIELD_WIDTH = 10;
        valueField = new JTextField(VALUE_FIELD_WIDTH);
        valueField.setText("" + DEFAULT_VALUE);
    }

    /**
     * Implements the ActionListener interface for the add button.
     */
    class AddBarListener implements ActionListener
    {
        /**
         * Adds a bar to the chart.
         * @param event the event that triggered the listener
         * @postcondition a bar is added to the chart
         */
        public void actionPerformed(ActionEvent event)
        {
            String label = labelField.getText();
            double value = Double.parseDouble(valueField.getText());
            chart.append(label, value);
        }
    }


    /**
     * Implements the ActionListener interface for the remove button.
     */
    class RemoveBarListener implements ActionListener
    {
        /**
         * Removes the last bar from the chart.
         * @param event the event that triggered the listener
         * @postcondition the last bar is removed from the chart
         */
        public void actionPerformed(ActionEvent event)
        {
            chart.removeLast();
        }
    }

//    //This functions similar to the above two classes
//    class Listener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent event) {
//            if(event.getSource() == addButton) {
//                String label = labelField.getText();
//                double value = Double.parseDouble(valueField.getText());
//                chart.append(label, value);
//            }else if (event.getSource() == removeButton) {
//                chart.removeLast();
//            }
//        }
//    }

    /**
     * Creates the buttons for adding and removing bars.
     */
    private void createButtons()
    {
        addButton = new JButton("Add");
        addButton.addActionListener(new AddBarListener());
//        addButton.addActionListener(new Listener());
        removeButton = new JButton("Remove last");
        removeButton.addActionListener(new RemoveBarListener());
//        removeButton.addActionListener(new Listener());
    }

    /**
     * Creates the panel with the text fields and buttons.
     */
    private void createPanel()
    {
        JPanel panel = new JPanel();
        panel.add(labelField);
        panel.add(valueField);
        panel.add(addButton);
        panel.add(removeButton);
        panel.add(chart);
        add(panel);
    }
}
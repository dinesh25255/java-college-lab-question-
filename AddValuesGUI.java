//lab-9

///create a gui having two text boxes one for value-1 and another for value-2 its also have button that add the both values 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddValuesGUI {
    private JFrame frame;
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JLabel resultLabel;

    public AddValuesGUI() {
        // Create JFrame
        frame = new JFrame("Add Values");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JPanel
        panel = new JPanel(new FlowLayout());

        // Create JLabels
        JLabel label1 = new JLabel("Value 1:");
        JLabel label2 = new JLabel("Value 2:");

        // Create JTextFields
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        // Create JButton
        addButton = new JButton("Add");

        // Create JLabel for result
        resultLabel = new JLabel("Result:");

        // Add components to JPanel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(addButton);
        panel.add(resultLabel);

        // Add JPanel to JFrame
        frame.add(panel);

        // Add ActionListener to JButton
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addValues();
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    private void addValues() {
        try {
            // Get input values from JTextFields
            int value1 = Integer.parseInt(textField1.getText());
            int value2 = Integer.parseInt(textField2.getText());

            // Perform addition
            int result = value1 + value2;

            // Update resultLabel with the result
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            // Handle case where input is not a valid integer
            resultLabel.setText("Result: Invalid input");
        }
    }

    public static void main(String[] args) {
        // Create and show GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AddValuesGUI();
            }
        });
    }
}

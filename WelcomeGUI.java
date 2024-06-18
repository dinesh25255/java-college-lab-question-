
//lab-9

//create a gui that displays "Welcome to java programming in the center of the window

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;

public class WelcomeGUI {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Welcome to Java Programming");

        // Create a JLabel to display the message
        JLabel label = new JLabel("Welcome to Java Programming");

        // Add the JLabel to the JFrame
        frame.add(label);

        // Set the size of the JFrame
        frame.setSize(300, 100); // Width, Height

        // Center the JFrame on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}

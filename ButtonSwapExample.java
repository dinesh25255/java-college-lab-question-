
//lab-9

//write a java program to display two buttons having name on its text.swap names when clicked


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSwapExample {
    private JFrame frame;
    private JButton button1;
    private JButton button2;

    public ButtonSwapExample() {
        frame = new JFrame("Button Swap Example");
        button1 = new JButton("dinesh");
        button2 = new JButton("Ramesh");

        // Set layout for the frame
        frame.setLayout(new FlowLayout());

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);

        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapButtonTexts();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapButtonTexts();
            }
        });

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    private void swapButtonTexts() {
        String temp = button1.getText();
        button1.setText(button2.getText());
        button2.setText(temp);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonSwapExample();
            }
        });
    }
}

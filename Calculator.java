//lab-9

///create a simple calculator display 0-9, +,-,/,=,clear and a result box


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JPanel panel;
    private JTextField resultField;

    public Calculator() {
        frame = new JFrame("Simple Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        resultField = new JTextField();
        resultField.setEditable(false);
        panel.add(resultField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "C":
                    resultField.setText("");
                    break;
                case "=":
                    try {
                        String expression = resultField.getText();
                        double result = evaluateExpression(expression);
                        resultField.setText(Double.toString(result));
                    } catch (NumberFormatException ex) {
                        resultField.setText("Error");
                    }
                    break;
                default:
                    resultField.setText(resultField.getText() + command);
                    break;
            }
        }

        private double evaluateExpression(String expression) {
            // Split the expression into operands and operator
            char operator = findOperator(expression);
            String[] operands = expression.split("\\" + operator);

            double operand1 = Double.parseDouble(operands[0]);
            double operand2 = Double.parseDouble(operands[1]);

            // Perform the operation based on operator
            switch (operator) {
                case '+':
                    return operand1 + operand2;
                case '-':
                    return operand1 - operand2;
                case '*':
                    return operand1 * operand2;
                case '/':
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return operand1 / operand2;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        private char findOperator(String expression) {
            // Find the operator in the expression
            for (char c : expression.toCharArray()) {
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    return c;
                }
            }
            throw new IllegalArgumentException("No operator found in expression");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator();
            }
        });
    }
}

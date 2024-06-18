

import java.util.Scanner;

//Qno 2


public class DivideByZeroExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Attempt to divide the numerator by the denominator
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the divide by zero exception
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling.");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

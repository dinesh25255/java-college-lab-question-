
//wap to read roll names of 5 students and write into file


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteStudentsToFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = null;

        try {
            // Create FileWriter object with append mode set to false (overwrite)
            writer = new FileWriter("students.txt", false);

            // Prompt user to enter roll numbers and names of 5 students
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter roll number for student " + i + ": ");
                int rollNumber = scanner.nextInt();
                scanner.nextLine(); // Consume newline character left by nextInt()

                System.out.print("Enter name for student " + i + ": ");
                String name = scanner.nextLine();

                // Write roll number and name to file
                writer.write("Roll Number: " + rollNumber + ", Name: " + name + "\n");
            }

            System.out.println("Data has been written to the file 'students.txt'.");
        } catch (IOException e) {
            // Handle IOException (e.g., file not found, permission denied)
            System.out.println("Exception caught: Unable to write to the file 'students.txt'.");
        } finally {
            // Close the FileWriter in the finally block to ensure it gets closed
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Exception caught while closing FileWriter.");
            }

            // Close scanner to prevent resource leak
            scanner.close();
        }
    }
}

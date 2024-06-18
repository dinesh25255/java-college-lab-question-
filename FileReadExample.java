/////wap to read content of file util '*' found


import java.io.File;



import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {

    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            // Initialize the scanner to read the file
            File file = new File("input.txt");
            scanner = new Scanner(file);

            // Read and print the content of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("Exception caught: The file 'input.txt' was not found.");
        } finally {
            // Ensure the scanner is closed to prevent resource leaks
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("This is the finally block. It always executes.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

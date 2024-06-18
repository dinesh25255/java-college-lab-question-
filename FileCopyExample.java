/// wap to copy the  content   of  one file to another 


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            // Initialize FileInputStream and FileOutputStream
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destinationFile);

            // Read bytes from source file and write to destination file
            int bytesRead;
            byte[] buffer = new byte[1024]; // Buffer size 1KB

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            // Handle IOException (e.g., file not found, permission denied)
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Close resources in the finally block
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Exception caught while closing resources: " + e.getMessage());
            }
        }
    }
}

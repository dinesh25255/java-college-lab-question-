import java.io.*;
 
public class Test {
    public static void main(String[] args)
    {
        File file
            = new File("C:\\Users\\Mayank\\Desktop\\1.txt");
 
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}

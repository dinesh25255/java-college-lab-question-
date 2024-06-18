import java.io.*;

class Demo implements Serializable {
    private static final long serialVersionUID = 1L;  // Add serialVersionUID
    public int a;
    public String b;

    // Default constructor
    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class Test {
    public static void main(String[] args) {
        Demo object = new Demo(1, "geeksforgeeks");
        String filename = "file.ser";

        // Serialization
        try (FileOutputStream file = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(file)) {
             
            // Method for serialization of object
            out.writeObject(object);
            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught: " + ex.getMessage());
        }

        Demo object1 = null;

        // Deserialization
        try (FileInputStream file = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(file)) {
             
            // Method for deserialization of object
            object1 = (Demo) in.readObject();
            System.out.println("Object has been deserialized");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);

        } catch (IOException ex) {
            System.out.println("IOException is caught: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught: " + ex.getMessage());
        }
    }
}

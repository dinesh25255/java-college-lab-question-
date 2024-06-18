
//lab-8

///create a random number in java and use it to display the position value of the array having (10 number) 




import java.util.Random;

public class RandomNumberArrayPosition {
    public static void main(String[] args) {
        // Create an array of 10 numbers
        int[] numbers = {15, 20, 35, 40, 55, 60, 75, 80, 95, 100};

        // Generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(10); // Generates a random number between 0 (inclusive) and 10 (exclusive)

        // Display the random number and its corresponding array value
        System.out.println("Random number: " + randomNumber);
        System.out.println("Value at position " + randomNumber + " in the array: " + numbers[randomNumber]);
    }
}

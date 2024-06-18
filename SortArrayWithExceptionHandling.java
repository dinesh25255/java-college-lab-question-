import java.util.Arrays;

//Qno 1

public class SortArrayWithExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 4, 1, 7, 6, 3, 10, 9};
        
        try {
            // Attempting to access an index out of bounds to demonstrate exception handling
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Accessing index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        
        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

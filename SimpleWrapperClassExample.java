// Qno 8

///write a java program to implement integer , double and boolean Wrapper class


import java.util.ArrayList;

public class SimpleWrapperClassExample {
    public static void main(String[] args) {
        // Create ArrayLists to hold wrapper objects
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<Boolean> booleanList = new ArrayList<>();

        // Adding elements to the lists
        intList.add(10); // Autoboxing
        intList.add(20); // Autoboxing
        doubleList.add(10.5); // Autoboxing
        doubleList.add(20.5); // Autoboxing
        booleanList.add(true); // Autoboxing
        booleanList.add(false); // Autoboxing

        // Retrieving and printing elements from the lists
        System.out.println("Integer List:");
        for (Integer integer : intList) {
            System.out.println(integer);
        }

        System.out.println("\nDouble List:");
        for (Double doubleValue : doubleList) {
            System.out.println(doubleValue);
        }

        System.out.println("\nBoolean List:");
        for (Boolean bool : booleanList) {
            System.out.println(bool);
        }

        // Additional operations
        // Summing integers
        int sum = 0;
        for (Integer integer : intList) {
            sum += integer; // Unboxing
        }
        System.out.println("\nSum of integers: " + sum);

        // Averaging doubles
        double sumDoubles = 0;
        for (Double doubleValue : doubleList) {
            sumDoubles += doubleValue; // Unboxing
        }
        double average = sumDoubles / doubleList.size();
        System.out.println("Average of doubles: " + average);

        // Counting true values
        int trueCount = 0;
        for (Boolean bool : booleanList) {
            if (bool) { // Unboxing
                trueCount++;
            }
        }
        System.out.println("Count of true values: " + trueCount);
    }
}

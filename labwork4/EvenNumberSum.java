package labwork4;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumberSum {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40));

        // Calculate the sum of even numbers
        int sumOfEvens = calculateSumOfEvens(numbers);

        // Print the result
        System.out.println("The sum of all even numbers is: " + sumOfEvens);
    }

    /**
     * Method to calculate the sum of even numbers in an ArrayList.
     *
     * @param numbers the ArrayList of integers
     * @return the sum of even numbers
     */
    public static int calculateSumOfEvens(ArrayList<Integer> numbers) {
        int sum = 0;

        // Iterate through the list and add even numbers
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number;
            }
        }

        return sum;
    }
}

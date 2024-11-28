package labwork6;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, String> map = new HashMap<>();
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user how many key-value pairs they want to input
        System.out.print("How many key-value pairs would you like to add? ");
        int numberOfEntries = scanner.nextInt();  
        scanner.nextLine();  
        
        // Loop to add key-value pairs to the HashMap
        for (int i = 0; i < numberOfEntries; i++) {
            
            System.out.print("Enter key " + (i + 1) + ": ");
            String key = scanner.nextLine();
            System.out.print("Enter value for " + key + ": ");
            String value = scanner.nextLine();
            map.put(key, value);
        }
        
        // Display the HashMap after the user input
        System.out.println("\nYour HashMap entries:");
        System.out.println(map);

        // Access a specific value using a key
        System.out.print("\nEnter a key to get its value: ");
        String keyToGet = scanner.nextLine();
        String value = map.get(keyToGet);
        
        if (value != null) {
            System.out.println("The value for '" + keyToGet + "' is: " + value);
        } else {
            System.out.println("Key '" + keyToGet + "' does not exist in the map.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

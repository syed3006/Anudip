package labwork6;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCheckEmpty {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, String> map = new HashMap<>();
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Check if the HashMap is empty initially
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Ask the user if they want to add key-value pairs
        System.out.print("Do you want to add key-value pairs to the HashMap? (yes/no): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
          
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
        }

        // Check if the HashMap is empty after adding the entries
        if (map.isEmpty()) {
            System.out.println("The HashMap is still empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Close the scanner
        scanner.close();
    }
}


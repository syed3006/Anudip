package labwork6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScore {
    public static void main(String[] args) {
        // Create a Map (LinkedHashMap to maintain insertion order) to store cricketer name and their scores
        Map<String, Integer> cricketerScores = new LinkedHashMap<>();
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Adding some cricketers and their scores to the map initially
        cricketerScores.put("Sachin Tendulkar", 100);
        cricketerScores.put("Virat Kohli", 80);
        cricketerScores.put("Rohit Sharma", 75);
        cricketerScores.put("Dhoni", 50);
        cricketerScores.put("Shikhar Dhawan", 60);

        // Loop for multiple operations
        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Search for a cricketer's score");
            System.out.println("2. Add or update a cricketer's score");
            System.out.println("3. Display all cricketers' scores");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character

            switch (choice) {
                case 1:
                    // Search for a cricketer's score
                    System.out.print("\nEnter the cricketer's name to search for their score: ");
                    String batsmanName = scanner.nextLine().trim();
                    
                    if (batsmanName.isEmpty()) {
                        System.out.println("Please enter a valid name.");
                        break;
                    }

                    if (cricketerScores.containsKey(batsmanName)) {
                        // Retrieve and display the score for the cricketer
                        int score = cricketerScores.get(batsmanName);
                        System.out.println(batsmanName + "'s score is: " + score);
                    } else {
                        System.out.println("Cricketer not found.");
                    }
                    break;

                case 2:
                    // Add or update a cricketer's score
                    System.out.print("\nEnter the cricketer's name: ");
                    String name = scanner.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("Please enter a valid name.");
                        break;
                    }

                    System.out.print("Enter the score for " + name + ": ");
                    int score = scanner.nextInt();
                    scanner.nextLine();  // Consume the leftover newline character

                    // Add or update the cricketer's score in the map
                    cricketerScores.put(name, score);
                    System.out.println(name + "'s score has been added/updated.");
                    break;

                case 3:
                    // Display all cricketers' scores
                    System.out.println("\nAll Cricketer Scores:");
                    for (Map.Entry<String, Integer> entry : cricketerScores.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }
}

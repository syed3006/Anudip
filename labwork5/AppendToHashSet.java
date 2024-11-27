package labwork5;

import java.util.HashSet;
import java.util.Scanner;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Initialize the HashSet with some elements
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Display the initial HashSet
        System.out.println("Initial HashSet: " + hashSet);

        // Ask the user for an element to add
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an element to append to the HashSet: ");
        String newElement = scanner.nextLine();

        // Check if the element already exists
        if (hashSet.contains(newElement)) {
            System.out.println("Element '" + newElement + "' is already in the HashSet.");
        } else {
            // Append the new element
            hashSet.add(newElement);
            System.out.println("Element '" + newElement + "' has been added.");
        }

        // Display the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);

        // Add an additional demonstration of iteration
        System.out.println("Iterating over HashSet elements:");
        for (String element : hashSet) {
            System.out.println("- " + element);
        }

        scanner.close();
    }
}

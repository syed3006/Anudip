package labwork4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Example list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");

        // Print the original list
        System.out.println("Original List: " + stringList);

        // Reverse the list
        Collections.reverse(stringList);

        // Print the reversed list
        System.out.println("Reversed List: " + stringList);
    }
}
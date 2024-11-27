package labwork5;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Declare a stack
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements onto the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the stack after adding elements
        System.out.println("Stack after pushing 10 elements: " + stack);

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            int removedElement = stack.pop();
            System.out.println("Removed element: " + removedElement);
        }

        // Display the stack after removing elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}

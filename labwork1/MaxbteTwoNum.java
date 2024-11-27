package labwork1;

import java.util.Scanner;

public class MaxbteTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

       if (num1 == num2) {
            System.out.println("Both are equal numbers try with any other numbers .");
        } else {
            int max = (num1 > num2) ? num1 : num2;
            System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);
        }
    }
}
package labwork3;
import java.util.Scanner;

class VotingException extends Exception {
    public VotingException(String message) {
        super(message);
    }
}

public class VotingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new VotingException("Age must be 18 or older to vote.");
            }
            System.out.println("You are eligible to vote.");
        } catch (VotingException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
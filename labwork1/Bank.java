package labwork1;


import java.util.Scanner;
public class Bank {// This is the class 

    private double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient balance";
        System.out.println(message);
        amount = (withdrawalAmount <= amount) ? amount - withdrawalAmount : amount;
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	while(true) {
    	System.out.println("Enter initial Balance: ");
    	double initialBalance = scan.nextDouble();
    	Bank myAccount = new Bank(initialBalance);
    	
    	System.out.println("Enter the withdrowlAmt: ");
    	double withdrawalAmount = scan.nextDouble();
    	myAccount.withdraw(withdrawalAmount);
    	
    	System.out.println("Enter the depositeAmt: ");
    	double depositAmount = scan.nextDouble();
    	myAccount.deposit(depositAmount);
    	
    	myAccount.displayBalance();
    	System.out.println("do you want to continue this program (yes/no): ");
    	String	response = scan.next();
    	
    	if (!response.equalsIgnoreCase("yes")) {
    		System.out.println("Exiting the program.");
    		 break;
    	}
    	  
    }
        scan.close(); 
    
    }
}
    	
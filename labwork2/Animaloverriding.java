package labwork2;

class Animal {


	 public void makeSound() {
	     System.out.println("The animal makes a sound.");
	 }
	}


	class Dog extends Animal {


	 @Override
	 public void makeSound() {
	     System.out.println("The dog barks.");
	 }
	}


	class Cat extends Animal {


	 @Override
	 public void makeSound() {
	     System.out.println("The cat meows.");
	 }
	}

	public class Animaloverriding {
	 public static void main(String[] args) {
	   
	     Animal myAnimal = new Animal(); 
	     Animal myDog = new Dog(); 
	     Animal myCat = new Cat(); 

	    
	     System.out.println("Using Animal class object:");
	     myAnimal.makeSound(); 

	     System.out.println("\nUsing Dog class object:");
	     myDog.makeSound(); 

	     System.out.println("\nUsing Cat class object:");
	     myCat.makeSound();
	 }
	}
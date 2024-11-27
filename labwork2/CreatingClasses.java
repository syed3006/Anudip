package labwork2;

abstract class Vaccine {
	 int age;
	 String nationality;

	 
	 public Vaccine(int age, String nationality) {
	     this.age = age;
	     this.nationality = nationality;
	 }


	 public void firstDose() {
	     if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
	         System.out.println("Eligible for first dose.");
	         System.out.println("Amount to be paid: 250 Rs.");
	     } else {
	         System.out.println("Not eligible for the first dose.");
	     }
	 }


	 public void secondDose(boolean firstDoseCompleted) {
	     if (firstDoseCompleted) {
	         System.out.println("Eligible for second dose.");
	     } else {
	         System.out.println("You must complete the first dose before taking the second dose.");
	     }
	 }


	 public abstract void boosterDose();
	}


	class VaccinationSuccessful extends Vaccine {

	 
	 public VaccinationSuccessful(int age, String nationality) {
	     super(age, nationality);
	 }

	 
	 @Override
	 public void boosterDose() {
	     if (age >= 18) {
	         System.out.println("Eligible for booster dose.");
	     } else {
	         System.out.println("Not eligible for booster dose.");
	     }
	 }
	}


	public class CreatingClasses {
	 public static void main(String[] args) {
	     
	     VaccinationSuccessful user = new VaccinationSuccessful(25, "Indian");

	     
	     user.firstDose(); 

	     
	     boolean firstDoseCompleted = true; 
	     user.secondDose(firstDoseCompleted);

	     
	     user.boosterDose(); 
	 }
	}

package labwork3;
import java.util.Scanner;

class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ErrorExceptiion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        
        try {
            for (int i = 0; i < 12; i++) {
                System.out.print("Enter name of student " + (i + 1) + ": ");
                String name = sc.nextLine();
                System.out.print("Enter age of student " + (i + 1) + ": ");
                int age = sc.nextInt();
                sc.nextLine();
                students[i] = new Student(name, age);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
        sc.close();
    }
}

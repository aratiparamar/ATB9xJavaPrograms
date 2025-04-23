package Oct.ex_18102024_Ifcondition_Switch;

import java.util.Scanner;

public class Lab075_HackerrankQ2 {
    public static void main(String[] args) {
        //Triangle Classifier:
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the length of the sides, determine
        // side 1, side 2 , side 2-> eq, iso, scalene
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of Side 1");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the length of Side 2");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the length of Side 3");
        double side3 = scanner.nextDouble();

        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("Invalid input: Side length must be positive");
        }
        else if (side1==side2 && side2==side3 && side1==side3) {
            System.out.println("The triangle is equilateral.");
        }
        else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("The triangle is isosceles.");
        }
        else{
            System.out.println("The triangle is scalene");
        }
        scanner.close();
    }
}

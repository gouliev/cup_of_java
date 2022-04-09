package Practical_2; // Package of Practical #2

import java.util.Scanner;  // Importing the scanner class to get user input
public class Question_1 { // First question in practical 2

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Creating a scanner object/input
		System.out.print("Enter 1st side of a triangle please: ");
		double first_side = input.nextDouble(); // First input
		System.out.print("Enter 2nd side of a triangle please: ");
		double second_side = input.nextDouble(); // Second input
		System.out.print("Enter 3st side of a triangle please: ");
		double third_side = input.nextDouble(); // Third input
		double perimeterOfTriangle = first_side + second_side + third_side; // Perimeter of a triangle is (P = a + b + c)
		
		if (first_side + second_side > third_side && first_side + third_side > second_side && second_side + third_side > first_side)
			// If condition to  calculate if ∑2s > ∑1s (sum of 2 sides greater than 1 side)
			System.out.println("This is a valid input, the perimeter is: " + perimeterOfTriangle); // Perimeter
		else
			System.out.println("This is not a valid input, please try again!"); // Error handling, displaying error message
		System.exit(0); // Terminate's the JVM
	}

}
package Practical_2;  // Package of Practical #2

import java.util.Scanner;  // Importing the scanner class to get user input

public class Question_2 {  // Second question in practical 2

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Creating a scanner object/input
		
		System.out.print("Enter the length from the center of a pentagon to a vertex: "); // Display message for input
		
		double userLength = input.nextDouble(); // User's input
		double lengthOfSide = (2 * userLength) * Math.sin(Math.PI / 5); // Length of a side (given in question)
		double areaofPentagon = (5 * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / 5)); // Area of a pentagon (given in question)
		
		if(userLength < 0.0) // If condition to insure user integer input is not less than 0
		    System.out.println("Input needs to be a positive integer! Try again!");
		else // Continue to calculation if passes condition (< 0.0
			System.out.println("The area of the pentagon is: " + areaofPentagon); // Result

	}

}

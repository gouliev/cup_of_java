package Practical_2;  // Package of Practical #2

import java.util.Scanner;  // Importing the scanner class to get user input

public class Question_3 {  // Third question in practical 2

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Creating a scanner object/input
		
		System.out.print("Enter a number for speed: "); // Display message for input
		double v = input.nextDouble(); // Speed
		System.out.print("Enter a number for acceleration: "); // Display message for input
		double a = input.nextDouble(); // Acceleration
		System.out.print("Enter a character: "); // Display message for input
		char ch = input.next().charAt(0); // Wet or Dry
		
		
		if (ch == 'w' || ch == 'W') // If condition to increment 15%
	        { 
			double runwayLengthWet = (v * v) / (2 * a) * 1.15;
			System.out.println(runwayLengthWet); }
		
		else if (ch == 'd' || ch == 'D') // 
		{ 
			double runwayLengthDry = (v * v) / (2 * a);
			System.out.println(runwayLengthDry); // Result 
			}
		else 
			System.out.println("Incorrect character given!");

	}
}

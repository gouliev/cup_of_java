package P3;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // Create a scanner object from scanner class

		System.out.print("Please enter first string: "); // Ask for first input
		String firstString = input.nextLine(); // Read first input

		System.out.print("Please enter second string: "); // Ask for second input
		String secondString = input.nextLine(); // Read second input

		int minSize; // Assigning it as an initialization (short method temp)

		if (firstString.length() > secondString.length()) { // If string is bigger, assign it to the second
		minSize = secondString.length(); 
		// Update if passes condition. Second string is the one which contains a minimum size
		}
		else {
		minSize = firstString.length(); // Else assign min to first string.lenght (its length)
		}
		boolean isContainsSuffix = false; // If it contains suffix
		//for(initializing a variable; conditional statement; arithmetic operation on variable)
		for (int i = 1; i <= minSize; i++ ) {
			if (firstString.charAt(firstString.length()-i) == secondString.charAt(secondString.length()-i))
			{ // Reverse order
				isContainsSuffix = true; // Boolean 
				System.out.print(firstString.charAt(firstString.length()-i));
			}
			else {
				break;
			}	
		}
		if (!isContainsSuffix) { // ! means NOT (logical operator)
			System.out.println("no common suffix"); // Display message
		}
		
	}
	
}

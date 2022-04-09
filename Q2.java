package P3;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner readInput = new Scanner(System.in);
		System.out.print("Please enter a string to reverse it: ");
		
		String string = readInput.nextLine();
		String reversedString = "";
		for (int i = string.length() -1; i >= 0; i--) { // Algorithm to reverse our strings
			reversedString += string.charAt(i);
		}	
		System.out.println(reversedString);
	}

}

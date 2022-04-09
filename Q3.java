package P3;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner readInput = new Scanner(System.in);
		System.out.print("Please input a string: ");
		
		String string = readInput.nextLine();
		String cypheredString = ""; // Initializing the variable (no value)
		for (int i = 0; i < string.length(); i++) // For loop, loop each character of our string, from left to right
		{
			if (string.charAt(i) >= 98 && string.charAt(i) <= 122)
			//Ascii digits 98 - 122
			{	char c = (char)(string.charAt(i) -1); // Type casting
				cypheredString += c;
				continue;
				// Adding previous character to cypheredString (augmented addition)
				// E.g. if the word is Java (index 0 = J)
				// The ascii code of J would be 106, so -1 would be 105
				// This means 106 - 1 would be an 105 which is i
			}
			if (string.charAt(i) == 97)
			{
				cypheredString += 'z';
				continue;
			}
		cypheredString += string.charAt(i);
		}
		System.out.print("The cyphered string is: " + cypheredString);
		
	}

}

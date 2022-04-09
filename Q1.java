package P3;

import java.util.*; // Imports all packages needed

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		
		String word = readInput.next(); 
		
		int vowels = 0, consonants = 0;
		for (int i = 0; i < word.length(); i++) // For loop for each char
		{
			char c = word.charAt(i);
			if (c == 'a' || c == 'A') {
				vowels ++;
				continue;
			}
			if (c == 'e' || c == 'E') {
				vowels ++;
				continue;
			}
			
			if (c == 'i' || c == 'I') {
				vowels ++;
				continue;
			}
			if (c == 'o' || c == 'O') {
				vowels ++;
				continue;
			}
			
			if (c == 'u' || c == 'U') {
				vowels ++;
				continue;
			}
		}
		
		consonants = word.length() - vowels;

		System.out.println("Total number of vowels is " + vowels);
		System.out.println("Total number of consonants is " + consonants);
	}
}

package p5;
import java.util.*;

public class q5 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] words = new String[]{"hello", "world", "cat", "dog", "mouse", "rabbit"}; // Words selected by me, can be changed
		while(true) {
			int index = (int) (Math.random()*words.length); // Random generator of the words
			String wordToGuess = words[index]; 
			char [] currentWord = new char[wordToGuess.length()];
			
			for(int i = 0; i < wordToGuess.length(); i++) {
				currentWord[i] = '*';
			}
			int wrongGuess = 0;
			while(! String.valueOf(currentWord).equals(wordToGuess)) {
				System.out.print("Guess a letter [" + String.valueOf(currentWord) + "] > ");
				String inputString = input.next().toLowerCase();
				char c = inputString.charAt(0);
				boolean isCorrectGuess = false;
				
				for(int i = 0; i < currentWord.length; i++) {
					if(currentWord[i] == '*') {
						if(wordToGuess.charAt(i) == c) {
							currentWord[i] = c;
							isCorrectGuess = true;
						}
					}else {
						if(currentWord[i] == c) { // Check if word preexists
							System.out.println("\t" +c + " is already in the word.");
							isCorrectGuess = true;
							break;
						}
					}
				}
				if(!isCorrectGuess) {
					System.out.println("\t" + c + " is not in the word."); // Check if word in correctGuess
					wrongGuess++;
				}
				
			}
			
			
			System.out.print("\n\tYou Win! The word is [" + String.valueOf(currentWord) + "]."); 
			System.out.println (" You missed " + wrongGuess + " times.\n");
			
			System.out.print("Enter 'y' to play again or any other character to exit > " );
			String answer = input.next();
			if(!answer.equalsIgnoreCase("y")) {
				break;
			}
		}
		
		System.out.println("Thank you for playing!");
		
		

	}
	


}

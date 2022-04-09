package P3;
import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generate a random number (this number the user has to guess)
		int randNum = (int) (Math.random() * 101); // Type-casting (convert our double to int)

		Scanner input = new Scanner(System.in); // Scanner input
		System.out.println("Guess a number from 0-100."); // Display message
		
		while (true) { // While statement which allows for continuous loop of question
			System.out.print("Enter a number: " );
			int guessNum = input.nextInt();
			
			if (guessNum == randNum) {
				System.out.println("Success! Well done!"); // Passed condition and guessed correct
				break;
			}
			else if (guessNum > randNum) {
				System.out.println("Too high"); // Too high
			}
			else {
				System.out.println("Too low"); // Too low
			}

		}
	}

}

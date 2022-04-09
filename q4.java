package p5;
import java.util.*;
public class q4 {


	public static void main(String[] args) {
		System.out.println("Enter the value of n: " );
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		double [] [] array = new double[n][n]; // 2 arrays
		
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < n; c++) {
				array[r][c] = Math.random();
			}
		}
		
		boolean isPosMarkovMatrix = isMarkovMatrix(array); // Positive Markov Matrix
		
		if(isPosMarkovMatrix) {
			System.out.println("Yes, it is a positive Markov Matrix.");
		}else {
			System.out.println("No, it is not a Markov Matrix.");
		}
		
		System.out.println("Printing our Matrix:"); // Print entire matrix
		
		int i = 0;
		for(double [] row: array) { // Simple for loop to show all arrays for user to see
			System.out.print("Row# " + i + ": ");
			System.out.println(Arrays.toString(row));
			i++;
		}
		
	}
	
	public static boolean isMarkovMatrix(double [][] m) { // Method to determine if it is a markov chain
		for(int c = 0; c < m.length; c++) {
			double sumOfColumn = 0;
			for(int r = 0; r < m.length; r++) {
				sumOfColumn += m[r][c];
			}
			if(sumOfColumn != 1) {
				return false;
			}
		}
		return true;
	}

}

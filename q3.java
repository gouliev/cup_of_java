package p5;
import java.util.Arrays;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input number of rows: " );
		int totalRows = input.nextInt();
		
		System.out.print("Please input number of columns: ");
		int totalColumns = input.nextInt();
		
		double[][] array = new double[totalRows][totalColumns];
		
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[0].length; c++) {
				double randomValue =  Math.random() * 10;
				array[r][c] = (randomValue*10)/10; // Decimal places

			}
		}
		
		int [] locationOfMaxValue = getMaxIndicies(array);
		
		System.out.println("Maximum element is: " + array[locationOfMaxValue[0]] [locationOfMaxValue[1]]);
		System.out.println("Row Number of Max Value: " + locationOfMaxValue[0]);
		System.out.println("Column Number of Max Value: " + locationOfMaxValue[1]);
		System.out.println("Printing Array");
		for(double [] arr: array) { // Printing all arrays
			System.out.println(Arrays.toString(arr));
		}
	}
	
	
	public static int[] getMaxIndicies(double[][] arr) { // arr = method argument
		
		double currentMaximumValue = -1; // Always starts with the minimum value so that it could be updated when traversing our array
		int rowOfMaximumValue = -1; // // These are just indexes representing the location of our maximum value
		int columnOfMaximumValue = -1; // These are just indexes representing the location of our maximum value
				// There is no index to be represented with -1, so that is why we are starting with -1 so that it can be updated
		
		for (int r = 0; r < arr.length; r++) // These nested loops will iterate over each element of our array
		{
			for (int c = 0; c < arr[0].length; c++) {
				
				if (currentMaximumValue < arr[r][c]) {
					
					currentMaximumValue = arr[r][c];
					rowOfMaximumValue = r;
					columnOfMaximumValue = c;
					
				}
			}	
			
		}
		
		int [] locationOfMaximumValue = new int[2]; // Creating an array of size 2 because we are storing the row and column of our maximum value
		locationOfMaximumValue[0] = rowOfMaximumValue;
		locationOfMaximumValue[1] = columnOfMaximumValue;
		return locationOfMaximumValue;
		
		
		
		
	}
	
	
}


package p5;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); // Scanner
		
		System.out.print("Enter the size of the array: ");
		int [] arr = new int[input.nextInt()];
		
		System.out.print("Enter the elements of the array (seperated by a space): ");
		
		for (int i = 0; i < arr.length; i++) // Defining our loop
		{
			arr[i] = input.nextInt(); 
		}
		boolean result = isConsecutiveFour(arr);
		if (result == true) {
			System.out.println("Yes. Contains four consecutive SAME integers");
		} else 
		{
			System.out.println("No. Does not contain four consecutive SAME integers");
		}
		System.out.println(Arrays.toString(arr)); // Arrays is a class name (capital)
	}

	public static boolean isConsecutiveFour(int[] values) // Method signature
	{
		int currentValue = values[0]; // Storing first value of array inside variable currentValue
		int currentStreak = 1; // When value appears for first time, the currentStreak variable will be one
		// and if the same value appears consecutively, then increment currentStreak variable by 1
		for (int i = 1; i < values.length; i++) // Our for loop will iterate from 1 to array.length - 1 (inclusively)
		{ 
			if (values[i] == currentValue) { // If the upcoming value is also the same as currentValue variable
				
				currentStreak ++; // Increment currentStreak by 1 as there is another same consecutive integer
				
				if (currentStreak == 4) { // If the number of consecutive integers is four
					
					return true; // Return true as four consecutive same integers are found
				}	
			}
			else { // If the upcoming value is not the same as the currentValue variable
				currentValue = values[i]; // Update current value variable to the new value as we are going to check for same consecutive integers to this value
				currentStreak = 1; // Initially when value appears for first time then its streak would be 1
			}
			
		}
		return false; // As there are no four same consecutive elements found, returning false
	
		
	
		
	}

}

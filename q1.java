package p5;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // Create scanner input
		System.out.print("Please input the size of array: "); //Ask user

		int[] arr = new int[input.nextInt()]; // Initializing our array

		System.out.print("Please enter the array elements seperated by a space: ");
		int index = 0; // Set to 0
		while (index < arr.length){ // As long as we have an input and index less than array length
			arr[index] = input.nextInt(); // Storing it inside our array at index position
			index ++; // Increment
		}
		boolean result = isSorted(arr);
		if (result == true ) {
			System.out.println("The following array IS SORTED");
		} else {
			
			System.out.println("The following array IS NOT SORTED");
		}
		System.out.println(Arrays.toString(arr)); // Library class array (passing array)
	}

	public static boolean isSorted(int[] arr) { // Creating method isSoorted
		
		for (int i = 1; i < arr.length; i++) {  
			if (arr[i] < arr[i-1])
				return false;
		} 
		
		/*for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i] > arr[i+1]) {
				
				return false;
			}
			
		}*/
			
		return true;
	}
}

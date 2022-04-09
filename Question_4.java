package Practical_2;

import java.util.Scanner;  // Importing the scanner class to get user input

public class Question_4 { // Question 4

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in); // Scanner input
	
	System.out.print("Enter a year: "); // Message input
	int givenYear = input.nextInt(); // Variable for year input
	
	switch (givenYear % 12) { // Switch cases for each of the 12 animal years
	  case 0:
		 System.out.print(givenYear + " is a Monkey"); // Year input + the given animal year
	    break; // Break statements
	  case 1: 
		 System.out.print(givenYear + " is a Rooster");
	    break;
	  case 2:
			 System.out.print(givenYear + " is a Dog");
		    break;
	  case 3: 
			 System.out.print(givenYear + " is a Pig");
		    break;  
	  case 4: 
			 System.out.print(givenYear + " is a Rat");
		    break;      
	  case 5: 
			 System.out.print(givenYear + " is a Ox");
		    break;      
	  case 6: 
			 System.out.print(givenYear + " is a Tiger");
		    break;  	    
	  case 7: 
			 System.out.print(givenYear + " is a Rabbit");
		    break;  
	  case 8: 
			 System.out.print(givenYear + " is a Dragon");
		    break; 
	  case 9: 
			 System.out.print(givenYear + " is a Snake");
		    break;      
	  case 10: 
			 System.out.print(givenYear + " is a Horse");
		    break;  	   
	  case 11: 
			 System.out.print(givenYear + " is a Sheep");
		    break;  // No default given
	}

	}
	
	}
package Practical_2; // Practical 2

import java.util.Scanner;  // Importing the scanner class to get user input

public class Question_5 { // Q5 in P2
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner class

		System.out.print("Enter the month as integer: "); // Give a month
		int givenMonth = input.nextInt(); // Take input
		System.out.print("Enter the year as integer: "); // Give a year
		int givenYear = input.nextInt(); // Take year

		boolean leapYear = // Condition for a leap year (Similar in python)
			(givenYear%4 ==0 && givenYear%100 !=0) || (givenYear%400 ==0); // If condition passes for leap year
		switch (givenMonth) // Continue
		{ // This switch handles 1-12 months (including exception) and includes Leap Year for FEB. 
			case 1: System.out.println(
					 "Jan " + givenYear + " had a total of 31 days"); break;
			case 2: System.out.println("Feb " + givenYear + " had a total of " +
					  ((leapYear) ? " 29 days" : " had a total of 28 days")); break;
					  // Here we check if a leap year
			case 3: System.out.println(
					 "Mar " + givenYear + " had a total of 31 days"); break;
			case 4: System.out.println(
					 "Apr " + givenYear + " had a total of 30 days"); break;
			case 5: System.out.println(
					 "May " + givenYear + " had a total of days"); break;
			case 6: System.out.println(
					 "June " + givenYear + " had a total of 30 days"); break;
			case 7: System.out.println(
					 "July " + givenYear + " had a total of 31 days"); break;
			case 8: System.out.println(
					 "Aug " + givenYear + " had a total of 31 days"); break;
			case 9: System.out.println(
					 "Sep " + givenYear + " had a total of 30 days"); break;
			case 10: System.out.println(
					 "Oct " + givenYear + " had a total of 31 days"); break;
			case 11: System.out.println(
					 "Nov " + givenYear + " had a total of 30 days"); break;
			case 12: System.out.println(
					 "Dec " + givenYear + " had a total of 31 days"); break;
            default: // Default case handles error/exception if anything outside of 1-12 for month
                    System.out.println("This is a wrong input, please use a number between 1-12"); break;

		}
	}
}
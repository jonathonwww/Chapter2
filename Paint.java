//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************

import java.util.Scanner;
public class Paint
{
	public static void main(String[] args)
	{
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		
		int length, width, height;
		//declare integers length, width, and height;
		
		double TotalSqFt;
		//declare double totalSqFt;
		
		double paintNeeded;
		//declare double paintNeeded;
		
		int window;
		
		int door;
		
		Scanner scan = new Scanner(System.in);
		//declare and initialize Scanner object
		
		System.out.print("Length: ");
		length = scan.nextInt();
		//Prompt for and read in the length of the room
		
		System.out.print("\nWidth: ");
		width = scan.nextInt();
		//Prompt for and read in the width of the room
		
		System.out.print("\nHeight: ");
		height = scan.nextInt();
		//Prompt for and read in the height of the room
		
		System.out.println("\n# of windows:");
		window = scan.nextInt();
		
		System.out.println("\n# of doors:");
		door = scan.nextInt();
		
		TotalSqFt =  (width * height * 2) + (length * height * 2) - ((15 * window) + (20 * door));
		
		System.out.println("\nYour total area is  " + TotalSqFt + " feet squared.");
		/*Compute the total square feet to be painted--think
		about the dimensions of each wall*/
		
		paintNeeded = Math.round((TotalSqFt/350) * 100.0 ) / 100.0;
		//Compute the amount of paint needed
		
		System.out.println("You need " + paintNeeded + " gallons of paint.");
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
	}
}	

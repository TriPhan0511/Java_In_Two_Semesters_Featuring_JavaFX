package com.triphan.iteration;

import java.util.Scanner;

/**
 * This sample demonstrate the do...while loop.
 * @version 1.0 2021-12-30
 * @author Tri Phan
 *
 */
public class TimeTableWithLoop 
{
	private static Scanner keyboard = new Scanner(System.in); 
	
	
	public static void main(String[] args) 
	{
		char choice;
		System.out.println("\n*** Lab Times ***");
		do
		{
			
			System.out.println("\n[1] TIME FOR GROUP A");
			System.out.println("[2] TIME FOR GROUP B");
			System.out.println("[3] TIME FOR GROUP C");
			System.out.println("[4] QUIT PROGRAM");
			System.out.print("enter choice [1,2,3,4]: ");
			choice = keyboard.next().charAt(0);
			switch (choice)
			{
				case '1':
					System.out.println("\n10.00 a.m");
					break;
				case '2':
					System.out.println("\n1.00 p.m");
					break;
				case '3':
					System.out.println("\n11.00 a.m");
					break;
				case '4':
					System.out.println("\nGoodbye");
					break;
				default:
					System.out.println("\nOptions 1-4 only!");
			}
		} while (choice != '4');
	}
}

































package com.triphan.methods;

import java.util.Scanner;

/**
 * This sample calculates the area and circumference of 
 * a circle whose radius entered by the user.
 * @version 1.0 2021-12-31
 * @author Tri Phan
 *
 */
public class CircleCalculation 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		char choice;
//		Initialize the radius with a dummy value to show that nothing has been entered
		double radius = -999; 
		
		System.out.println("\n*** Circle Calculations ***");
		do
		{
			System.out.println("\n1. Enter the radius of the circle.");
			System.out.println("2. Display the area of the circle.");
			System.out.println("3. Display the circumference of the circle.");
			System.out.println("4. Quit the program.");
			System.out.print("\nEnter a number from 1 - 4: ");
			choice = keyboard.next().charAt(0);
			switch (choice)
			{
			case '1':
				radius = getRadius();
				break;
			case '2':
				displayArea(radius);
				break;
			case '3':
				displayCircumference(radius);
				break;
			case '4':
				System.out.println("\nGoodbye");
				break;
				default:
					System.out.println("Options 1-4 only!");
			}
		} while (choice != '4');
	}
	
	private static double getRadius()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nEnter a radius: ");
		return keyboard.nextDouble();
	}
	
	private static void displayArea(double radius)
	{
		if (radius == -999)
		{
			System.out.println("\nRadius has not been entered.");
		}
		else
		{
			System.out.printf("\nArea = %.2f\n", 3.14 * radius * radius);
		}
	}
	
	private static void displayCircumference(double radius)
	{
		if (radius == -999)
		{
			System.out.println("\nRadius has not been entered.");
		}
		else
		{
			System.out.printf("\nCircumference = %.2f\n", 2 * 3.14 * radius);	
		}
	}
}




























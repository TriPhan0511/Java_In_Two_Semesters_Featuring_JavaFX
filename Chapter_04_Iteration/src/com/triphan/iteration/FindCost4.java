package com.triphan.iteration;

import java.util.Scanner;

public class FindCost4 
{
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		double price, tax;
		char reply;
		do
		{
			System.out.println("\n*** Product Price Check ***");
			System.out.print("Enter initial price: ");
			price = keyboard.nextDouble();
			System.out.print("Enter tax rate: ");
			tax = keyboard.nextDouble();
			price = price * (1 + tax/100);
			System.out.printf("Cost after tax = %.1f\n", price);
			System.out.print("\nWould you like to enter another product (y/n)?: ");
			reply = keyboard.next().charAt(0);
		} while (reply == 'y' || reply == 'Y');
	}

}































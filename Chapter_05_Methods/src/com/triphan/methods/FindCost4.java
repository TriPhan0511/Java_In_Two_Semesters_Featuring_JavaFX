package com.triphan.methods;

import java.util.Scanner;

public class FindCost4 
{
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		double price, tax;
		System.out.println("\n*** Product Price Check ***");
		System.out.print("\nEnter initial price: ");
		price = keyboard.nextDouble();
		System.out.print("Enter tax rate: ");
		tax = keyboard.nextDouble();
		price = addTax(price, tax);
		System.out.printf("Cost after tax = %.1f", price);
	}
	
	private static double addTax(double priceIn, double taxIn)
	{
		return priceIn * (1 + taxIn/100);
	}
}

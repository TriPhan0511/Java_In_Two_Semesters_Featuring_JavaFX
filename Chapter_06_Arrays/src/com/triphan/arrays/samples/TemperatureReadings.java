package com.triphan.arrays.samples;

import java.util.Scanner;

public class TemperatureReadings 
{
//	public static void main(String[] args) 
//	{
//		Scanner keyboard = new Scanner(System.in);
//		double[] temperature = new double[7];
//		
////		Enters temperatures
//		for (int i = 0; i < temperature.length; i++)
//		{
//			System.out.print("Enter max temperature for day " + (i + 1) + ": ");
//			temperature[i] = keyboard.nextDouble();
//		}
//		
////		Displays the temperatures
//		System.out.println("\n*** TEMPERATURES ENTERED ***");
//		for (int i = 0; i < temperature.length; i++)
//		{
//			System.out.println("Day " + (i + 1) + " " + temperature[i]);
//		}
//	}
	
//	------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) 
	{
		double[] temps = new double[7];
//		Gets temperatures
		enterTemps(temps);
//		Displays entered temperatures
		displayTemps(temps);
	}
	
	private static void enterTemps(double[] temps)
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < temps.length; i++)
		{
			System.out.print("Enter max temperature for day " + (i + 1) + ": ");
			temps[i] = keyboard.nextDouble();
		}
	}
	
	private static void displayTemps(double[] temps)
	{
		System.out.println();
		System.out.println("*** TEMPERATURES ENTERED ***");
		System.out.println();
		for (int i = 0; i < temps.length; i++)
		{
			System.out.println("Day " + (i + 1) + " " + temps[i]);
		}
	}
}

































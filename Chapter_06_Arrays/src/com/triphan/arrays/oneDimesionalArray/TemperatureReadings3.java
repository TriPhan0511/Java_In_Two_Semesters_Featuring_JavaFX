package com.triphan.arrays.oneDimesionalArray;

import java.util.Scanner;

public class TemperatureReadings3 
{
	public static void main(String[] args) 
	{
		int numberOfTemps = 7;
		double[] temps = getTemps(numberOfTemps);
		displayTemps(temps);
	}
	
	private static double[] getTemps(int numberOfTemps)
	{
		Scanner keyboard = new Scanner(System.in);
		double[] out = new double[numberOfTemps];
		for (int i = 0; i < out.length; i++)
		{
			System.out.print("Day " + (i + 1) + ": ");
			out[i] = keyboard.nextDouble();
		}
		return out;
	}
	
//	Use the enhanced "for" loop
	private static void displayTemps(double... temps)
	{
		System.out.println();
		for (double item : temps)
		{
			System.out.println(item);
		}
	}
}
























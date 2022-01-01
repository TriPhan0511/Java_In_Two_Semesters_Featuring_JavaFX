package com.triphan.arrays.samples;

/**
 * This sample illustrates about varargs.
 * @param args
 */
public class DisplayTemperatesWithVarargs 
{
	public static void main(String[] args) 
	{
		double[] temps = {9, 5, 4, 8 };
		displayTemps(temps);
		displayTemps(1, 2, 3);
		displayTemps(1, 2, 3, 4, 5);
	}
	
	private static void displayTemps(double... temps)
	{
		System.out.println();
		for(int i = 0; i < temps.length; i++)
		{
			System.out.print(temps[i] + " ");
		}
	}
}

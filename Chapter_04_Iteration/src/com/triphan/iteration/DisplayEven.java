package com.triphan.iteration;

/**
 * This sample demonstrates the "continue" statement.
 * @version 1.0 2021-12-30
 * @author Tri Phan
 */
public class DisplayEven 
{
	public static void main(String[] args) 
	{
		System.out.println("\n*** Even numbers from 10 to 1 ***\n");
		for (int i = 10; i >= 1; i--)
		{
			if (i%2 != 0)
			{
				continue;
			}
			System.out.print(i + " ");
		}
	}
}

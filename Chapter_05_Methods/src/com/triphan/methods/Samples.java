package com.triphan.methods;

public class Samples 
{
	public static void main(String[] args) 
	{
////		Finds a maximum number between two numbers
//		int a = 3;
//		int b = 2;
//		System.out.printf("Max = %d", max(a, b));
		
//		Indicates a number is an even number or not
//		int number = 0;
		int number = 1;
		if (isEven(number))
		{
			System.out.printf("%d is an even number.", number);
		}
		else
		{
			System.out.printf("%d is not an even number.", number);
		}
	}
	
	private static int max(int first, int second)
	{
		return first > second ? first : second;
	}
	
	private static boolean isEven(int number)
	{
		return (number % 2 == 0);
	}
}

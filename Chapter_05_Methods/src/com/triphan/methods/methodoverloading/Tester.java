package com.triphan.methods.methodoverloading;

public class Tester 
{
	public static void main(String[] args) 
	{
		int first = 5;
		int second = 4;
		int third = 3;
		
		System.out.printf("Max of (%d, %d) is %d.\n",
				first, second, max(first, second));
		System.out.printf("Max of (%d, %d, %d) is %d.",
				first, second, third, max(first, second, third));
	}
	
	private static int max(int ...numbers)
	{
		int result = numbers[0];
		for (int item : numbers)
		{
			if (item > result)
			{
				result = item;
			}
		}
		return result;
	}
	
//	private static int max(int first, int second)
//	{
//		if (first > second)
//		{
//			return first;
//		}
//		else
//		{
//			return second;
//		}
//	}
//	
////	private static int max(int first, int second, int third)
////	{
////		int result = first;
////		if (second > result)
////		{
////			result = second;
////		}
////		if (third > result)
////		{
////			result = third;
////		}
////		return result;
////	}
//	
//	private static int max(int first, int second, int third)
//	{
//		int step1, result;
//		step1 = max(first, second);
//		result = max(step1, third);
//		return result;
//	}
}



































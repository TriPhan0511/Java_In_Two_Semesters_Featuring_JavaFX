package com.triphan.iteration;

import java.util.Scanner;

public class WhileLoopSample 
{
	private static Scanner keyboard = new Scanner(System.in);
	
//	public static void main(String[] args)
//	{
////		Input validation
//		int mark;
//		System.out.print("\nWhat exam mark did you get? ");
//		mark = keyboard.nextInt();
//		while (mark < 0 || mark > 100)
//		{
//			System.out.println("\nThe exam should be between 0 and 100.");
//			System.out.println("Please re-enter.");
//			System.out.print("\nWhat exam mark did you get? ");
//			mark = keyboard.nextInt();
//		}
//		System.out.println("\nYour mark: " + mark);
//	}
	
//	public static void main(String[] args)
//	{
////		Input validation
//		int mark = -1;
//		while (mark < 0 || mark > 100)
//		{
//			System.out.print("\nWhat exam mark did you get? ");
//			mark = keyboard.nextInt();
//			if (mark < 0 || mark > 100)
//			{
//				System.out.println("\nThe exam should be between 0 and 100.");
//				System.out.println("Please re-enter.");
//			}
//		}
//		System.out.println("\nYour entered mark: " + mark);
//	}
	
	public static void main(String[] args)
	{
		System.out.println("\nWhat exam mark did you get? ");
		int mark = keyboard.nextInt();
		while (mark < 0 || mark > 100)
		{
			System.out.println("\nInvalid mark. The mark should be between 0 and 100.");
			System.out.print("Please re-enter: ");
			mark = keyboard.nextInt();
		}
		System.out.println("\nYour entered mark: " + mark);
	}
	
//	public static void main(String[] args) 
//	{
////		Input validation
//		int mark;
//		while (true) 
//		{
//			System.out.print("\nWhat exam mark did you get? ");
//			mark = keyboard.nextInt();
//			if (mark < 0 || mark > 100)
//			{
//				System.out.println("\nThe mark should be between 0 and 100.");
//				System.out.println("Please re-enter.");
//			}
//			else
//			{
//				break;
//			}
//		}
//		System.out.println("\nYour entered mark: " + mark);
//	}
}































package com.triphan.arrays.samples;

import java.util.Scanner;

public class SomeUsefulArrayMethods 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int[] numbers;
		int size;
		char choice;

		System.out.print("\nHow many elements to store? ");
		size = keyboard.nextInt();
		numbers = new int[size];
		
//		Menu options
		do
		{
			System.out.println("\n[1] Enter values");
			System.out.println("[2] Find maximum");
			System.out.println("[3] Calculate sum");
			System.out.println("[4] Check membership");
			System.out.println("[5] Search array");
			System.out.println("[6] Display values");
			System.out.println("[7] Exit" );
			System.out.print("\nEnter choice [1-7]: ");
			choice = keyboard.next().charAt(0);
			switch (choice)
			{
				case '1':
					fillArray(numbers);
					break;
				case '2':
					System.out.println("\nMaximum array value = " + max(numbers));
					break;
				case '3':
					System.out.println("\nSum of array values = " + sum(numbers));
					break;
				case '4':
					System.out.print("\nEnter value to find: ");
					int value = keyboard.nextInt();
					boolean found = contains(numbers, value);
					if (found)
					{
						System.out.println("\n" + value + " is in the array.");
					}
					else
					{
						System.out.println("\n" + value + " is not in the array.");
					}
					break;
				case '5':
					System.out.print("\nEnter value to find: ");
					int item = keyboard.nextInt();
					int index = search(numbers, item);
					if (index == -1)
					{
						System.out.println("\nThis value is not in the array.");
					}
					else
					{
						System.out.println("\nThis value is at array index " + index);
					}
					break;
				case '6':
					System.out.println("\nArray values:");
					displayArray(numbers);
					break;
				default:
					System.out.println("\nEnter options from 1- 7.");
			}
		} while (choice != '7');
		System.out.println("Goodbye");
	}
	
//	Array Maximum: Finds the maximum number in an array of integers
	private static int max(int[] numbers)
	{
		int result = numbers[0];
		for (int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] > result)
			{
				result = numbers[i];
			}
		}
		return result;
	}
	
//	Array Summation: Calculates the total of all the values in an array of integers
	private static int sum(int[] numbers)
	{
		int total = 0;
		for (int item : numbers)
		{
			total += item;
		}
		return total;
	}
	
//	Array Membership
	private static boolean contains(int[] numbers, int value)
	{
		for (int item : numbers)
		{
			if (item == value)
			{
				return true;
			}
		}
		return false;
	}

//	Array Search
	private static int search(int[] numbers, int value)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	
	private static int search(int[] numbers, int value, int from)
	{
		if (from > numbers.length - 1)
		{
			return -1;
		}
		for (int i = from; i < numbers.length; i++)
		{
			if (numbers[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	
	private static int searchFromTheBottom(int[] numbers, int value)
	{
		for (int i = numbers.length - 1; i >= 0; i--)
		{
			if (numbers[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	
//	Enters array elements
	private static void fillArray(int[] numbers)
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.printf("numbers[%d]: ", i + 1);
			numbers[i] = keyboard.nextInt();
		}
	}
	
//	Display elements in an array of integers
	private static void displayArray(int[] numbers)
	{
		System.out.println();
		for (int item : numbers)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}
}


































package com.triphan.arrays.twoDimesionalArray;

import java.util.Scanner;

public class MonthlyTemperates 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double[][] temps = new double[4][7];
//		double[][] temps = {
//							{1, 2, 3, 4, 5, 6, 7},
//							{8, 9, 10, 11, 12, 13, 14},
//							{15, 16, 17, 18, 19, 20, 21},
//							{22, 23, 24, 25, 26, 27, 28},
//							};
		
		char choice;
		do
		{
			System.out.println("\n[1] Enter temperatures.");
			System.out.println("[2] Display all.");
			System.out.println("[3] Display one week.");
			System.out.println("[4] Display day of the week.");
			System.out.println("[5] Exit.");
			System.out.print("\nEnter choice [1-5]: ");
			choice = keyboard.next().charAt(0);
			switch (choice)
			{
				case '1':
					enterTemps(temps);
					break;
				case '2':
					displayAllTemps(temps);
					break;
				case '3':
					displayWeek(temps);
					break;
				case '4':
					displayDays(temps);
					break;
				case '5':
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("\nWrong choice. Options 1-5 only!");
			}
		} while (choice != '5');
		
	}
	
	private static void enterTemps(double[][] temps)
	{
		Scanner keyboard = new Scanner(System.in);
		for (int week = 1; week <= temps.length; week++)
		{
			for (int day = 1; day <= temps[0].length; day++)
			{
				System.out.printf("Enter temperature for week %d and day %d: ",
									week, day);
				temps[week-1][day-1] = keyboard.nextDouble();
			}
		}
	}
	
	private static void displayAllTemps(double[][] temps)
	{
		for (int week = 0; week < temps.length; week++)
		{
			for (int day = 0; day < temps[0].length; day++)
			{
				System.out.print(temps[week][day] + " ");
			}
			System.out.println();
		}
	}
	
	private static void displayWeek(double[][] temps)
	{
		Scanner keyboard = new Scanner(System.in);
		int week;
		do 
		{
			System.out.print("\nEnter a week (between 1 and 4): ");
			week = keyboard.nextInt();
		} while (week < 1 || week > 4);
		for (int day = 1; day <= temps.length; day++)
		{
			System.out.print(temps[week-1][day] + " ");
		}
		System.out.println();
	}
	
	private static void displayDays(double[][] temps)
	{
		Scanner keyboard = new Scanner(System.in);
		int day;
		do
		{
			System.out.print("\nEnter a day (between 1 and 7): ");
			day = keyboard.nextInt();
		} while (day < 1 || day > 7);
		for (int week = 1; week <= temps.length; week++)
		{
			System.out.println("Week " + week + " day " + day + ": " + temps[week-1][day-1]);
		}
	}
}





































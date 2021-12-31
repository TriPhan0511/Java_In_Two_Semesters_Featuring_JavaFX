package com.triphan.methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataEntry 
{
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int[] numbers = getData();
		DateTimeFormatter fullFormat = 
				DateTimeFormatter.ofPattern("MMMM d, YYYY");
		LocalDate date = LocalDate.of(numbers[2], numbers[1], numbers[0]);
		System.out.println(date.format(fullFormat));
	}
	
	private static int[] getData()
	{
		int[] numbers = new int[3];
		
		System.out.println("Please enter the day of your birth as a number from 1 to 31");
		displayMessage();
		numbers[0] = keyboard.nextInt();
		System.out.println("Please enter the month of your birth as a number from 1 to 12");
		displayMessage();
		numbers[1] = keyboard.nextInt();
		System.out.println("Please enter the year of your birth as a number");
		displayMessage();
		numbers[2] = keyboard.nextInt();
		
		return numbers;
	}
	
	private static void displayMessage()
	{
		String message = "Please note that all information supplied is confidential\n"
				+ "No personal details will be shared with any third party.";
		System.out.println(message);
	}
}

















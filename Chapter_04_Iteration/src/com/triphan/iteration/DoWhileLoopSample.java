package com.triphan.iteration;

import java.util.Scanner;

public class DoWhileLoopSample 
{
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		char response;
		do
		{
			System.out.println("\nAnother go? (y/n)? ");
			response = keyboard.next().charAt(0);
		} while (response == 'y' || response == 'Y');
	}
}

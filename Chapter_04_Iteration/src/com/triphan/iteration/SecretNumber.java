package com.triphan.iteration;

import java.util.Scanner;

/**
 * This sample demonstrates the "break" statement.
 * @version 1.0 2021-12-30
 * @author Tri Phan
 *
 */
public class SecretNumber 
{
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		final int SECRET_NUMBER = 11;
		int guessNumber;
		boolean guessed = false;
		System.out.println("You have 3 goes to guess the secret number");
		System.out.println("HINT: It is a number less than 50!");
		for (int i = 0; i < 3; i++) 
		{
			System.out.print("\nEnter guess: ");
			guessNumber = keyboard.nextInt();
			if (guessNumber == SECRET_NUMBER)
			{
				guessed = true;
				break;
			}
		}
		if (guessed)
		{
			System.out.println("\nNumber guessed correctly.");
		}
		else
		{
			System.out.println("\nNumber NOT guessed.");
		}
	}
}

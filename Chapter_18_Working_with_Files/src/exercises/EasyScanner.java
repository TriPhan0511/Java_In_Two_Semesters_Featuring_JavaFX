package exercises;

import java.util.Scanner;

public class EasyScanner 
{
	public static String nextString(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);
		String s;
		while (true) 
		{
			System.out.print(prompt);
			s = keyboard.nextLine();
			if (s == null || s.length() == 0)
			{
				System.out.println("Your input should not be empty.");
				continue;
			}
			return s;
		}
	}
	
	public static char nextChar(String prompt)
	{
//		Scanner keyboard = new Scanner(System.in);
//		return nextString(prompt).charAt(0);
		
		Scanner keyboard = new Scanner(System.in);
		String s;
		while (true) 
		{
			System.out.print(prompt);
			s = keyboard.nextLine();
			if (s == null || s.length() == 0)
			{
				System.out.println("Your input should not be empty.");
				continue;
			}
			return s.charAt(0);
		}
	}
	
	public static int nextInt(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);
		int i;
		while (true)
		{
			System.out.print(prompt);
			try
			{
				i = Integer.parseInt(keyboard.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid input.");
				continue;
			}
			return i;
		}
	}
	
	public static double nextDouble(String prompt)
	{
		Scanner keyboard = new Scanner(System.in);
		double d;
		while (true)
		{
			System.out.print(prompt);
			try
			{
				d = Double.parseDouble(keyboard.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid input.");
				continue;
			}
			return d;
		}
	}
}








































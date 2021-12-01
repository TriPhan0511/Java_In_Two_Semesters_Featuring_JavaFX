package diy;
import java.util.Scanner;

/**
 * Some utility methods which used to get data from the keyboard.
 * 1. Gets a string.
 * 2. Gets a char.
 * 3. Gets a double.
 * 4. Gets a integer.
 * 
 * @version 1.0 2021-11-29
 * @author Tri Phan
 *
 */
public class EasyScanner 
{
	/**
	 * Gets a string from the keyboard.
	 * @return A string
	 */
	public static String nextString()
	{
		Scanner keyboard = new Scanner(System.in);
		String s;
		while (true)
		{
			s = keyboard.nextLine();
			if (s == null || s.length() == 0)
			{
				System.out.println("The input should not be empty.");
				continue;
			}
			return s;
		}
	}
	
	/**
	 * Gets a char from the keyboard.
	 * @return A char.
	 */
	public static char nextChar()
	{
		Scanner keyboard = new Scanner(System.in);
		String s;
		while (true)
		{
			s = keyboard.nextLine();
			if (s == null || s.length() == 0)
			{
				System.out.println("The input should not be empty.");
				continue;
			}
			return s.charAt(0);
		}
	}
	
	/**
	 * Gets a double from the keyboard.
	 * @return A double.
	 */
	public static double nextDouble()
	{
		Scanner keyboard = new Scanner(System.in);
		while (true)
		{
			try
			{
				return Double.parseDouble(keyboard.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid double.");
			}
		}
	}
	
	/**
	 * Gets an integer from the keyboard.
	 * @return An integer.
	 */
	public static int nextInt()
	{
		Scanner keyboard = new Scanner(System.in);
		while (true)
		{
			try
			{
				return Integer.parseInt(keyboard.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid integer.");
			}
		}
	}
}




















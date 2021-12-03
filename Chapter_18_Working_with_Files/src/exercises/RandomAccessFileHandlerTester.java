package exercises;

import java.util.ArrayList;
import java.util.List;

public class RandomAccessFileHandlerTester 
{
	public static void main(String[] args)
	{
		final String FILE_NAME = "src/exercises/Cars.rand";
		RandomAccessFileHandler fileHandler = new RandomAccessFileHandler();
		
		char choice;
		System.out.println("Random Acces File Handler Tester");
		System.out.println("1. Add a new car");
		System.out.println("2. Display a car");
		System.out.println("3. Quit");
		do
		{
			choice = EasyScanner.nextChar("\nEnter your choice: ");
			switch (choice)
			{
				case '1':
					fileHandler.writeARecord(FILE_NAME);
					break;
				case '2':
					fileHandler.displayACar(FILE_NAME);
					break;
				case '3':
					break;
				default:
					System.out.println("Please enter a number from 1 - 3.");
			}
		} while (choice != '3');
	}
}

package exercises;

import java.util.ArrayList;
import java.util.List;

public class TextFileHanlerTester 
{
	public static void main(String[] args)
	{
		final String FILE_NAME = "src/exercises/Cars.txt";
		List<Car> carList = new ArrayList<>();
		TextFileHandler fileHandler = new TextFileHandler();
		CarListHandler listHandler = new CarListHandler();
		
//		Gets all records in the file and adds them to the list
//		when the program start.
		fileHandler.readRecords(FILE_NAME, carList);
		
		char choice;
		System.out.println("Text File Handler Tester");
		System.out.println("1. Add a new car");
		System.out.println("2. Remove a cars");
		System.out.println("3. List all cars");
		System.out.println("4. Prints out the content of the file to the console.");
		System.out.println("5. Save and quit");
		do
		{
			choice = EasyScanner.nextChar("\nEnter your choice: ");
			switch (choice)
			{
				case '1':
					listHandler.addCar(carList);
					break;
				case '2':
					listHandler.removeCar(carList);
					break;
				case '3':
					listHandler.listAll(carList);
					break;
				case '4':
					fileHandler.readCharacterByCharacter(FILE_NAME);
					break;
				case '5':
					fileHandler.writeRecords(carList, FILE_NAME);
					break;
				default:
					System.out.println("Please enter a number from 1 - 5.");
			}
		} while (choice != '5');
		
	}
}








































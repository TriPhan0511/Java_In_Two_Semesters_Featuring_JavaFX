package exercises;

import java.util.ArrayList;
import java.util.List;

public class SerializationFileHandlerTester 
{
	public static void main(String[] args)
	{
		final String FILE_NAME = "src/exercises/Cars.sez";
		List<SerializableCar> carList = new ArrayList<>();
		SerializationFileHandler fileHandler = new SerializationFileHandler();
		SerializableCarListHandler listHandler = new SerializableCarListHandler();
		
//		Gets all records in the file and adds them to the list
//		when the program start.
		fileHandler.readRecords(FILE_NAME, carList);
		
		char choice;
		System.out.println("Serialization File Handler Tester");
		System.out.println("1. Add a new car");
		System.out.println("2. Remove a cars");
		System.out.println("3. List all cars");
		System.out.println("4. Save and quit");
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
					fileHandler.writeRecords(carList, FILE_NAME); // Writes data to the file
					break;
				default:
					System.out.println("Please enter a number from 1 - 4.");
			}
		} while (choice != '4');
	}
}

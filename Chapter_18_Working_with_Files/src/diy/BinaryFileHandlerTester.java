package diy;

import java.util.List;

import readingandwritingtobinaryfiles.Car;
import readingandwritingtobinaryfiles.EasyScanner;

import java.util.ArrayList;

public class BinaryFileHandlerTester 
{
	public static void main(String[] args)
	{
//		Creates some variables.
		final String FILE_NAME = "src/diy/Cars.bin";
		List<Car> carList = new ArrayList<>();
		CarsHandler carsHandler = new CarsHandler();
		BinaryFileHandler fileHandler = new BinaryFileHandler();
		char choice;
		
//		Gets data from the file, then, adds to the list
		fileHandler.readList(carList, FILE_NAME);
		
		do
		{
//			Menu option
			System.out.println("\nBinary File Handler Tester.");
			System.out.println("1. Add a new car");
			System.out.println("2. Remove a car");
			System.out.println("3. List all cars");
			System.out.println("4. Save all works and quit the program");
			System.out.print("\nEnter your choice: ");
			
			choice = EasyScanner.nextChar();
			switch (choice)
			{
				case '1':
					carsHandler.addCar(carList);
					break;
					
				case '2':
					carsHandler.removeCar(carList);
					break;
					
				case '3':
					carsHandler.listAll(carList);
					break;
					
				case '4':
					fileHandler.writeList(carList, FILE_NAME);
					break;
				
				default:
					System.out.println("\nPlease enter a number from 1 - 4.");
			}			
		} while (choice != '4');
	}
}
































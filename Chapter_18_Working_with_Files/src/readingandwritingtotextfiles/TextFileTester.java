package readingandwritingtotextfiles;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This sample demonstrates reading and writing to text files. 
 * @version 1.0
 * @author Tri Phan
 *
 */
public class TextFileTester 
{
	public static void main(String[] args) 
	{
		char choice;
		
//		Creates an empty list to hold Cars
		List<Car> carList = new ArrayList<>();
		
//		Read the list from file when the program starts
		readList(carList);
		
//		Menu options
		do
		{
			System.out.println("\nText File Tester");
			System.out.println("1. Add a car");
			System.out.println("2. Remove a car");
			System.out.println("3. List all cars");
			System.out.println("4. Quit\n");
			System.out.print("Enter your choice: ");
			choice = EasyScanner.nextChar();
			System.out.println();
			switch (choice)
			{
				case '1': 
					addCar(carList);
					break;
					
				case '2': 
					removeCar(carList);
					break;
					
				case '3':
					listAll(carList);
					break;
					
				case '4':
					writeList(carList);
					break;
					
				default:
					System.out.println("\nPlease choose a number from 1 - 4 only.");
			}
		} while (choice != '4');
	}

	/**
	 * Method for adding a new car to the list
	 * @param carListIn A list of cars.
	 */
	static void addCar(List<Car> carListIn)
	{
		String tempReg;
		String tempMake;
		double tempPrice;
		
		System.out.print("Please enter the registration number: ");
		tempReg = EasyScanner.nextString();
		System.out.print("Please enter the make: ");
		tempMake = EasyScanner.nextString();
		System.out.print("Please enter the price: ");
		tempPrice = EasyScanner.nextDouble();
		
		carListIn.add(new Car(tempReg, tempMake, tempPrice));
	}
	
	/**
	 * Method for removing a car from the list
	 * (in a real application this would need to
	 * include some validation).
	 * @param carListIn A list of cars.
	 */
	static void removeCar(List<Car> carListIn)
	{
		int pos;
		System.out.print("Enter the position of the car to be removed: ");
		pos = EasyScanner.nextInt();
		carListIn.remove(pos - 1);
	}
	
	/**
	 * Method for listing details of all cars in the list.
	 * @param carListIn A list of cars.
	 */
	static void listAll(List<Car> carListIn)
	{
		for (Car item : carListIn)
		{
			System.out.println(item.getRegistration()
					+ " "
					+ item.getMake()
					+ " "
					+ item.getPrice());
		}
	}
	
	/**
	 * Method for writing the file. 
	 * @param carListIn A list of cars.
	 */
	static void writeList(List<Car> carListIn)
	{
//		Use try-with-resources to ensure file is close safely
		try
		(
//			Creates a FileWriter object, carFile, that handles	
//			the low-level details of writing the list to a file
//			which we have called "Cars.txt".
			FileWriter carFile = new FileWriter("src/readingandwritingtotextfiles/Cars.txt");
//			Now, creates a PrintWriter object to wrap around carFile;
//			this allows us to use high-level functions such as println.
			PrintWriter carWriter =  new PrintWriter(carFile);
		)
		{
//			Write each element of the list to the file
			for (Car item : carListIn)
			{
				carWriter.println(item.getRegistration());
				carWriter.println(item.getMake());
				carWriter.println(item.getPrice()); // println can accept a double, and write it as a string.
			}
		}
//		Handles the exception thrown by FileWrite methods. 
		catch (IOException e)
		{
			System.out.println("There was a problem writing the file.");
		}
	}
	
	/**
	 * Method for reading the file.
	 * @param carListIn A list of cars.
	 */
	static void readList(List<Car> carListIn)
	{
		String tempReg;
		String tempMake;
		String tempStringPrice;
		double tempDoublePrice;
		
//		Use try-with-resources to ensure file is closed safely
		try
		(
//			Creates a FileReader object, carFile, that handles
//			the low-level details of reading the list from the
//			"Cars.txt" file.
			FileReader carFile = new FileReader("src/readingandwritingtotextfiles/Cars.txt");
//			Now, create a BufferedReader object to wrap around carFile;
//			this allows us to use high-level functions such as readLine;
			BufferedReader carStream = new BufferedReader(carFile);
		)
		{
//			Reads the first line of the file
			tempReg = carStream.readLine();
//			Read the rest of the first record, then all the rest of records
//			until the end of the file is reached.
			while (tempReg != null) // A null string indicates end of file
			{
				tempMake = carStream.readLine();
				tempStringPrice = carStream.readLine();
//				As this is a text file we have to convert the price to double
				tempDoublePrice = Double.parseDouble(tempStringPrice);
				carListIn.add(new Car(tempReg, tempMake, tempDoublePrice));
				tempReg = carStream.readLine();
			}
		}
//		Handles the exception that thrown by the File Reader constructor
//		if the file is not found.
		catch (FileNotFoundException e)
		{
			System.out.println("\nNo file was read.");
		}
//		Handles the exception thrown by FileReader methods
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
}


































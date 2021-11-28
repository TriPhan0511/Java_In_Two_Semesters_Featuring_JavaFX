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
		List<Car> carListIn = new ArrayList<>();
		int choice;
		do 
		{
			System.out.print("\nEnter your choice\n"
					+ "1: Add a new car to list\n"
					+ "2: Remove a car in list\n"
					+ "3: Show all cars in list\n"
					+ "4: Exit the program : ");
			choice = EasyScanner.nextInt();
			switch (choice)
			{
				case 1:
					addCar(carListIn);
					writeList(carListIn);
					break;
				case 2: 
					removeCar(carListIn);
					break;
				case 3: 
					carListIn.clear();
					readList(carListIn);
					listAll(carListIn);
					break;
				default:
					System.out.println("Wrong choice. Try again.");
			}
		} while (choice != 4);
	}
	
//	Method for adding a new car to the list
	static void addCar(List<Car> carListIn)
	{
		String tempReg;
		String tempMake;
		double tempPrice;
		
		System.out.println("Please enter the registration number: ");
		tempReg = EasyScanner.nextString();
		System.out.println("Please enter the make: ");
		tempMake = EasyScanner.nextString();
		System.out.println("Please enter the price: ");
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
	 * @param carListIn A List of cars.
	 */
	static void writeList(List<Car> carListIn)
	{
//		Use try-with-resources to ensure file is close safely
		try(
			/*
			 * Creates a FileWriter object, carFile, that handles
			 * the low-level details of writing the list to a file
			 * which we have called "Cars.txt".
			 */
			FileWriter carFile = new FileWriter("Cars.txt");
			
			/*
			 * Now, creates a PrintWriter object to wrap around carFile;
			 * this allows us to use high-level functions such as println.
			 */
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
	
	static void readList(List<Car> carListIn)
	{
		String tempReg;
		String tempMake;
		String tempStringPrice;
		double tempDoublePrice;
		
//		Use try-with-resources to ensure file is closed safely
		try
		(
			/*
			 * Creates a FileReader object, carFile, that handles 
			 * the low-level details of reading the list from the 
			 * "Cars.txt" file.
			 * 
			 */
			FileReader carFile = new FileReader("Cars.txt");
				
			/*
			 * Now, create a BufferedReader object to wrap around carFile; 
			 * this allows us to use high-level functions such as readLine;
			 */
			BufferedReader carStream = new BufferedReader(carFile);
		)
		{
//			Reads the first line of the file
			tempReg = carStream.readLine();
//			Read the rest of the first record, then all the rest of records
//			until the end of the file is reached.
			while (tempReg != null) // a null string indicates end of file
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
			
		}
//		Handles the exception thrown by FileReader methods
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
}


































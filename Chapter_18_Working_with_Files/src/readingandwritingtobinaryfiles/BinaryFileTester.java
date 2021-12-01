package readingandwritingtobinaryfiles;

import java.util.List;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

import readingandwritingtotextfiles.Car;
import readingandwritingtotextfiles.EasyScanner;

import java.util.ArrayList;

/**
 * This sample demonstrates reading and writing to binary files. 
 * @version 1.0 2021-11-29
 * @author Tri Phan
 *
 */
public class BinaryFileTester 
{
	public static void main(String[] args) 
	{
		char choice;
		
//		Creates an empty list to hold Cars
		List<Car> carList = new ArrayList<>();
		
//		Reads the list from file when the program starts.
		readList(carList);
		
//		Menu option
		do
		{
			System.out.println("\nBinary File Tester.");
			System.out.println("1. Add a car");
			System.out.println("2. Remove a car");
			System.out.println("3. List all cars");
			System.out.println("4. Quit\n");
			System.out.print("Enter your choice: ");
			choice = EasyScanner.nextChar();
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
	static void writeList(List<Car> carList)
	{
//		Uses try-with-resources to ensure file is closed safely
		try
		(
			FileOutputStream carFile = new FileOutputStream("Cars.bin");
			DataOutputStream carWriter = new DataOutputStream(carFile);
		)
		{
			for (Car item : carList)
			{
				carWriter.writeUTF(item.getRegistration());
				carWriter.writeUTF(item.getMake());
				carWriter.writeDouble(item.getPrice());
				
			}
		}
		catch (IOException e)
		{
			System.out.println("There was a problem writing the file.");
		}
	}
	
	/**
	 * Method for reading the file.
	 * @param carListIn A list of cars.
	 */
	static void readList(List<Car> carList)
	{
		String tempRegistration;
		String tempMake;
		double tempPrice;
		boolean endOfFile = false;
		
//		Use try-with-resources to ensure file is closed safely
		try
		(
			FileInputStream carFile = new FileInputStream("Cars.bin");
			DataInputStream carStream = new DataInputStream(carFile);
		)
		{
			while (endOfFile == false)
			{
				try
				{
					tempRegistration = carStream.readUTF();
					tempMake = carStream.readUTF();
					tempPrice = carStream.readDouble();
					
					carList.add(new Car(tempRegistration, tempMake, tempPrice));
				}
				catch (EOFException e)
				{
					endOfFile = true;
				}
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nThere are currently no records.");
		}
		catch (IOException e)
		{
			System.out.println("There was a problem reading file.");
		}
	}
	
}





























package objectserialization;

import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class StudentFileTester 
{
	public static void main(String[] args) 
	{
		List<Car> carList =  new ArrayList<>();
		readList(carList);
		
		System.out.println("\nTest File Tester.");
		System.out.println("1. Add a new car");
		System.out.println("2. Remove a car");
		System.out.println("3. List all cars");
		System.out.println("4. Quit");
		
		char choice;
		do
		{
			System.out.print("\nEnter your choice: ");
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
					System.out.println("\nPlease enter a number from 1 - 4.");
			}
		} while (choice != '4');
	}
	
	static void addCar(List<Car> carList)
	{
		String tempRegistration;
		String tempMake;
		double tempPrice;
		
		System.out.print("\nEnter registration: ");
		tempRegistration = EasyScanner.nextString();
		System.out.print("Enter make: ");
		tempMake = EasyScanner.nextString();
		System.out.print("Enter price: ");
		tempPrice = EasyScanner.nextDouble();
		
		carList.add(new Car(tempRegistration, tempMake, tempPrice));
	}
	
	static void listAll(List<Car> carList)
	{
		for (Car item : carList)
		{
			System.out.println(item.getRegistration()
					+ " "
					+ item.getMake()
					+ " "
					+ item.getPrice());
		}
	}
	
	static void removeCar(List<Car> carList)
	{
		int pos;
		System.out.print("\nEnter position of the car will be removed: ");
		pos = EasyScanner.nextInt();
		carList.remove(pos - 1);
	}
	
	static void writeList(List<Car> carList)
	{
//		Use try-with-resources to ensure file is closed safely
		try
		(
			FileOutputStream carFile = new FileOutputStream("src/objectserialization/Cars.dat");
			ObjectOutputStream carStream = new ObjectOutputStream(carFile);
		)
		{
			for (Car item : carList)
			{
				carStream.writeObject(item);
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem writing the file.");
		}
	}
	
	static void readList(List<Car> carList)
	{
		boolean endOfFile = false;
		Car tempCar;
		
//		Use try-with-resources to ensure file is closed safely
		try
		(
//			Creates a FileInputStream object, carFile
			FileInputStream carFile = new FileInputStream("src/objectserialization/Cars.dat");
//			Creates an ObjectInputStream object to wrap around carFile
			ObjectInputStream carStream = new ObjectInputStream(carFile);
		)
		{
//			Read the first (whole) object with the readObject method
			tempCar = (Car) carStream.readObject();
//			Use the fact that readObject throws an EOFException to
//			check whether the end of the file has been reached
			while (endOfFile != true)
			{
				try
				{
					carList.add(tempCar);
//					Reads the next (whole) object
					tempCar = (Car) carStream.readObject();
				}
				catch (EOFException e)
				{
					endOfFile = true;
				}
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nNo file was read.");
		}
		catch (ClassNotFoundException e) // Thrown by readObject
		{
			System.out.println("\nTry to read an object of an known class.");
		}
		catch (StreamCorruptedException e) // thrown by the constructor
		{
			System.out.println("\nUnreadable file format.");
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
}































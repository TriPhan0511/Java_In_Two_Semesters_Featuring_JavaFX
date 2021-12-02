package random_access_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @version 1.0 2021-12-02
 * @author Tri Phan
 *
 */
public class RandomFileTester 
{
	static final int CAR_SIZE = 32; // Each record will be 32 bytes
	
	public static void main(String[] args)
	{
		char choice;
		do
		{
			System.out.println("\nRandom File Tester");
			System.out.println("1. Add a car");
			System.out.println("2. Display a car");
			System.out.println("3. Quit\n");
			System.out.print("\nEnter your choice: ");
			choice = EasyScanner.nextChar();
			switch (choice)
			{
				case '1': 
					addCar();
					break;
				case '2':
					displayCar();
					break;
				case '3':
					break;
				default:
					System.out.println("\nChoose 1 - 3 only please\n");
			}
		} while (choice != '3');
	}
	
	private static void addCar()
	{
		String tempReg;
		String tempMake;
		double tempPrice;
		
//		Gets the registration number of the car from the user.
		tempReg = getTenCharacters("Please enter registration number: ");
//		Gets the make of the car from the user
		tempMake = getTenCharacters("Please enter the make: ");
//		Gets the price of the car from the user
		System.out.print("Please enter the price: ");
		tempPrice = EasyScanner.nextDouble();
		
//		Writes the record to the file
		writeRecord(new Car(tempReg, tempMake, tempPrice));
	}
	
	private static void displayCar()
	{
		int pos;
//		Gets the position of the item to be read from the user
		System.out.print("Enter the car's position in the list: ");
		pos = EasyScanner.nextInt();
//		Reads the record requested from the file
		Car tempCar = readRecord(pos);
		if (tempCar != null)
		{
			System.out.println(tempCar.getRegistration().trim()
					+ " "
					+ tempCar.getMake().trim()
					+ " "
					+ tempCar.getPrice());
		}
		else
		{
			System.out.println("Invalid position.");
		}
	}
	
	private static void writeRecord(Car car)
	{
//		Use try-with-resources to ensure file is closed safely
		try
		(
//			Open a RandomAccesFile in read-write mode
			RandomAccessFile carFile = new RandomAccessFile("src/random_access_files/Cars.rand", "rw");
		)
		{
//			Move the pointer to the end of the file
			carFile.seek(carFile.length());
//			Write the three fields of the record to the file
			carFile.writeUTF(car.getRegistration());
			carFile.writeUTF(car.getMake());
			carFile.writeDouble(car.getPrice());
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem writing the file.");
		}
	}
	
	private static Car readRecord(int pos)
	{
		String tempReg;
		String tempMake;
		double tempPrice;
		Car tempCar = null; // A null value is returned if there is a problem reading the record
		
//		Uses try-with-resources to ensure file is closed safely
		try
		(
//			Opens a RandomAccessFile in read-only mode
			RandomAccessFile carFile = new RandomAccessFile("src/random_access_files/Cars.rand", "r");
		)
		{
//			Moves the pointer to the start of the required record
			carFile.seek((pos - 1) * CAR_SIZE);
//			Reads the three fields of the record from the file
			tempReg = carFile.readUTF();
			tempMake = carFile.readUTF();
			tempPrice = carFile.readDouble();
//			Use the data just read to create a new Car object
			tempCar = new Car(tempReg, tempMake, tempPrice);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nNo file was read.");
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
//		Returns the record that was read
		return tempCar;
	}
	
	private static String getTenCharacters(String prompt)
	{
		String s;
		
		while (true)
		{
			System.out.print(prompt);
			s = EasyScanner.nextString();
			if (s.length() > 10)
			{
				System.out.println("Ten charcters only - please re-enter.");
				continue;
			}
//			Pads the string with spaces to make it exactly 10 characters long
			for (int i = s.length() + 1; i <= 10; i++)
			{
				s = s.concat(" ");
			}
			return s;
		}
	}
}





























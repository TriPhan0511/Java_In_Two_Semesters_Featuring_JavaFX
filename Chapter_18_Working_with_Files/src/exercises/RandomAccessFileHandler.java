package exercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

/**
 * This class has methods which work direct on the file, 
 * not through a list.
 * 
 * @version 1.0 2021-12-03
 * @author Tri Phan
 *
 */
public class RandomAccessFileHandler 
{
	private final int CAR_SIZE = 32;
	
	/**
	 * Writes a Car object to the end of a random access file.
	 * 
	 * @param fileName A string represents a random access file.
	 */
	public void writeARecord(String fileName)
	{
		Car tempCar;
		tempCar = createACar();
		try
		(
			RandomAccessFile carFile = new RandomAccessFile(fileName, "rw");
		)
		{
			
			carFile.seek(carFile.length()); // Takes the pointer to the end of the file.
			carFile.writeUTF(tempCar.getRegistration());
			carFile.writeUTF(tempCar.getMake());
			carFile.writeDouble(tempCar.getPrice());
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nNo file found.");
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem wrting the file.");
		}
	}
	
	
	
	/**
	 * Gets a Car object at the specified position in the file.
	 * 
	 * @param fileName A string represents a file name.
	 * @return A Car object.
	 */
	public Car readARecord(String fileName)
	{
		Car tempCar = null;
		String tempReg;
		String tempMake;
		double tempPrice;
		int numberOfRecords;
		int pos;
		
		try
		(
			RandomAccessFile carFile = new RandomAccessFile(fileName, "r");
		)
		{
			if (carFile.length() >= CAR_SIZE)
			{
				numberOfRecords = (int) carFile.length() / CAR_SIZE;
				while (true)
				{
					
					pos = EasyScanner.nextInt("\nEnter the position of the car you wan to get information: ");
					if (pos <= 0 || pos > numberOfRecords)
					{
						System.out.println("\nInvalid position. Please re-enter.");
					}
					else
					{
						carFile.seek((pos - 1) * CAR_SIZE); // Moves the pointer to the record which will we want.
						tempReg = carFile.readUTF();
						tempMake = carFile.readUTF();
						tempPrice = carFile.readDouble();
						tempCar = new Car(tempReg, tempMake, tempPrice);
						break;
					}
				}
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nNo file was read.");
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
		return tempCar;
	}
	
	public void displayACar(String fileName)
	{
		Car tempCar = readARecord(fileName);
		if (tempCar == null)
		{
			System.out.println("\nNo information about the car.");
		}
		else
		{
			System.out.printf("%s %s %.1f",
					tempCar.getRegistration(),
					tempCar.getMake(),
					tempCar.getPrice());
		}
	}
	
	/**
	 * Gets information from the user,
	 * then creates a Car object.
	 * 
	 * @return A Car object.
	 */
	private Car createACar()
	{
		Car tempCar = null;
		String tempReg;
		String tempMake;
		double tempPrice;
		
		tempReg = EasyScanner.nextString("\nEnter the registration number of the car: ");
		tempMake = EasyScanner.nextString("Enter the make of the car: ");
		tempPrice = EasyScanner.nextDouble("Enter the price of the car: ");
		tempCar = new Car(tempReg, tempMake, tempPrice);
		
		return tempCar;
	}
}





























package diy;

import java.util.List;

import readingandwritingtobinaryfiles.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.DataInputStream;

/**
 * Some utility methods which used to handle a binary file.
 * 1. Writes data from a list to a file (writeList method).
 * 2. Reads data from a file, then, adds to a list (readList method).
 * 
 * @version 1.0 2021-11-29
 * @author Tri Phan
 *
 */
public class BinaryFileHandler 
{
	/**
	 * Method for writing to file.
	 * @param carList A list of cars.
	 * @param fileName A string represents a file.
	 */
	public void writeList(List<Car> carList, String fileName)
	{
		try
		(
			FileOutputStream carFile = new FileOutputStream(fileName);
			DataOutputStream carStream = new DataOutputStream(carFile);
		)
		{
			for (Car item : carList)
			{
				carStream.writeUTF(item.getRegistration());
				carStream.writeUTF(item.getMake());
				carStream.writeDouble(item.getPrice());
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem writing file.");
		}
	}
	
	/**
	 * Method for reading file.
	 * @param carList A list of cars.
	 * @param fileName A string represents a file.
	 */
	public void readList(List<Car> carList, String fileName)
	{
		String tempRegistration;
		String tempMake;
		double tempPrice;
		boolean endOfFile = false;
		
		try
		(
			FileInputStream carFile = new FileInputStream(fileName);
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
			System.out.println("\nThere was a problem reading file.");
		}
	}
}


























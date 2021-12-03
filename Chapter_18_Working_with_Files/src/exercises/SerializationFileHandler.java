package exercises;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationFileHandler 
{
	/**
	 * Writes SerializableCar objects in a list to a file.
	 * 
	 * @param carList A list of SerializableCar objects.
	 * @param fileName A string represents a file name.
	 */
	public void writeRecords(List<SerializableCar> carList, String fileName)
	{
		try
		(
			FileOutputStream carFile = new FileOutputStream(fileName);
			ObjectOutputStream carStream = new ObjectOutputStream(carFile);
		)
		{
			for (SerializableCar item : carList)
			{
				if (item != null)
				{
					carStream.writeObject(item);
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem wrting the file.");
		}
	}
	
	/**
	 * 
	 * @param fileName A string represents a file name.
	 * @param carList A list of SerializableCar objects.
	 */
	public void readRecords(String fileName, List<SerializableCar> carList)
	{
		SerializableCar tempCar;
		boolean endOfFile = false;
		
		try
		(
			FileInputStream carFile = new FileInputStream(fileName);
			ObjectInputStream carStream = new ObjectInputStream(carFile);
		)
		{
			while (endOfFile != true)
			{
				try
				{
					tempCar = (SerializableCar) carStream.readObject();
					carList.add(tempCar);
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
		catch (ClassNotFoundException e)
		{
			System.out.println("\nTry to read object of unknown class.");
		}
		catch (IOException e) 
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
}



































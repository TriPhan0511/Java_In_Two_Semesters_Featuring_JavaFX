package exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class BinaryFileHandler 
{
	/**
	 * Writes the information of Car objects in a list to a binary file.
	 * @param carList A list of Car objects.
	 * @param fileName A string represents a file name.
	 */
	public void writeRecords(List<Car> carList, String fileName)
	{
		try
		(
			FileOutputStream carFile = new FileOutputStream(fileName);
			DataOutputStream carStream = new DataOutputStream(carFile);
		)
		{
			for (Car item : carList)
			{
				if (item != null)
				{
					carStream.writeUTF(item.getRegistration());
					carStream.writeUTF(item.getMake());
					carStream.writeDouble(item.getPrice());
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem writing the file.");
		}
	}
	
	/**
	 * Reads the information of Car objects in a list,
	 * then creates Car objects from those information,
	 * finally adds those Car objects to a list.
	 * @param fileName A string represents a file name.
	 * @param carList A list of Car objects.
	 */
	public void readRecords(String fileName, List<Car> carList)
	{
		String tempReg;
		String tempMake;
		double tempDoublePrice;
		boolean endOfFile = false;
		
		try
		(
			FileInputStream carFile = new FileInputStream(fileName);
			DataInputStream carStream = new DataInputStream(carFile); 
		)
		{
			while (endOfFile != true)
			{
				try
				{
					tempReg = carStream.readUTF();
					tempMake = carStream.readUTF();
					tempDoublePrice = carStream.readDouble();
					carList.add(new Car(tempReg, tempMake, tempDoublePrice));
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
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
}




























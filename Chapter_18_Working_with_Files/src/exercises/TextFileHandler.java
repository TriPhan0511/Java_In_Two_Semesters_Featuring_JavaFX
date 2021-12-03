package exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

// Sample Cars.txt:

// Registration Number: A297 ABF
// Make: Ford
// Price: 4560.0

// Registration Number: U423 GAX
// Make: Vauxhall
// Price: 5999.0

// Registration Number: T945 KMN
// Make: Citroen
// Price: 3795.0

public class TextFileHandler 
{
	/**
	 * Writes the information of all Car objects in a list to a text file.
	 * 
	 * @param carList A list of Car objects.
	 * @param fileName A string represents a text file name.
	 */
	public void writeRecords(List<Car> carList, String fileName)
	{
		
		try
		(
			FileWriter carFile = new FileWriter(fileName);
			PrintWriter carStream = new PrintWriter(carFile); 
		)
		{
			for (Car car : carList)
			{
				if (car != null)
				{
					carStream.println("Registration Number: " + car.getRegistration());
					carStream.println("Make: " + car.getMake());
					carStream.println("Price: " + car.getPrice());
					carStream.println();
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem writing the file.");
		}
	}
	
	/**
	 * Reads all records from a text file,
	 * then, creates Car objects,
	 * finally, add those Car objects to a list.
	 * 
	 * @param fileName A string represents a text file name.
	 * @param carList A list of Car objects.
	 */
	public void readRecords(String fileName, List<Car> carList)
	{
		try
		(
			FileReader carFile = new FileReader(fileName);
			BufferedReader carStream = new BufferedReader(carFile);
		)
		{
			String tempReg;
			String tempMake;
			String tempStringPrice;
			double tempDoublePrice;
			
			tempReg = carStream.readLine(); // Read the first line of the file
			while (tempReg != null)
			{
				tempReg = tempReg.substring(tempReg.indexOf(":") + 2);
				tempMake = carStream.readLine();
				tempMake = tempMake.substring(tempMake.indexOf(":") + 2);
				tempStringPrice = carStream.readLine();
				tempStringPrice = tempStringPrice.substring(tempStringPrice.indexOf(":") + 2);
				tempDoublePrice = Double.parseDouble(tempStringPrice);
				carList.add(new Car(tempReg, tempMake, tempDoublePrice));
				carStream.readLine();
				tempReg = carStream.readLine();
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
	
	/**
	 * Reads character by character from a text file,
	 * then prints out them to the console.
	 * 
	 * @param fileName A string represents a text file name.
	 */
	public void readCharacterByCharacter(String fileName)
	{
		try
		(
			FileReader carFile = new FileReader(fileName);
			BufferedReader carStream = new BufferedReader(carFile);
		)
		{
			StringBuilder builder = new StringBuilder();
			int ch;
			char c;
			
//			Reads character by character from the begin of the file
//			to the end of file. 
//			(The read method will return -1 if
//			the end-of-file marker is reached)
			while ((ch = carStream.read()) != -1)
			{
				c = (char) ch;
				builder.append(c);
			}
			
//			Prints out the content of the file to the console
			System.out.println();
			System.out.println(builder.toString().trim());
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



























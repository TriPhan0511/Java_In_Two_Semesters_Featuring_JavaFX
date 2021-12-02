package diy.studentmanager_obect_serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.List;

/**
 * This demonstrates serialization which is the process of converting
 * an object into a stream of data suitable for storage on a disk.
 * 
 * @version 1.0 2021-12-01
 * @author Tri Phan
 *
 */
public class StudentFileHandler 
{
	/**
	 * Write Student objects in a list to a file (*.dat). 
	 * @param studentList A list of Student objects.
	 * @param fileName A string represents a file name.
	 */
	public void writeList(List<Student> studentList, String fileName)
	{
		try
		(
			FileOutputStream studentFile = new FileOutputStream(fileName);
			ObjectOutputStream studentStream = new ObjectOutputStream(studentFile); 
		)
		{
			for (Student item : studentList)
			{
				studentStream.writeObject(item);
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
	
	/**
	 * Read from a file. 
	 * @param studentList A list of Student objects.
	 * @param fileName A string represents a file name.
	 */
	public void readList(List<Student> studentList, String fileName)
	{
		try
		(
			FileInputStream studentFile = new FileInputStream(fileName);
			ObjectInputStream studentStream = new ObjectInputStream(studentFile);
		)
		{
			Student tempStudent;
			boolean endOfFile = false;
			tempStudent = (Student) studentStream.readObject();
			while (endOfFile != true)
			{
				try
				{
					studentList.add(tempStudent);
					tempStudent = (Student) studentStream.readObject();
				}
				catch (EOFException e) {
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
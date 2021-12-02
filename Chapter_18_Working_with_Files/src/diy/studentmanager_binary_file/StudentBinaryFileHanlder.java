package diy.studentmanager_binary_file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

// Sample Students.bin:
// s1 Alex Ferguson Sanchez 5.5
// s2 Brad Pitt 8.5

public class StudentBinaryFileHanlder 
{
	public void writeList(List<Student> studentList, String fileName)
	{
		try
		(
			FileOutputStream studentFile = new FileOutputStream(fileName);
			DataOutputStream studentStream = new DataOutputStream(studentFile); 
		)
		{
			for (Student item : studentList)
			{
				if (item != null)
				{
					String s = item.getStudentID() 
							+ " "
							+ item.getName()
							+ " "
							+ item.getScore()
							+ "\n";
					studentStream.writeUTF(s);
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem writing the file.");
		}
	}
	
	public void readList(List<Student> studentList, String fileName)
	{
		try
		(
				FileInputStream studentFile = new FileInputStream(fileName);
				DataInputStream studentStream = new DataInputStream(studentFile);
		)
		{
			String s;
			boolean endOfFile =  false;
			
			s = studentStream.readUTF();
			while (endOfFile != true)
			{
				try
				{
					System.out.println(s);
					studentList.add(getStudent(s));
					s = studentStream.readUTF();
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
			System.out.println("\nThere was a problem reading the file.");
		}
	}
	
	/**
	 * Parse a string to a Student object.
	 * (A sample string: "s1 Alex Ferguson Sanchez 5.5")
	 * @param s
	 * @return
	 */
	private Student getStudent(String s)
	{
		try
		{
			String tempStudentID;
			String tempName;
			String tempStringScore;
			double tempDoubleScore;
			
			int firstSpace = s.indexOf(" ");
			int lastSpace = s.lastIndexOf(" ");
			tempStudentID = s.substring(0, firstSpace);
			tempName = s.substring(firstSpace + 1, lastSpace);
			tempStringScore = s.substring(lastSpace + 1);
			tempDoubleScore = Double.parseDouble(tempStringScore);

			return new Student(tempStudentID, tempName, tempDoubleScore);
		}
		catch (Exception e)
		{
			return null;
		}
	}
}


























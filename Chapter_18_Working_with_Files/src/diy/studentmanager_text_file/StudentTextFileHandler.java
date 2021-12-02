package diy.studentmanager_text_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentTextFileHandler 
{
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
	
	/**
	 * Use FileRead and BufferedReader objects to read line by line from a text file.
	 * @param students A list of Student object.
	 * @param fileName A string represents a file name.
	 */
	public void readLineByLine(List<Student> students, String fileName)
	{
		try
		(
			FileReader studentFile = new FileReader(fileName);
			BufferedReader studentStream = new BufferedReader(studentFile);
		)
		{
			String s;
			while ((s = studentStream.readLine()) != null)
			{
				students.add(getStudent(s));
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nThere is currently no records.");
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}
	
	/**
	 * Use FileReader and BufferedReader objects to read 
	 * character by character from a text file.
	 * @param students A list of Student object.
	 * @param fileName A string represents a file name.
	 */
	public void readCharacterByCharacter(List<Student> students, String fileName)
	{
		try
		(
			FileReader studentFile = new FileReader(fileName);
			BufferedReader studentStream = new BufferedReader(studentFile);
		)
		{
			String s = "";
			int ch;
			char c;
			
			while (true)
			{
				ch = studentStream.read(); // The method return -1 if the end-of-file is reached
				c = (char) ch;
				if ((c != '\n') && (ch != -1))
				{
					s += c;
				}
				else
				{
					students.add(getStudent(s));
					s = "";
				}
				if (ch == -1) // When meets end-of-file marker
				{
					break;
				}
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nThere is currently no records.");
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
	}

	/**
	 * Use FileWriter and PrintWriter objects to write Student objects
	 * from a list to a text file. (line by line)
	 * @param students A list of Student object.
	 * @param fileName A string represents a file name.
	 */
	public void writeLineByLine(List<Student> studentList, String fileName)
	{
		try
		(
			FileWriter studentFile = new FileWriter(fileName);
			PrintWriter studentStream = new PrintWriter(studentFile);
		)
		{
			for (Student item : studentList)
			{
				String s;
				if (item != null)
				{
					s = item.getStudentID() 
							+ " "
							+ item.getName()
							+ " "
							+ item.getScore();
					studentStream.println(s);
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem writing the file.");
		}
	}
}

























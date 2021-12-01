package diy.studentmanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentTextFileHandler 
{
	public static void main(String[] args) 
	{
		final String FILE_NAME = "src/diy/studentmanager/Students.txt";
		List<Student> students = new ArrayList<>();
		
		StudentTextFileHandler handler = new StudentTextFileHandler();
		handler.readCharacterByCharacter(students, FILE_NAME);
//		handler.readLineByLine(students, FILE_NAME);
		
//		List all students in the list
		handler.listAll(students);
	}
	
	private void listAll(List<Student> students)
	{
		for (Student s : students)
		{
			if ( s != null)
			{
				System.out.printf("%s %s %.1f\n",
						s.getStudentID(),
						s.getName(),
						s.getDouble());
			}
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
	
	/**
	 * Use a BufferedReader object to read line by line in a text file.
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
	 * Use a BufferedReader object to read character by character in a text file.
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
			
//			Solution 1:
			while (true)
			{
				ch = studentStream.read();
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
			
//			Solution 2:
//			while ((ch = studentStream.read()) != -1)
//			{
//				c = (char) ch;
//				if (c != '\n')
//				{
//					s += c;
//				}
//				else
//				{
//					students.add(getStudent(s));
//					s = "";
//				}
//			}
//			students.add(getStudent(s));
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
}

























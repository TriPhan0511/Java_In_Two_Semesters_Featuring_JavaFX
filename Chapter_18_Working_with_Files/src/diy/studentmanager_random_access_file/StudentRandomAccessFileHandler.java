package diy.studentmanager_random_access_file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StudentRandomAccessFileHandler 
{
	private static final int STUDENT_SIZE = 32;
	
	/**
	 * Gets a record at a specified position in the file.
	 * @param position An integer indicates the record will be taken.
	 * @param fileName A string represents a file name.
	 * @return A Student object or null.
	 */
	public Student readRecord(int position, String fileName)
	{
		Student tempStudent = null;
		String tempStudentID;
		String tempStudentName;
		double tempScore;
		
		try
		(
			RandomAccessFile studentFile = new RandomAccessFile(fileName, "r");
		)
		{
			studentFile.seek((position - 1) * STUDENT_SIZE);
			tempStudentID = studentFile.readUTF();
			tempStudentName = studentFile.readUTF();
			tempScore = studentFile.readDouble();
			tempStudent = new Student(tempStudentID, tempStudentName, tempScore);
		}
		catch (IOException e)
		{
			System.out.println("\nThere was a problem reading the file.");
		}
		return tempStudent;
	}
	
	/**
	 * Write a "student" record to the file.
	 * @param student A Student object.
	 * @param fileName A string represents a file name.
	 */
	public void writeRecord(Student student, String fileName)
	{
		if (student != null)
		{
			try
			(
				RandomAccessFile studentFile = new RandomAccessFile(fileName, "rw");
			)
			{
				studentFile.seek(studentFile.length());
				studentFile.writeUTF(student.getStudentID());
				studentFile.writeUTF(student.getName());
				studentFile.writeDouble(student.getScore());
			}
			catch (IOException e)
			{
				System.out.println("\nThere was a problem writing the file.");
			}
		}
	}
	
	/**
	 * Gets a string whose length is less than or equal to 10.
	 * @param prompt A string which used to ask the user enter data.
	 * @return A string whose length is less than or equal to 10.
	 */
	public String getTenCharacters(String prompt)
	{
		String s;
		while (true)
		{
			System.out.print(prompt);
			s = EasyScanner.nextString();
			if (s.length() > 10)
			{
				System.out.println("Ten characters only - Please re-enter.");
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

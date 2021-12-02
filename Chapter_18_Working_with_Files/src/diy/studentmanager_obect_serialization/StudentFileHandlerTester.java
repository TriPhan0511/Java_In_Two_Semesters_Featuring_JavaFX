package diy.studentmanager_obect_serialization;

import java.util.ArrayList;
import java.util.List;

public class StudentFileHandlerTester 
{
	public static void main(String[] args)
	{
		final String FILE_NAME = "src/diy/studentmanager_obect_serialization/Students.dat";
		StudentFileHandler fileHandler = new StudentFileHandler();
		StudentListHandler listHandler = new StudentListHandler();
		List<Student> studentList = new ArrayList<>();
		
//		Read the file and add data to the list when the program starts
		fileHandler.readList(studentList, FILE_NAME);
		
//		Menu option
		System.out.println("\nStudent File Hanlder Tester.");
		System.out.println("1. Add a new student");
		System.out.println("2. Remove a student");
		System.out.println("3. List all students");
		System.out.println("4. Quit");
		
		char choice;
		do
		{
			System.out.print("\nEnter you choice: ");
			choice = EasyScanner.nextChar();
			switch (choice)
			{
			case '1':
				listHandler.addStudent(studentList);
				break;
				
			case '2':
				listHandler.removeStudent(studentList);
				break;
				
			case '3':
				listHandler.listAll(studentList);
				break;
				
			case '4':
				fileHandler.writeList(studentList, FILE_NAME);
				break;
				
			default:
				System.out.println("\nPlease choose a number from 1 - 4.");
			}
		} while (choice != '4');
		
	}
}





























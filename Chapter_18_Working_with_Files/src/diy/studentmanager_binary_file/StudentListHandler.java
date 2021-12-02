package diy.studentmanager_binary_file;

import java.util.List;

/**
 * Some utility methods which are handle a list of Students:
 * 1. Adds a new Student.
 * 2. Removes a specified Student.
 * 3. Lists all of Students in the list.
 * 
 * @version 2.0 2021-12-01
 * @author Tri Phan
 *
 */
public class StudentListHandler 
{
	/**
	 * Adds a new Student object to a list.
	 * @param studentList A list of Students.
	 */
	public void addStudent(List<Student> studentList)
	{
		String temStudentID;
		String temName;
		double temSocre;
		
		System.out.print("\nEnter the student id: ");
		temStudentID = EasyScanner.nextString();
		System.out.print("Enter the student name: ");
		temName = EasyScanner.nextString();
		System.out.print("Enter the student score: ");
		temSocre = EasyScanner.nextDouble();
		
		studentList.add(new Student(temStudentID, temName, temSocre));
	}
	
	/**
	 * Remove a specified Student in a list of Students.
	 * @param studentList A list of Students.
	 */
	public void removeStudent(List<Student> studentList)
	{
		if (studentList.size() == 0)
		{
			System.out.println("\nThere is no student in the list.");
		}
		else
		{
			while (true)
			{
				System.out.print("\nEnter position of the student which be removed: ");
				int pos = EasyScanner.nextInt();
				if (pos <= 0 || pos > studentList.size())
				{
					System.out.println("The position should be between 1 and " 
							+ (studentList.size()));
					continue;
				}
				studentList.remove(pos - 1);
				break;
			}
		}
	}
	
	/**
	 * Prints out all of Students in a list.
	 * @param studentList A list of Students.
	 */
	public void listAll(List<Student> studentList)
	{
		if (studentList.size() == 0)
		{
			System.out.println("\nThere is no student in the list.");
		}
		else
		{
			System.out.println("\nStudents in the list");
			for (Student item :  studentList) 
			{
				if (item != null)
				{
					System.out.printf("%s %s %.1f\n",
							item.getStudentID(),
							item.getName(),
							item.getScore());
				}
			}
		}
	}
}























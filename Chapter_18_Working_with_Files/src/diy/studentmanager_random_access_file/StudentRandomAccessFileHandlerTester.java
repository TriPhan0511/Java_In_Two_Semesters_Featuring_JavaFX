package diy.studentmanager_random_access_file;

public class StudentRandomAccessFileHandlerTester 
{
	private static final String FILE_NAME = 
			"src/diy/studentmanager_random_access_file/Students.rand";
	private static StudentRandomAccessFileHandler fileHandler = new StudentRandomAccessFileHandler();
	
	public static void main(String[] args)
	{
		char choice;
		do
		{
			System.out.println("\nStudent Random Access File Tester");
			System.out.println("1. Add a new record");
			System.out.println("2. Display a record");
			System.out.println("3. Quit");
			
			System.out.print("\nEnter your choice: ");
			choice = EasyScanner.nextChar();
			switch (choice)
			{
				case '1':
					addRecord();
					break;
				case '2':
					displayRecord();
					break;
				case '3':
					break;
				default:
					System.out.println("\nPlease enter from 1 - 3.");
			}
		} while (choice != '3');
	}
	
	private static void addRecord()
	{
		Student tempStudent;
		String tempStudentID;
		String tempStudentName;
		double tempScore;
		
		tempStudentID = fileHandler.getTenCharacters("\nEnter the student ID: ");
		tempStudentName = fileHandler.getTenCharacters("Enter the student name: ");
		System.out.print("Enter the student score: ");
		tempScore = EasyScanner.nextDouble();
		tempStudent = new Student(tempStudentID, tempStudentName, tempScore);
		
		fileHandler.writeRecord(tempStudent, FILE_NAME);
	}
	
	private static void displayRecord()
	{
		int position;
		Student tempStudent;
		System.out.print("\nEnter the position of the record will be displayed: ");
		position = EasyScanner.nextInt();
		tempStudent = fileHandler.readRecord(position, FILE_NAME);
		if (tempStudent != null)
		{
			System.out.println(
					tempStudent.getStudentID().trim()
					+ " "
					+ tempStudent.getName().trim()
					+ " "
					+ tempStudent.getScore());
		}
		else
		{
			System.out.println("Invalid position.");
		}
	}
}





























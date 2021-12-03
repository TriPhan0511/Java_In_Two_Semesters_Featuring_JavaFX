package diy.studentmanager_random_access_file;

/**
 * This class represents a student.
 * 
 * @version 1.0 2021-12-01
 * @author Tri Phan
 *
 */
public class Student
{
	private String studentID;
	private String name;
	private double score;
	
	public Student(String studentID, String name, double score)
	{
		this.studentID = studentID;
		this.name = name;
		this.score = score;
	}
	
	public String getStudentID()
	{
		return this.studentID;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getScore()
	{
		return this.score;
	}
}

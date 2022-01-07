package com.triphan.exercises.courseApp;

public class Student
{
  private String studentNumber;
  private String studentName;
  private int markForMaths;
  private int markForEnglish;
  private int markForScience;
  private static double fee = 30000.0;

  public Student(String number, String name)
  {
    studentNumber = number;
    studentName = name;
    markForMaths = -999;
    markForEnglish = -999;
    markForScience = -999;
  }

  public String getStudentNumber()
  {
    return studentNumber;
  }

  public String getStudentName()
  {
    return studentName;
  }

  public int getMarkForMaths()
  {
    return markForMaths;
  }

  public int getMarkForEnglish()
  {
    return markForEnglish;
  }

  public int getMarkForScience()
  {
    return markForScience;
  }

  public void enterMarks(int markForMaths, int markForEnglish, int markForScience)
  {
    this.markForMaths = markForMaths;
    this.markForEnglish = markForEnglish;
    this.markForScience = markForScience;
  }

  public double calculateAverageMark()
  {
    if (markForMaths == -999
        || markForEnglish == -999
        || markForScience == -999)
    {
      return -999.0;
    }
    return (markForMaths + markForEnglish + markForScience) / 3.0;
  }

  /**
   * Display the details of a specified student.
   */
  public void displayStudentDetails()
  {
    System.out.println();
    System.out.println("Student number: " + getStudentNumber());
    System.out.println("Student name: " + getStudentName());
    int mark = getMarkForMaths();
    if (mark == -999)
    {
      System.out.println("Mark for Maths: Not known");
    }
    else
    {
      System.out.println("Mark for Maths: " + mark);
    }
    mark = getMarkForEnglish();
    if (mark == -999)
    {
      System.out.println("Mark for English: Not known");
    }
    else
    {
      System.out.println("Mark for English: " + mark);
    }
    mark = getMarkForScience();
    if (mark == -999)
    {
      System.out.println("Mark for Science: Not known");
    }
    else
    {
      System.out.println("Mark for Science: " + mark);
    }
    double averageMark = calculateAverageMark();
    if (averageMark == -999.0)
    {
      System.out.println("Average mark: Not Known");
    }
    else
    {
      System.out.printf("The average mark: %.1f", averageMark);
    }
    System.out.printf("Fee: %.2f", getFee());
  }

  public static double getFee()
  {
    return fee;
  }

  public void setFee(double fee)
  {
    Student.fee = fee;
  }
}



























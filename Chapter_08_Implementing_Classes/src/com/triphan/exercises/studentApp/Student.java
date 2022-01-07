package com.triphan.exercises.studentApp;

public class Student
{
//  Instance attributes
  private String studentNumber;
  private String studentName;
  private int markForMaths;
  private int markForEnglish;
  private int markForScience;

//  Class attribute
  private static double fee;

//  The constructor
  public Student(String number, String name)
  {
    studentNumber = number;
    studentName = name;
    markForMaths = -999;
    markForEnglish = -999;
    markForScience = -999;
    fee = 3000.0;
  }

//  Methods read the attributes
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

  public static double getFee()
  {
    return fee;
  }

  //  Method sets the fee attribute
  public static void setFee(double fee)
  {
    Student.fee = fee;
  }

//  Enter marks for 3 subjects: Maths, English and Science
  public void enterMarks(int markForMaths, int markForEnglish, int markForScience)
  {
    this.markForMaths = markForMaths;
    this.markForEnglish = markForEnglish;
    this.markForScience = markForScience;
  }

  //  Calculate the average mark
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
}

























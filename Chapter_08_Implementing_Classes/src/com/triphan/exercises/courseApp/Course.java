package com.triphan.exercises.courseApp;

import java.util.ArrayList;

public class Course
{
  private ArrayList<Student> list = new ArrayList<>();

//  Find the index of a particular student within the list.
  private int search(String studentNumber)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getStudentNumber().equals(studentNumber))
      {
        return i;
      }
    }
    return -999;
  }

  /**
   * Add a new student to the list.
   * @param studentNumber A string representing a student number.
   * @param studentName A string representing a student name.
   * @return true if adding successfully, otherwise, return false.
   */
  public boolean addStudent(String studentNumber, String studentName)
  {
    int index = search(studentNumber);
    if (index != -999)
    {
      return false;
    }
    list.add(new Student(studentNumber, studentName));
    return true;
  }

  /**
   * Get a particular student within the list.
   * @param studentNumber A string representing a student number.
   * @return A Student object or null.
   */
  public Student getItem(String studentNumber)
  {
    int index = search(studentNumber);
    if (index == -999)
    {
      return null;
    }
    return list.get(index);
  }

  /**
   * Display the details of a specified student within the list.
   * @param studentNumber A string representing a student number.
   */
  public void displayStudent(String studentNumber)
  {
    Student student = getItem(studentNumber);
    if (student == null)
    {
      System.out.println("No such student.");
    }
    else
    {
      student.displayStudentDetails();
    }
  }

  /**
   * Display the details of all students within the list
   */
  public void displayListOfStudents()
  {
    if (list.size() == 0)
    {
      System.out.println("Current there is not any student.");
    }
    else
    {
      for (Student item : list)
      {
        item.displayStudentDetails();
      }
    }
  }

  /**
   * Update marks for a particular student in the list.
   * @param studentNumber A string representing a student number.
   * @param markForMaths An integer representing the Maths' mark.
   * @param markForEnglish An integer representing the English's mark.
   * @param markForScience An integer representing the Science's mark.
   * @return true if updating successfully, otherwise, return false.
   */
  public boolean updateMarks(String studentNumber,
                             int markForMaths,
                             int markForEnglish,
                             int markForScience)
  {
    Student student = getItem(studentNumber);
    if (student == null)
    {
      return false;
    }
    student.enterMarks(markForMaths, markForEnglish, markForScience);
    return true;
  }

  /**
   * Remove a student from the list.
   * @param studentNumber A string representing a student number.
   * @return true if removing successfully, otherwise, return false.
   */
  public boolean removeStudent(String studentNumber)
  {
    int index = search(studentNumber);
    if (index == -999)
    {
      return false;
    }
    list.remove(index);
    return true;
  }
}
































package com.triphan.exercises.studentApp;

import com.triphan.exercises.bankApp.BankAccount;
import com.triphan.exercises.easyScanner.EasyScanner;

import java.util.ArrayList;

public class StudentTester
{
  public static void main(String[] args)
  {
    ArrayList<Student> list = new ArrayList<>();
    char choice;
    do
    {
      System.out.println("1. Add a new student.");
      System.out.println("2. Display the information of a student.");
      System.out.println("3. Enter marks for a student.");
      System.out.println("4. Display the information of all students.");
      System.out.println("5. Exit.");
      System.out.println();
      System.out.print("Enter choice [1-5]: ");
      choice = EasyScanner.nextChar();
      switch (choice)
      {
        case '1':
          addStudent(list);
          break;
        case '2':
          displayStudent(list);
//          break;
//        case '3':
//          option3(list);
        case '4':
          displayListOfStudents(list);
          break;
        case '5':
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '5');
  }

  /**
   * Add a student to an array list.
   * @param number
   * @param name
   * @param list
   * @return
   */
  private static boolean addStudent(String number, String name, ArrayList<Student> list)
  {
    int index = search(number, list);
    if (index == -999)
    {
      return false;
    }
    list.add(new Student(number, name));
    return true;
  }

  /**
   * Get the number and name of a student from user,
   * then add this student to a list.
   * @param list An array list contains Student objects.
   */
  private static void addStudent(ArrayList<Student> list)
  {
    System.out.print("Enter a student number: ");
    String number = EasyScanner.nextString();
    System.out.println("Enter a student name: ");
    String name = EasyScanner.nextString();
    list.add(new Student(number, name));
  }

  /**
   * Find the index of a student within a list.
   * @param studentNumber A string representing a student number.
   * @param list An array list contains Student objects.
   * @return Return the index of the student if the student contained in the list.
   * Otherwise, return -999.
   */
  private static int search(String studentNumber, ArrayList<Student> list)
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
   * Get a particular Student object in a list.
   * @param studentNumber A string representing a student number.
   * @param list An array list contains Student objects.
   * @return A Student object if it contained in the list,
   * otherwise, returns null.
   */
  private static Student getItem(String studentNumber, ArrayList<Student> list)
  {
    int index = search(studentNumber, list);
    if (index == -999)
    {
      return null;
    }
    return list.get(index);
  }

  /**
   * Find a particular student in a list based on student number which entered by user,
   * if the student is contained in the list, display the student's information.
   * @param list An array list of Student objects.
   */
  private static void displayStudent(ArrayList<Student> list)
  {
    System.out.print("Enter a student number: ");
    String number = EasyScanner.nextString();
    Student student = getItem(number, list);
    if (student == null)
    {
      System.out.println("No such student.");
    }
    else
    {
      displayStudent(student);
    }
  }

  /**
   * Display the information of a specified student.
   * @param student A Student object.
   */
  private static void displayStudent(Student student)
  {
    if (student == null)
    {
      System.out.println("No such student");
    }
    else
    {
      System.out.println("Number: " + student.getStudentNumber());
      System.out.println("Name: " + student.getStudentName());
      int markForMaths = student.getMarkForMaths();
      if (markForMaths == -999)
      {
        System.out.println("Mark for Maths: Not Known");
      }
      else
      {
        System.out.println("Mark for Maths: " + markForMaths);
      }
      int markForEnglish = student.getMarkForEnglish();
      if (markForEnglish == -999)
      {
        System.out.println("Mark for English: Not Known");
      }
      else
      {
        System.out.println("Mark for English: " + markForEnglish);
      }
      int markForScience = student.getMarkForScience();
      if (markForScience == -999)
      {
        System.out.println("Mark for Science: Not Known");
      }
      else
      {
        System.out.println("Mark for Science:" + markForScience);
      }
      double averageMark = student.calculateAverageMark();
      if (averageMark == 999.0)
      {
        System.out.println("Average mark: Not Known");
      }
      else
      {
        System.out.printf("Average mark: %.1f", averageMark);
      }
      System.out.println("Fee: " + Student.getFee());
    }

  }

  private static void displayListOfStudents(ArrayList<Student> list)
  {
    for (Student item : list)
    {
      displayStudent(item);
    }
  }
}



























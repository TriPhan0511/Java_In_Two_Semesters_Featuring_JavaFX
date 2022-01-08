package com.triphan.exercises.courseApp;

import com.triphan.exercises.easyScanner.EasyScanner;

public class CourseApplication
{
  public static void main(String[] args)
  {
    Course course = new Course();
    char choice;
    do
    {
      System.out.println();
      System.out.println("1. Add a student.");
      System.out.println("2. Display a student's details.");
      System.out.println("3. Display all students' details.");
      System.out.println("4. Display fee of the course.");
      System.out.println("5. Update marks for a student.");
      System.out.println("6. Update fee of the course.");
      System.out.println("7. Remove a student.");
      System.out.println("8. Exit.");
      System.out.println();
      System.out.print("Enter choice [1-8]: ");
      choice = EasyScanner.nextChar();
      switch (choice)
      {
        case '1':
          addStudent(course);
          break;
        case '2':
          displayStudent(course);
          break;
        case '3':
          displayListOfStudents(course);
          break;
        case '4':
          displayFee(course);
          break;
        case '5':
          updateMarks(course);
          break;
        case '6':
          updateFee(course);
          break;
        case '7':
          removeStudent(course);
          break;
        case '8':
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '8');
  }

  private static void addStudent(Course course)
  {
    System.out.print("Enter a student number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter a student name: ");
    String name = EasyScanner.nextString();
    if (course.addStudent(number, name))
    {
      System.out.println("A student added.");
    }
    else
    {
      System.out.println("This student number already exists.");
    }
  }

  private static void displayStudent(Course course)
  {
    System.out.print("Enter a student number: ");
    String number = EasyScanner.nextString();
    course.displayStudent(number);
  }

  private static void displayListOfStudents(Course course)
  {
    course.displayListOfStudents();
  }

  private static void displayFee(Course course)
  {
    System.out.println("Course fee: " + course.getCourseFee());
  }

  private static void updateMarks(Course course)
  {
    System.out.print("Enter a student number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter a mark for Maths: ");
    int markForMaths = EasyScanner.nextInt();
    System.out.print("Enter a mark for English: ");
    int markForEnglish = EasyScanner.nextInt();
    System.out.print("Enter a mark for Science: ");
    int markForScience = EasyScanner.nextInt();
    if (course.updateMarks(number, markForMaths, markForEnglish, markForScience))
    {
      System.out.println("Marks was updated.");
    }
    else
    {
      System.out.println("This student number does not exist.");
    }
  }

  private static void updateFee(Course course)
  {
    System.out.print("Enter a fee for this course: ");
    double fee = EasyScanner.nextDouble();
    course.setCourseFee(fee);
  }

  private static void removeStudent(Course course)
  {
    System.out.print("Enter a student number: ");
    String number = EasyScanner.nextString();
    if (course.removeStudent(number))
    {
      System.out.println("A student removed.");
    }
    else
    {
      System.out.println("This student number does not exist.");
    }
  }
}



























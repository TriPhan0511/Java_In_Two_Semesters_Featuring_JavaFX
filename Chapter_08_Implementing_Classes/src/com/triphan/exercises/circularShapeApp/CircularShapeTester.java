package com.triphan.exercises.circularShapeApp;

import com.triphan.exercises.easyScanner.EasyScanner;

// Exercise: chapter 08 Implementing classes / exercise 01
public class CircularShapeTester
{
  public static void main(String[] args)
  {
    CircularShape circle = new CircularShape(0.0);
    char choice;
    do
    {
      System.out.println();
      System.out.println("1. Enter a radius value");
      System.out.println("2. Calculate the area");
      System.out.println("3. Calculate the circumference");
      System.out.println("4. Calculate the diameter");
      System.out.println("5. Exit");
      System.out.println();
      System.out.print("Enter choice [1-5]: ");
      choice = EasyScanner.nextChar();
      switch (choice)
      {
        case '1':
          option1(circle);
          break;
        case '2':
          option2(circle);
          break;
        case '3':
          option3(circle);
          break;
        case '4':
          option4(circle);
          break;
        case '5':
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '5');
  }

  private static void option1(CircularShape circle)
  {
//    Gets radius value from user
    double radius;
    do
    {
      System.out.print("Enter a radius value: ");
      radius = EasyScanner.nextDouble();
      if (radius <= 0)
      {
        System.out.println("The radius value should be greater than zero.");
      }
    } while (radius <= 0);
//    Sets the radius value for the circle
    circle.setRadius(radius);
  }

//  Calculates the area
  private static void option2(CircularShape circle)
  {
    if (circle == null || circle.getRadius() == 0.0)
    {
      System.out.println("Please enter the radius value first.");
    }
    else
    {
      System.out.println("Area = " + circle.calculateArea());
    }

//    Reset the radius value and display the new value of the area
    if (resetRadius(circle))
    {
      System.out.println("Current details of the circle:");
      displayCircle(circle);
    }
  }

//  Calculates the circumference
  private static void option3(CircularShape circle)
  {
    if (circle == null || circle.getRadius() == 0.0)
    {
      System.out.println("Please enter the radius first.");
    }
    else
    {
      System.out.printf("Circumference = %.1f", circle.calculateCircumference());
    }

//    Reset the radius value and display the new value of the circumference
    if (resetRadius(circle))
    {
      System.out.println("Current details of the circle:");
      displayCircle(circle);
    }
  }

  //  Calculates the diameter
  private static void option4(CircularShape circle)
  {
    if (circle == null || circle.getRadius() == 0.0)
    {
      System.out.println("Please enter the radius first.");
    }
    else
    {
      System.out.println("Diameter = " + circle.calculateDiameter());
    }

//    Reset the radius value and display the new value of the diameter
    if (resetRadius(circle))
    {
      System.out.println("Current details of the circle:");
      displayCircle(circle);
    }
  }

  private static boolean resetRadius(CircularShape circle)
  {
    System.out.println();
    System.out.print("Do you want to enter a radius value (y/n)? ");
    char choice = EasyScanner.nextChar();
    if (choice == 'y' || choice == 'Y')
    {
      option1(circle);
      return true;
    }
    return false;
  }

  private static void displayCircle(CircularShape circle)
  {
    System.out.printf("Radius = %.1f", circle.getRadius());
    System.out.println();
    System.out.printf("Diameter = %.1f", circle.calculateDiameter());
    System.out.println();
    System.out.printf("Area = %.1f", circle.calculateArea());
    System.out.println();
    System.out.printf("Circumference = %.1f", circle.calculateCircumference());
  }
}




























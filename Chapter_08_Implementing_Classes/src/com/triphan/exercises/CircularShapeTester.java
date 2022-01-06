package com.triphan.exercises;

public class CircularShapeTester
{
  private static CircularShape circle;
  public static void main(String[] args)
  {
//    CircularShape circle;
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
//        case '3':
//          option3(circle);
//          break;
//        case '4':
//          option4(circle);
//          break;
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
    circle = new CircularShape(radius);
  }

  private static void option2(CircularShape circle)
  {
    if (circle == null)
    {
      System.out.println("Please enter the radius value first.");
    }
    else
    {
      System.out.println("Area = " + circle.calculateArea());
    }
  }
}




























package com.triphan.exercises;

public class OblongTester
{
  public static void main(String[] args)
  {
//    Oblong oblong1 = new Oblong(3.0, 4.0);
//    Oblong oblong2 = new Oblong(5.0, 6.0);
//    System.out.println("The area of oblong1 is " + oblong1.calculateArea());
//    System.out.println("The area of oblong2 is " + oblong2.calculateArea());

    Oblong o1, o2;
    double length, height;
    System.out.print("Enter the length of the oblong 1: ");
    length = EasyScanner.nextDouble();
    System.out.print("Enter the height of the oblong 1: ");
    height = EasyScanner.nextDouble();
    o1 = new Oblong(length, height);

    System.out.print("Enter the length of the oblong 2: ");
    length = EasyScanner.nextDouble();
    System.out.print("Enter the height of the oblong 2: ");
    height = EasyScanner.nextDouble();
    o2 = new Oblong(length, height);

    System.out.println("The area of the oblong1 is " + o1.calculateArea());
    System.out.println("The area of the oblong2! is " + o2.calculateArea());
  }
}

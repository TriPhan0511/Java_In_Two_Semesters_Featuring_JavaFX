package com.triphan.exercises.circularShapeApp;

// Exercise: chapter 08 Implementing classes / exercise 01
public class CircularShape
{
  private double radius;

//  public CircularShape(){}

  public CircularShape(double radius)
  {
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double calculateArea()
  {
    return 3.14 * radius * radius;
  }

  public double calculateCircumference()
  {
    return 2 * 3.14 * radius;
  }

  public double calculateDiameter()
  {
    return 2 * radius;
  }
}






























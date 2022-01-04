package com.triphan.exercises;

public class Oblong
{
  private double length;
  private double height;

  public Oblong()
  {}

  public Oblong(double length, double height)
  {
    this.length = length;
    this.height = height;
  }

  public double getLength()
  {
    return length;
  }

  public double getHeight()
  {
    return height;
  }

//  public void setWidth(double width)
//  {
//    this.width = width;
//  }
//
//  public void setHeight(double height)
//  {
//    this.height = height;
//  }

  public double calculateArea()
  {
    return length * height;
  }

  public double calculatePerimeter()
  {
    return 2 * (length + height);
  }
}


































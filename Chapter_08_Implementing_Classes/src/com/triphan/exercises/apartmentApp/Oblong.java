package com.triphan.exercises.apartmentApp;

// Exercise: chapter 08 Implementing classes / exercise 07
public class Oblong
{
  private double length;
  private double height;

  public Oblong(double length, double height)
  {
    this.length = length;
    this.height = height;
  }

  public double getLength()
  {
    return length;
  }

  public void setLength(double length)
  {
    this.length = length;
  }

  public double getHeight()
  {
    return height;
  }

  public void setHeight(double height)
  {
    this.height = height;
  }

  public double calculateArea()
  {
    return length * height;
  }

  public double calculatePerimeter()
  {
    return 2 * (length + height);
  }
}



























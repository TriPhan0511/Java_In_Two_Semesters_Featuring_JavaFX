package com.triphan.oblong;

public class Oblong
{
//  The attributes
  private double length;
  private double height;

//  The constructor
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

  public void setLength(double length)
  {
    this.length = length;
  }

  public void setHeight(double height)
  {
    this.height = height;
  }

  public double calculateArea()
  {
    return  length * height;
  }

  public double calculatePerimeter()
  {
    return 2 * (length + height);
  }
}

























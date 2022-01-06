package com.triphan.oblong;

public class Oblong
{
//  The attributes
  private double length;
  private double height;

//  The default constructor
  public Oblong()
  {
  }

//  A user-defined constructor
  public Oblong(double length, double height)
  {
    this.length = length;
    this.height = height;
  }

//  This method allow us to read the length attribute
  public double getLength()
  {
    return length;
  }

//  This method allow us to read the height attribute
  public double getHeight()
  {
    return height;
  }

//  This method allow us to write the length attribute
  public void setLength(double length)
  {
    this.length = length;
  }

//    This method allow us to write the height attribute
  public void setHeight(double height)
  {
    this.height = height;
  }

//  This method returns the area of the Oblong
  public double calculateArea()
  {
    return height * length;
  }

//  This method returns the perimeter of the Oblong
  public double calculatePerimeter()
  {
    return 2 * (height + length);
  }
}





















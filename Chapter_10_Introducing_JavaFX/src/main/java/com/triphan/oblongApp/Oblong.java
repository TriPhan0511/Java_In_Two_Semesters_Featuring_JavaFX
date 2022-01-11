package com.triphan.oblongApp;

public class Oblong
{
  private double length;
  private double height;

  public Oblong(double lengthIn, double heightIn)
  {
    length = lengthIn;
    height = heightIn;
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

























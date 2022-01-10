package com.triphan.exercises.vehicleApp;

public class Vehicle
{
  private String regNo;
  private String make;
  private int yearOfManufacture;
  private double value;

  public Vehicle(
      String regNoIn,
      String makeIn,
      int yearOfManufactureIn,
      double valueIn
  )
  {
    regNo = regNoIn;
    make = makeIn;
    yearOfManufacture = yearOfManufactureIn;
    value = valueIn;
  }

  public String getRegNo()
  {
    return regNo;
  }

  public String getMake()
  {
    return make;
  }

  public int getYearOfManufacture()
  {
    return yearOfManufacture;
  }

  public double getValue()
  {
    return value;
  }

  public void setValue(double valueIn)
  {
    value = valueIn;
  }

  public int calculateAge(int currentYear)
  {
    return currentYear - yearOfManufacture;
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Register Number: ");
    builder.append(regNo);
    builder.append("\nMake: ");
    builder.append(make);
    builder.append("\nYear of manufacture: ");
    builder.append(yearOfManufacture);
    builder.append("\nValue: ");
    builder.append(value);
    return builder.toString();
  }
}



























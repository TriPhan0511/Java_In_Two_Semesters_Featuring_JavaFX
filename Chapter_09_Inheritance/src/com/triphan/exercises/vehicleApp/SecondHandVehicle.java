package com.triphan.exercises.vehicleApp;

public class SecondHandVehicle extends Vehicle
{
  private int numberOfOwners;

  public SecondHandVehicle(
      String regNoIn,
      String makeIn,
      int yearOfManufacture,
      double valueIn,
      int numberOfOwnersIn
  )
  {
    super(regNoIn, makeIn, yearOfManufacture, valueIn);
    numberOfOwners = numberOfOwnersIn;
  }

  public int getNumberOfOwners()
  {
    return numberOfOwners;
  }

  public boolean hasMultipleOwners()
  {
    if (numberOfOwners > 1)
    {
      return true;
    }
    return false;
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append(super.toString());
    if (hasMultipleOwners())
    {
      builder.append("\nNumber of owners: " + numberOfOwners);
    }
    return builder.toString();
  }
}






























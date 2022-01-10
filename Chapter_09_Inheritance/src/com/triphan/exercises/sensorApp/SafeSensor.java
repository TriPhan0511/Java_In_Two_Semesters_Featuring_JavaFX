package com.triphan.exercises.sensorApp;

public class SafeSensor extends Sensor
{
  private double max;

  public SafeSensor(double maxIn)
  {
    max = maxIn;
    pressure = 10.0;
  }

  public SafeSensor(double maxIn, double pressureIn)
  {
    max = maxIn;
    pressure = pressureIn;
  }

  @Override
  public boolean setPressure(double pressureIn)
  {
    if (pressureIn > max | pressureIn < 0)
    {
      return false;
    }
    pressure = pressureIn;
    return true;
  }

  public double getMax()
  {
    return max;
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Details of sensor:\n");
    builder.append("Maximum pressure: ");
    builder.append((max));
    builder.append("\nCurrent pressure: ");
    builder.append(pressure);
    return builder.toString();
  }
}





















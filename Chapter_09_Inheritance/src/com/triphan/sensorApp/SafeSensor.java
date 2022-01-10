package com.triphan.sensorApp;

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
    if (pressureIn > max || pressureIn < 0)
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
}




















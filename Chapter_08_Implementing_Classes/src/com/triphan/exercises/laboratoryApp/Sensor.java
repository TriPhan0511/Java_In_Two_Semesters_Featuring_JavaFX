package com.triphan.exercises.laboratoryApp;

// Exercise: chapter 08 Implementing classes / exercise 04
public class Sensor
{
  private double pressure;

  public Sensor()
  {
    pressure = 0.0;
  }

  public Sensor(double pressure)
  {
    this.pressure = pressure;
  }

  public double getPressure()
  {
    return pressure;
  }

  public boolean setPressure(double pressure)
  {
    if (pressure < 0.0)
    {
      return false;
    }
    this.pressure = pressure;
    return true;
  }
}

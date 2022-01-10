package com.triphan.exercises.sensorApp;

public abstract class Sensor
{
  protected double pressure;

  public Sensor()
  {
  }

  public Sensor(double pressureIn)
  {
    pressure = pressureIn;
  }

  public double getPressure()
  {
    return pressure;
  }

  public abstract boolean setPressure(double pressureIn);
}

package com.triphan.exercises.incubatorApp;

public class Incubator
{
  private int temperature;
  public static final int MAX = 10;
  public static int MIN = -10;

  public Incubator()
  {
    temperature = 5;
  }

  public int getTemperature()
  {
    return temperature;
  }

  public boolean increaseTemperature()
  {
    if (temperature == MAX)
    {
      return false;
    }
    temperature++;
    return true;
  }

  public boolean decreaseTemperature()
  {
    if (temperature == MIN)
    {
      return false;
    }
    temperature--;
    return true;
  }
}



































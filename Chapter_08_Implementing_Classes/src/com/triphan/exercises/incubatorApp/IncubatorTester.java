package com.triphan.exercises.incubatorApp;

public class IncubatorTester
{
  public static void main(String[] args)
  {
    Incubator incubator = new Incubator();
    System.out.println("Initial temperature: " + incubator.getTemperature());

//    Test increasing
    for (int i = 1; i <= 5; i++)
    {
      incubator.increaseTemperature();
      System.out.println(i + ": Current temperature: " + incubator.getTemperature());
    }

    boolean ok = incubator.increaseTemperature();
    if (ok)
    {
      System.out.println("Temperature increased.");
      System.out.println("Current temp: " + incubator.getTemperature());
    }
    else
    {
      System.out.println("Temperature was not increased.");
      System.out.println("Current temp: " + incubator.getTemperature());
    }

//    Test decreasing
    System.out.println();
    for (int i = 1; i <= 20; i++)
    {
      incubator.decreaseTemperature();
      System.out.println(i + ": Current temperature: " + incubator.getTemperature());
    }

    boolean ok2 = incubator.decreaseTemperature();
    if (ok2)
    {
      System.out.println("Temperature decreased.");
      System.out.println("Current temp: " + incubator.getTemperature());
    }
    else
    {
      System.out.println("Temperature was not increased.");
      System.out.println("Current temp: " + incubator.getTemperature());
    }
  }
}

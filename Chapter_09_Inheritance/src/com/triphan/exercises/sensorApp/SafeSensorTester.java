package com.triphan.exercises.sensorApp;

import com.triphan.easyScanner.EasyScanner;

public class SafeSensorTester
{
  public static void main(String[] args)
  {
    char choice;
    double maxIn, pressureIn;
    SafeSensor sensor;
    System.out.print("Enter a maximum pressure: ");
    maxIn = EasyScanner.nextDouble();
    do
    {
      System.out.print("Enter an initial pressure: ");
      pressureIn = EasyScanner.nextDouble();
      if (pressureIn > maxIn || pressureIn < 0)
      {
        System.out.println("Pressure should be between 0 and " + maxIn);
      }
    } while (pressureIn > maxIn || pressureIn < 0);
    sensor = new SafeSensor(maxIn, pressureIn);
    System.out.println(sensor);
    do
    {
      System.out.print("Do you want to set pressure (y/n)? ");
      choice = EasyScanner.nextChar();
      if (choice == 'y' || choice == 'Y')
      {
        System.out.print("Enter a pressure: ");
        pressureIn = EasyScanner.nextDouble();
        if (sensor.setPressure(pressureIn))
        {
          System.out.println("Pressure set.");
          System.out.println(sensor);
        }
        else
        {
          System.out.println("Pressure should be between 0 and " + maxIn);
        }
      }
    } while (choice == 'y' || choice == 'Y');

  }
}























package com.triphan.exercises.laboratoryApp;

// Exercise: chapter 08 Implementing classes / exercise 04
public class SensorTester
{
  public static void main(String[] args)
  {
//    Create a new Sensor object
    Sensor sensor1 = new Sensor();
    System.out.println("Current pressure of sensor1: "
        + sensor1.getPressure());
//    -> Current pressure of sensor1: 0.0
    sensor1.setPressure(-20);
    System.out.println("Current pressure of sensor1: "
        + sensor1.getPressure());
//    -> Current pressure of sensor1: 0.0
    sensor1.setPressure(100);
    System.out.println("Current pressure of sensor1: "
        + sensor1.getPressure());
//    -> Current pressure of sensor1: 100.0

    Sensor sensor2 = new Sensor(50.0);
    System.out.println("Current pressure of sensor2: "
        + sensor2.getPressure());
//    -> Current pressure of sensor2: 50.0
  }
}

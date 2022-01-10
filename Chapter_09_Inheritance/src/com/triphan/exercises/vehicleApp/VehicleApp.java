package com.triphan.exercises.vehicleApp;

import com.triphan.easyScanner.EasyScanner;

import java.util.ArrayList;

public class VehicleApp
{
  public static void main(String[] args)
  {
    ArrayList<Vehicle> list = new ArrayList<>();
    char choice;
    do
    {
      System.out.println("1. Add a vehicle");
      System.out.println("2. Display a list of vehicle details.");
      System.out.println("3. Delete a vehicle");
      System.out.println("4. Quit.");
      System.out.print("Enter choice [1-4]: ");
      choice = EasyScanner.nextChar();
      switch (choice)
      {
        case '1':
          addVehicle(list);
          break;
        case '2':
          displayListOfVehicles(list);
          break;
        case '3':
          deleteVehicle(list);
          break;
        case '4':
          System.out.println("Goodbye.");
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '4');
  }

  static void addVehicle(ArrayList<Vehicle> list)
  {
    String regNo, make;
    int yearOfManufacture;
    double value;
    System.out.print("Enter a register number: ");
    regNo = EasyScanner.nextString();
    System.out.print("Enter a make: ");
    make = EasyScanner.nextString();
    System.out.print("Enter year of manufacture: ");
    yearOfManufacture = EasyScanner.nextInt();
    System.out.print("Enter a value: ");
    value = EasyScanner.nextDouble();
    list.add(new Vehicle(regNo, make, yearOfManufacture, value));
  }

  static void displayListOfVehicles(ArrayList<Vehicle> list)
  {
    if (list.size() == 0)
    {
      System.out.println("Current there is no any vehicle.");
    }
    else
    {
      for (Vehicle item : list)
      {
        System.out.println(item);
        System.out.println();
      }
    }

  }

  static void deleteVehicle(ArrayList<Vehicle> list)
  {
    System.out.print("Enter the register number of the vehicle you want to delete: ");
    String regNoIn = EasyScanner.nextString();
    int index = search(regNoIn, list);
    if (index == -999)
    {
      System.out.println("No such vehicle.");
    }
    else
    {
      list.remove(index);
      System.out.println("The vehicle was deleted.");
    }
  }

  private static int search(String regNoIn, ArrayList<Vehicle> list)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getRegNo().equalsIgnoreCase(regNoIn))
      {
        return i;
      }
    }
    return -999;
  }
}





























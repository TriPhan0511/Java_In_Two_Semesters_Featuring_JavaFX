package com.triphan.exercises.apartmentApp;

import com.triphan.exercises.easyScanner.EasyScanner;

// Exercise: chapter 08 Implementing classes / exercise 07
public class ApartmentTester
{
  public static void main(String[] args)
  {
    Apartment apartment = new Apartment();
    char choice;
    do
    {
      System.out.println();
      System.out.println("1. Add a room.");
      System.out.println("2. Display a room area.");
      System.out.println("3. Display a room length.");
      System.out.println("4. Display a room height.");
      System.out.println("5. Display all of rooms details.");
      System.out.println("6. Exit.");
      System.out.println();
      System.out.print("Enter choice [1-6]: ");
      choice = EasyScanner.nextChar();
      switch (choice)
      {
        case '1':
          addRoom(apartment);
          break;
        case '2':
          displayRoomArea(apartment);
          break;
        case '3':
          displayRoomLength(apartment);
          break;
        case '4':
          displayRoomHeight(apartment);
          break;
        case '5':
          apartment.displayApartmentDetails();
          break;
        case '6':
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '6');
  }

  private static void addRoom(Apartment apartment)
  {
    System.out.print("Enter a length: ");
    double length = EasyScanner.nextDouble();
    System.out.print("Enter a height: ");
    double height = EasyScanner.nextDouble();
    apartment.addRoom(new Oblong(length, height));
  }

  private static void displayRoomArea(Apartment apartment)
  {
    System.out.print("Enter a room number: ");
    int number = EasyScanner.nextInt();
    double area = apartment.getRoomArea(number);
    if (area == -999.0)
    {
      System.out.println("No such room.");
    }
    else
    {
      System.out.println("The area of this room: " + area);
    }
  }

  private static void displayRoomLength(Apartment apartment)
  {
    System.out.print("Enter a room number: ");
    int number = EasyScanner.nextInt();
    double length = apartment.getRoomLength(number);
    if (length == -999.0)
    {
      System.out.println("No such room.");
    }
    else
    {
      System.out.println("The length of this room: " + length);
    }
  }

  private static void displayRoomHeight(Apartment apartment)
  {
    System.out.print("Enter a room number: ");
    int number = EasyScanner.nextInt();
    double height = apartment.getRoomHeight(number);
    if (height == -999.0)
    {
      System.out.println("No such room.");
    }
    else
    {
      System.out.println("The height of this room: " + height);
    }
  }
}






















package com.triphan.exercises;

import java.util.ArrayList;

public class ApartmentTester_2
{
  public static void main(String[] args)
  {
//    Creates the rooms
    ArrayList<Oblong> rooms = createRooms();
//    Displays all of rooms
    displayRooms(rooms);
//    Displays a room
    displayARoom(rooms);
  }

  private static ArrayList<Oblong> createRooms()
  {
    ArrayList<Oblong> rooms = new ArrayList<>();
    double length, height;
    int counter = 1;
    char choice;
    do
    {
      System.out.println("\nEnter the information of room " + counter);
      System.out.print("Length: ");
      length = EasyScanner.nextDouble();
      System.out.print("Height: ");
      height = EasyScanner.nextDouble();
      rooms.add(new Oblong(length, height));
      counter++;
      System.out.print("\nDo you want to keep adding room (y/n)? ");
      choice = EasyScanner.nextChar();
    } while (choice == 'y' || choice == 'Y');
    return rooms;
  }

  private static void displayRooms(ArrayList<Oblong> rooms)
  {
    System.out.println("\nInformation of all rooms:");
    for (Oblong room : rooms)
    {
      System.out.println();
      System.out.println("Area: " + room.calculateArea());
      System.out.println("Length: " + room.getLength());
      System.out.println("Height: " + room.getHeight());
    }
  }

  private static void displayARoom(ArrayList<Oblong> rooms, int roomNumber)
  {
    Oblong room = rooms.get(roomNumber);
    System.out.println("\nThe information of room " + (roomNumber + 1) + ":");
    System.out.println("Area: " + room.calculateArea());
    System.out.println("Length: " + room.getLength());
    System.out.println("Height: " + room.getHeight());
  }

  private static void displayARoom(ArrayList<Oblong> rooms)
  {
    int totalOfRooms = rooms.size();
    int roomNumber;
    char choice;
    do
    {
      do
      {
        System.out.print("\nEnter the room number you want to see the information: ");
        roomNumber = EasyScanner.nextInt();
        if (roomNumber < 1 || roomNumber > totalOfRooms)
        {
          System.out.println("The room number should be between 1 and " + totalOfRooms + ".");
        }
      } while (roomNumber < 1 || roomNumber > totalOfRooms);
      displayARoom(rooms, roomNumber - 1);
      System.out.print("\nDo you want to keep seeing the information of a specific room (y/n)? ");
      choice = EasyScanner.nextChar();
    } while (choice == 'y' || choice == 'Y');

  }
}



















package com.triphan.exercises;

public class ApartmentAppTester
{
  public static void main(String[] args)
  {
//    Creates the rooms
    Oblong[] rooms = createRooms();

//    Display the area and dimensions of rooms
    displayAllOfRooms(rooms);

//    Displays the area and dimensions of any room
    displayARoom(rooms);
  }

  private static void displayARoom(Oblong[] rooms, int number)
  {
    Oblong room = rooms[number - 1];
    System.out.println("\nThe area and dimensions of the room " + number);
    System.out.println("The area: " + room.calculateArea());
    System.out.println("The length: " + room.getLength());
    System.out.println("The height: " + room.getHeight());
  }

  private static void displayARoom(Oblong[] rooms)
  {
    int roomNumber;
    int totalOfRooms = rooms.length;
    do
    {
      System.out.print("\nEnter the room number you want to see the information" +
          "(1 - " + totalOfRooms + "): ");
      roomNumber = EasyScanner.nextInt();
      if (roomNumber < 1 || roomNumber > totalOfRooms)
      {
        System.out.println("\nPlease enter a number between 1 and " + totalOfRooms + ".");
      }
    } while (roomNumber < 1 || roomNumber > totalOfRooms);
    displayARoom(rooms, roomNumber);
  }

  private static void displayAllOfRooms(Oblong[] rooms)
  {
    for (Oblong room : rooms)
    {
      System.out.println("\nThe area: " + room.calculateArea());
      System.out.println("The length: " + room.getLength());
      System.out.println("The height: " + room.getHeight());
    }
  }

  private static void enterDimensionsForRooms(Oblong[] rooms)
  {
    double length, height;
    for (int i = 0; i < rooms.length; i++)
    {
      System.out.println("\nEnter the length and the width of room " + (i + 1));
      System.out.print("Length: ");
      length = EasyScanner.nextDouble();
      System.out.print("Height: ");
      height = EasyScanner.nextDouble();
      rooms[i] = new Oblong(length, height);
    }
  }

  private static Oblong[] createRooms()
  {
    int numberOfRooms;
    Oblong[] rooms;
    double length, height;
    int roomNumber;

    System.out.print("How many rooms do you want? ");
    numberOfRooms = EasyScanner.nextInt();
    rooms = new Oblong[numberOfRooms];

//    Enters the dimensions for all of rooms
    enterDimensionsForRooms(rooms);
    return rooms;
  }
}

























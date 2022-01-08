package com.triphan.exercises.apartmentApp;

import java.util.ArrayList;

public class Apartment
{
  private ArrayList<Oblong> rooms = new ArrayList<>();

  /**
   * Add the given room to the list of rooms.
   * @param room An Oblong object.
   */
  public void addRoom(Oblong room)
  {
    rooms.add(room);
  }

  /**
   * Returns the area of the given room number sent in as a parameter.
   * @param roomNumber An integer representing a room number.
   * @return A double representing the room area.
   */
  public double getRoomArea(int roomNumber)
  {
    if (roomNumber < 1 || roomNumber > rooms.size())
    {
      return -999.0;
    }
    return rooms.get(roomNumber - 1).calculateArea();
  }

  /**
   * Returns the length of the given room number.
   * @param roomNumber An integer representing a room number.
   * @return A double representing the room area.
   */
  public double getRoomLength(int roomNumber)
  {
    if (roomNumber < 1 || roomNumber > rooms.size())
    {
      return -999.0;
    }
    return rooms.get(roomNumber - 1).getLength();
  }

  /**
   * Returns the height of the given room number.
   * @param roomNumber An integer representing a room number.
   * @return A double representing the room area.
   */
  public double getRoomHeight(int roomNumber)
  {
    if (roomNumber < 1 || roomNumber > rooms.size())
    {
      return -999.0;
    }
    return rooms.get(roomNumber - 1).getHeight();
  }

  /**
   * Display the details of all rooms within the department.
   */
  public void displayApartmentDetails()
  {
    int numberOfRooms = rooms.size();
    if (numberOfRooms == 0)
    {
      System.out.println("The apartment is under construction.");
    }
    else
    {
      System.out.println("There are " + numberOfRooms + " rooms.");
      System.out.println("Details of each room:");
      System.out.println();
      for (int i = 0; i < numberOfRooms; i++)
      {
        Oblong room = rooms.get(i);
        System.out.println("Room " + (i+1));
        System.out.println("Length: " + room.getLength());
        System.out.println("Height: " + room.getHeight());
        System.out.println("Area: " + room.calculateArea());
        System.out.println("Perimeter: " + room.calculatePerimeter());
        System.out.println();
      }
    }
  }
}






















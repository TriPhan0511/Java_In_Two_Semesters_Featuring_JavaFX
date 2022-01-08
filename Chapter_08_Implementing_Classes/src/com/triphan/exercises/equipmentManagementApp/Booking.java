package com.triphan.exercises.equipmentManagementApp;

// Exercise: chapter 08 Implementing classes / exercise 08
public class Booking
{
  private String room;
  private String name;

  public Booking(String room, String name)
  {
    this.room = room;
    this.name = name;
  }

  public String getRoom()
  {
    return room;
  }

  public String getName()
  {
    return name;
  }

  public void displayBookingDetails()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("Room: ");
    builder.append(room);
    builder.append("\n");
    builder.append("Name: ");
    builder.append(name);
    System.out.println(builder.toString());
  }
}




















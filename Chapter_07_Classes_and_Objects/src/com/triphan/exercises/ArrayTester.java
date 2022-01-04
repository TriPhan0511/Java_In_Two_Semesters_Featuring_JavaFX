package com.triphan.exercises;

import java.util.ArrayList;

public class ArrayTester
{
  public static void main(String[] args)
  {
//    Crates an array, an array list and three Oblong objects.
    Oblong[] roomArray = new Oblong[3];
    ArrayList<Oblong> roomList = new ArrayList<>();
    Oblong o1 = new Oblong(4.7, 5.2);
    Oblong o2 = new Oblong(5.7, 5.2);
    Oblong o3 = new Oblong(5.0, 8.1);

//    Set value for each element in the array
    roomArray[0] = o1;
    roomArray[1] = o2;
    roomArray[2] = o3;

//    Adds the Oblong object's reference to the array list
    roomList.add(o1);
    roomList.add(o2);
    roomList.add(o3);

//    Iterates the array and displays the area of each Oblong object in the array.
    for (Oblong item : roomArray)
    {
      System.out.println("The area: " + item.calculateArea());
    }
    System.out.println();

//    Iterates the array list and displays the area of each Oblong object in the array list.
    for (Oblong item : roomList)
    {
      System.out.println("The area: " + item.calculateArea());
    }
  }
}

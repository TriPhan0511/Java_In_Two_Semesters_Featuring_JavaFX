package com.triphan.exercises;

public class Exercise03
{
//  public static void main(String[] args)
//  {
//    SomeClass myObject = new SomeClass();
//    System.out.println(myObject.getX());
////    -> 10
//  }

//  public static void main(String[] args)
//  {
//    SomeClass myObject = new SomeClass(5);
//    System.out.println(myObject.getX());
////    -> 5
//  }

  public static void main(String[] args)
  {
    int y = 20;
    SomeClass myObject = new SomeClass(5);
    System.out.println(myObject.getX()); // -> 5
    test(y, myObject);
    System.out.println(y); // -> 20
    System.out.println(myObject.getX()); // -> 100
  }

  static void test(int z, SomeClass classIn)
  {
    z = 50;
    classIn.setX(100);
  }
}

class SomeClass
{
  private int x;

  public SomeClass()
  {
    x = 10;
  }

  public SomeClass(int xIn)
  {
    x = xIn;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public int getX()
  {
    return x;
  }
}


































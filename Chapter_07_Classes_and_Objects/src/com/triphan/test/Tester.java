package com.triphan.test;

public class Tester
{
  public static void main(String[] args)
  {
    Person peter = new Person("Peter Pan");
    System.out.println("His name: " + peter.getName()); // Peter Pan

//    Changes the name of peter
    peter.setName("Alex Ferguson");
    System.out.println("His name: " + peter.getName()); // Alex Ferguson
  }
}

class Person
{
  private String name;

  public Person(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}

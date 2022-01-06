package com.triphan.test;

public class Tester
{
  public static void main(String[] args)
  {
    int i = 10;
    changeValue(i);
    System.out.println(i);
  }

  private static void changeValue(int i)
  {
    i = i + 10;
  }
}


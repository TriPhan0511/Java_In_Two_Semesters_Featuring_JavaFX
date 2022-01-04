package com.triphan.exercises;

public class StringComparison2
{
  public static void main(String[] args)
  {
    String s1, s2;
    System.out.print("Enter a string: ");
    s1 = EasyScanner.nextString();
    System.out.print("Enter another string: ");
    s2 = EasyScanner.nextString();

    compareIgnoreCase(s1, s2);
    compareWithEqualsMethod(s1, s2);
    compareWithEqualsIgnoreCase(s1, s2);
  }

  private static void compareIgnoreCase(String s1, String s2)
  {
    s1 = s1.trim().toLowerCase();
    s2 = s2.trim().toLowerCase();
    int comparison = s1.compareTo(s2);
    if (comparison < 0)
    {
      System.out.println("s1 comes before s2.");
    }
    else if (comparison > 0)
    {
      System.out.println("s1 comes after s2.");
    }
    else
    {
      System.out.println("Two strings are identical.");
    }
  }

  private static void compareWithEqualsMethod(String s1, String s2)
  {
    s1 = s1.trim();
    s2 = s2.trim();
    if (s1.equals(s2))
    {
      System.out.println("Two strings are identical.");
    }
    else
    {
      System.out.println("Two strings are not identical.");
    }
  }

  private static void compareWithEqualsIgnoreCase(String s1, String s2)
  {
    s1 = s1.trim();
    s2 = s2.trim();
    if (s1.equalsIgnoreCase(s2))
    {
      System.out.println("Two string are identical (ignore case).");
    }
    else
    {
      System.out.println("Two string are not identical.");
    }
  }
}






























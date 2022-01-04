package com.triphan.stringsamples;

import java.util.Scanner;

public class StringComparison
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String s1, s2;
    int comparison;
    System.out.print("Enter a string: ");
    s1 = keyboard.next();
    System.out.print("Enter another string: ");
    s2 = keyboard.next();

    comparison = s1.compareTo(s2);
    if (comparison < 0)
    {
      System.out.println(s1 + " comes before " + s2 + " in the alphabet.");
    } else if (comparison > 0)
    {
      System.out.println(s1 + " comes after " + s2 + " in the alphabet.");
    }
    else
    {
      System.out.println("The strings are identical.");
    }
  }
}

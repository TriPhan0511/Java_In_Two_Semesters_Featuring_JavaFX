package com.triphan.stringsamples;

import java.util.Scanner;

public class StringMethods
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String s;
    System.out.print("Enter a string without spaces: ");
    s = keyboard.next();
    System.out.println("The length of the string is " + s.length());
    System.out.println("The character at position 3 is " + s.charAt(2));
    System.out.println("Characters from 2 to 4 are " + s.substring(1, 4));
    System.out.println(s.concat(" was the string entered."));
    System.out.println("This is upper case: " + s.toUpperCase());
    System.out.println("This is lower case: " + s.toLowerCase());
  }
}

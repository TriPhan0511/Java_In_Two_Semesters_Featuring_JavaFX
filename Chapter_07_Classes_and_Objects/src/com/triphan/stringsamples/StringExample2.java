package com.triphan.stringsamples;

import java.util.Scanner;

public class StringExample2
{
  public static void main(String[] args)
  {
    Scanner keyboardString = new Scanner(System.in);
    Scanner keyboard = new Scanner(System.in);
    double d;
    int i;
    String s;

    System.out.print("Enter a double: ");
    d = keyboard.nextDouble();
    System.out.print("Enter an integer: ");
    i = keyboard.nextInt();
    System.out.print("Enter a string: ");
    s = keyboardString.nextLine();
    System.out.println("\nYou entered:");
    System.out.println("Double: " + d);
    System.out.println("Integer: " + i);
    System.out.println("String: " + s);
  }
}































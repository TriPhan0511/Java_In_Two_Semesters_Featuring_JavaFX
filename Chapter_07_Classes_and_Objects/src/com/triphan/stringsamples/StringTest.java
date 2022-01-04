package com.triphan.stringsamples;

import java.util.Scanner;

public class StringTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    System.out.print("What is your name? ");
    name = keyboard.next();
    System.out.print("Whats is your age? ");
    age = keyboard.nextInt();
    System.out.println("\nHello " + name);
    System.out.println("When I was your age I was " + (age + 1));
  }
}

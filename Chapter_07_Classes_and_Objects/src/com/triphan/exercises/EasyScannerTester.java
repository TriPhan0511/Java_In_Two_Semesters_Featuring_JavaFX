package com.triphan.exercises;

public class EasyScannerTester
{
  public static void main(String[] args)
  {
    final String PASSWORD = "java";
    String guess;
    System.out.print("Enter guess: ");
    guess = EasyScanner.nextString();
    if (!guess.equalsIgnoreCase(PASSWORD))
    {
      System.out.println("INCORRECT PASSWORD");
    }
    else
    {
      System.out.println("CORRECT PASSWORD");
    }
  }
}

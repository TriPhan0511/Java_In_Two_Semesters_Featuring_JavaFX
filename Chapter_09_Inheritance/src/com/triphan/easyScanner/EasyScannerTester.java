package com.triphan.easyScanner;

public class EasyScannerTester
{
  public static void main(String[] args)
  {
    System.out.print("Enter an integer: ");
    int i = EasyScanner.nextInt();
    System.out.println("The integer you entered: " + i);
    System.out.println();

    System.out.print("Enter a double: ");
    double d = EasyScanner.nextDouble();
    System.out.println("The double you entered: " + d);
    System.out.println();

    System.out.print("Enter a string: ");
    String s = EasyScanner.nextString();
    System.out.println("The string you entered: " + s);
    System.out.println();

    System.out.print("Enter a character: ");
    char c = EasyScanner.nextChar();
    System.out.println("The character you entered: " + c);
  }
}

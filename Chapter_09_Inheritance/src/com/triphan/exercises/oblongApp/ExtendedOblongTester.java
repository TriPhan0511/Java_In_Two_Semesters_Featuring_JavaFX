package com.triphan.exercises.oblongApp;

import com.triphan.easyScanner.EasyScanner;

public class ExtendedOblongTester
{
  public static void main(String[] args)
  {
    System.out.print("Enter a length: ");
    double length = EasyScanner.nextDouble();
    System.out.print("Enter a height: ");
    double height = EasyScanner.nextDouble();
    System.out.print("Enter a symbol: ");
    char symbol = EasyScanner.nextChar();
    ExtendedOblong oblong = new ExtendedOblong(length, height, symbol);
    System.out.println(oblong.draw());
  }
}

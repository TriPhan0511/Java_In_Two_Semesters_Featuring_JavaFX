package com.triphan.exercises.easyScanner;

class EasyScannerTester
{
  public static void main(String[] args)
  {
    System.out.print("Enter a number: ");
    byte byteNumber = EasyScanner.nextByte();
    System.out.println("The number has just entered: " + byteNumber);

    System.out.print("Enter another number: ");
    long longNumber = EasyScanner.nextLong();
    System.out.println("The number has just entered: " + longNumber);
  }
}

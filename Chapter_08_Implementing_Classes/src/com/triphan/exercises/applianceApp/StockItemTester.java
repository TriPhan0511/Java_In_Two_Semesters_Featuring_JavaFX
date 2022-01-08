package com.triphan.exercises.applianceApp;

import com.triphan.exercises.easyScanner.EasyScanner;

// Exercise: chapter 08 Implementing classes / exercise 03
public class StockItemTester
{
  public static void main(String[] args)
  {
    System.out.print("Enter the stock number: ");
    String stockNumber = EasyScanner.nextString();
    System.out.print("Enter the name of the item: ");
    String name = EasyScanner.nextString();
    System.out.print("Enter the price of the item: ");
    double price = EasyScanner.nextDouble();

//    Create a new item of stock
    StockItem item = new StockItem(stockNumber, name, price);
//    Increase the total number of items in stock by 5
    item.increaseTotalStock(5);
//    Display the stock number
    System.out.println("Total number of these items currently in stock: " + item.getTotalStock());
//    Display the total price of all items in stock
    System.out.println("Total price: " + item.calculateTotalPrice());
//    Set the sales tax for all objects of the class to 10
//    without referring to any particular object
    StockItem.setSalesTax(10.0);
//    Display the sales tax has just entered
    System.out.println("Sales Tax: " + StockItem.getSalesTax());
  }
}

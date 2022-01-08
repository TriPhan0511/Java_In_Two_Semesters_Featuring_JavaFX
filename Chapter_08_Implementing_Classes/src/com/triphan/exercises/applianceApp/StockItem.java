package com.triphan.exercises.applianceApp;

public class StockItem
{
  private String stockNumber;
  private String name;
  private double price;
  private int totalStock;
  private static double salesTax;

  public StockItem(String stockNumber, String name, double price)
  {
    this.stockNumber = stockNumber;
    this.name = name;
    this.price = price;
    totalStock = 0;
  }

  public String getStockNumber()
  {
    return stockNumber;
  }

  public String getName()
  {
    return name;
  }

  public double getPrice()
  {
    return price;
  }

  public int getTotalStock()
  {
    return totalStock;
  }

  public static double getSalesTax()
  {
    return salesTax;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public static void setSalesTax(double tax)
  {
    salesTax = tax;
  }

  public void increaseTotalStock(int quantity)
  {
    totalStock += quantity;
  }

  public double calculateTotalPrice()
  {
    return totalStock * price;
  }
}
























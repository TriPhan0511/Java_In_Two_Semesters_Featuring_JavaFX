package com.triphan.companyApp;

public class PartTimeEmployee extends Employee
{
//  This attribute is unique to the subclass.
  private double hourlyPay;

  public PartTimeEmployee(String number, String name, double hourlyPay)
  {
    super(number, name); // call the constructor of the superclass.
    this.hourlyPay = hourlyPay;
  }

//  These methods are also unique to the subclass.
  public double getHourlyPay()
  {
    return hourlyPay;
  }

  public void setHourlyPay(double hourlyPay)
  {
    this.hourlyPay = hourlyPay;
  }

  public double calculateWeeklyPay(int numberOfHours)
  {
    return numberOfHours * hourlyPay;
  }

  @Override
  public String getStatus()
  {
    return "Part-Time";
  }
}






























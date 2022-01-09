package com.triphan.companyApp;

import com.triphan.easyScanner.EasyScanner;

public class PartTimeEmployeeTester
{
  public static void main(String[] args)
  {
    String number, name;
    double pay;
    int hours;
    PartTimeEmployee emp;

//    Get the details from user
    System.out.print("Employee Number? ");
    number = EasyScanner.nextString();
    System.out.print("Employee's Name? ");
    name = EasyScanner.nextString();
    System.out.print("Hourly Pay? ");
    pay = EasyScanner.nextDouble();
    System.out.print("Hours worked in this week? ");
    hours = EasyScanner.nextInt();

//    Create a new part-time employee
    emp = new PartTimeEmployee(number, name, pay);

//    Display part-time employee's details, including the weekly pay
    System.out.println("Number: " + emp.getNumber());
    System.out.println("Name: " + emp.getName());
    System.out.println("Paid in this week: " + emp.calculateWeeklyPay(hours));
  }
}
































package com.triphan.companyApp;

import com.triphan.easyScanner.EasyScanner;

public class EmployeeTester3
{
  public static void main(String[] args)
  {
    Employee employee; // A reference to an Employee.
    char choice;
    String numberEntered, nameEntered;
    double annualSalary, hourlyPay;

    System.out.print("Choice (F)ull-time or (P)art-time employee: ");
    choice = EasyScanner.nextChar();
    System.out.print("Enter employee number: ");
    numberEntered = EasyScanner.nextString();
    System.out.print("Enter employee name: ");
    nameEntered = EasyScanner.nextString();
    if (choice == 'F' || choice == 'f')
    {
      System.out.print("Enter annual salary: ");
      annualSalary = EasyScanner.nextDouble();

//      Create a FullTimeEmployee object.
      employee = new FullTimeEmployee(numberEntered, nameEntered, annualSalary);
    }
    else
    {
      System.out.print("Enter hourly pay: ");
      hourlyPay = EasyScanner.nextDouble();

//      Create a PartTimeEmployee object.
      employee = new PartTimeEmployee(numberEntered, nameEntered, hourlyPay);
    }
    testMethod(employee); // Call tester with the object created.
  }


  static void testMethod(Employee employee)
  {
    System.out.println(employee.getStatus());
  }
}

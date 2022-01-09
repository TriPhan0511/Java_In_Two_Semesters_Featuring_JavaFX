package com.triphan.companyApp;

public class EmployeeTester
{
  public static void main(String[] args)
  {
    FullTimeEmployee fte
        = new FullTimeEmployee("A123", "Ms Full-Time", 25000);
    PartTimeEmployee pte =
        new PartTimeEmployee("B456", "Mr Part-Time", 30);

    testMethod(fte);
    testMethod(pte);
  }

  static void testMethod(Employee employee)
  {
    System.out.println("Name: " + employee.getName());
    System.out.println("Status: " + employee.getStatus());
  }
}

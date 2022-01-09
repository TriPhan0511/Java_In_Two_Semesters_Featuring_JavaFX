package com.triphan.companyApp;

public class FullTimeEmployee extends Employee
{
  private double annualSalary;

  public FullTimeEmployee(String number, String name, double annualSalary)
  {
    super(number, name);
    this.annualSalary = annualSalary;
  }

  public double getAnnualSalary()
  {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary)
  {
    this.annualSalary = annualSalary;
  }

  public double calculateMonthlyPay()
  {
    return annualSalary / 12;
  }

  @Override
  public String getStatus()
  {
    return "Full-Time";
  }
}




























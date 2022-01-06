package com.triphan.bankApp;

public class BankAccount2
{
  private String accountNumber;
  private String accountName;
  double balance;
  private static double interestRate = 0;

  public BankAccount2(String accountNumber, String accountName)
  {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    balance = 0.0;
  }

  public String getAccountNumber()
  {
    return accountNumber;
  }

  public String getAccountName()
  {
    return accountName;
  }

  public double getBalance()
  {
    return balance;
  }

  public void deposit(double amount)
  {
    if (amount > 0)
    {
      balance += amount;
    }
  }

  public boolean withdraw(double amount)
  {
    if (amount > balance)
    {
      return false;
    }
    balance -= amount;
    return true;
  }

  public static double getInterestRate()
  {
    return interestRate;
  }

  public static void setInterestRate(double rate)
  {
    interestRate = rate;
  }

  public void addInterest()
  {
    balance += (balance * interestRate) / 100;
  }
}



















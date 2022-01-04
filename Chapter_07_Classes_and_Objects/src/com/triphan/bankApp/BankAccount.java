package com.triphan.bankApp;

public class BankAccount
{
  private String accountNumber;
  private String accountName;
  private double balance;

  public BankAccount(String accountNumber, String accountName)
  {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.balance = 0.0;
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
    if (amount > 0 && amount <= balance)
    {
      balance -= amount;
      return true;
    }
    else
    {
      return false;
    }
  }

//  public void deposit(double amount)
//  {
//    balance += amount;
//  }
//
//  public boolean withdraw(double amount)
//  {
//    if (amount > balance)
//    {
//      return false;
//    }
//    balance -= amount;
//    return true;
//  }
}






























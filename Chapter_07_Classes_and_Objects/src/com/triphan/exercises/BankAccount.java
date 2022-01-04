package com.triphan.exercises;

public class BankAccount
{
  private String accountNumber;
  private String accountName;
  private double balance;

  public BankAccount(String accountNumber, String accountName)
  {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    balance = 0;
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

  public void setAccountName(String accountName)
  {
    this.accountName = accountName;
  }

  public boolean deposit(double amount)
  {
    if (amount >= 0)
    {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount)
  {
    if (amount > balance || amount < 0)
    {
      return false;
    }
    balance -= amount;
    return true;
  }
}






























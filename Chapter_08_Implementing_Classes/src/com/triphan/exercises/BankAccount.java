package com.triphan.exercises;

public class BankAccount
{
//  The attributes
  private String accountNumber;
  private String accountName;
  private double balance;

//  The constructor
  public BankAccount(String accountNumber, String accountName)
  {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    balance = 0.0;
  }

//  Methods to read attributes
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

//  Methods to deposit and withdraw money
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
}



























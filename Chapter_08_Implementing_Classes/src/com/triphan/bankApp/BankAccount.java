package com.triphan.bankApp;

public class BankAccount
{
//  The attributes
  private String accountNumber;
  private String accountName;
  private double balance;

//  A user-defined constructor
  public BankAccount(String accountNumber, String accountName)
  {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    balance = 0.0;
  }

//  Methods to read the attributes
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

  //  Method to deposit and withdraw money
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
      return false; // no withdrawal was made
    }
    balance -= amount;
    return true; // money was withdrawn successfully
  }
}




























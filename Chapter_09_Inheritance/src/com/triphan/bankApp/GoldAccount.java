package com.triphan.bankApp;

public class GoldAccount extends BankAccount
{
  private double overdraftLimit;

  public GoldAccount(String accountNumber, String accountName, double limit)
  {
    super(accountNumber, accountName);
    this.overdraftLimit = limit;
  }

  public double getLimit()
  {
    return overdraftLimit;
  }

  public void setLimit(double limit)
  {
    overdraftLimit = limit;
  }

  @Override
  public boolean withdraw(double amount)
  {
    if (amount > balance + overdraftLimit)
    {
      return false;
    }
    balance -= amount;
    return true;
  }
}


































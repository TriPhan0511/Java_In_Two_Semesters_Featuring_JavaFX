package com.triphan.bankApp;

public class OverridingDemo
{
  public static void main(String[] args)
  {
    boolean ok;
//    Declare a BankAccount object
    BankAccount bankAccount =
        new BankAccount("123", "Ordinary Account Holder");
//    Declare a GoldAccount object
    GoldAccount goldAccount =
        new GoldAccount("124", "Gold Account Holder", 500.0);

    bankAccount.deposit(1000);
    goldAccount.deposit(1000);

    ok = bankAccount.withdraw(1250);
    if (ok)
    {
      System.out.println("Money withdrawn.");
    }
    else
    {
      System.out.println("Insufficient funds.");
    }
    System.out.println("Balance of "
        + bankAccount.getAccountName()
        + " is " + bankAccount.getBalance());
    System.out.println();

    ok = goldAccount.withdraw(1250);
    if (ok)
    {
      System.out.println("Money withdrawn.");
    }
    else
    {
      System.out.println("Insufficient funds.");
    }
    System.out.println("Balance of "
        + goldAccount.getAccountName()
        + " is " + goldAccount.getBalance());
    System.out.println();
  }
}

























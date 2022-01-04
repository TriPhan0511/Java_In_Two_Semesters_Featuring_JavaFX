package com.triphan.bankApp;

import com.triphan.easyScanner.EasyScanner;

public class BankAccountTester
{
  public static void main(String[] args)
  {
    double amount;
    boolean ok;
    BankAccount account1 =
        new BankAccount("99786754", "Susan Richards");

    System.out.print("Enter amount to deposit: ");
    amount = EasyScanner.nextDouble();
    account1.deposit(amount);
    System.out.println("Deposit was made.");
    System.out.println("Balance = " + account1.getBalance());

    System.out.print("\nEnter amount to withdraw: ");
    amount = EasyScanner.nextDouble();
    ok = account1.withdraw(amount);
    if (ok)
    {
      System.out.println("Withdrawal made.");
    }
    else
    {
      System.out.println("Insufficient funds.");
    }
    System.out.println("Balance = " + account1.getBalance());
  }
}




























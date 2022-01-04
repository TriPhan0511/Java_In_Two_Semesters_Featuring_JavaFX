package com.triphan.bankApp;

public class BankAccountTester2
{
  public static void main(String[] args)
  {
    BankAccount[] accounts = new BankAccount[3];
    accounts[0] = new BankAccount("123", "Alex Ferguson");
    accounts[1] = new BankAccount("456", "Hillary Duff");
    accounts[2] = new BankAccount("789", "Brad Pitt");

    accounts[0].deposit(1000);
    accounts[2].deposit(150);
    accounts[0].withdraw(500);

    for (BankAccount account : accounts)
    {
      System.out.println("Account Number: " + account.getAccountNumber());
      System.out.println("Account Name: " + account.getAccountName());
      System.out.println("Balance: " + account.getBalance());
      System.out.println();
    }
  }
}

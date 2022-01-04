package com.triphan.bankApp;

import java.util.ArrayList;

public class BankAccountTester3
{
  public static void main(String[] args)
  {
    ArrayList<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("123", "Alex Ferguson"));
    accounts.add(new BankAccount("456", "Brad Pit"));
    accounts.add(new BankAccount("789", "Hillary Duff"));

    accounts.get(0).deposit(1000);
    accounts.get(2).deposit(150);
    accounts.get(0).withdraw(500);

    for (BankAccount account : accounts)
    {
      System.out.println("Account Name: " + account.getAccountName());
      System.out.println("Account Number: " + account.getAccountNumber());
      System.out.println("BalanceL " + account.getBalance());
      System.out.println();
    }

    accounts.remove(0);
    System.out.println(accounts.get(0).getAccountName());


//    for (BankAccount account : accounts)
//    {
//      System.out.println("Account Name: " + account.getAccountName());
//      System.out.println("Account Number: " + account.getAccountNumber());
//      System.out.println("BalanceL " + account.getBalance());
//      System.out.println();
//    }
  }
}

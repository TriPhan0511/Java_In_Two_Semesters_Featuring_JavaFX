package com.triphan.bankApp;

import java.util.ArrayList;

public class Tester
{
  public static void main(String[] args)
  {
    ArrayList<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("123", "Alex Ferguson"));
    accounts.add(new BankAccount("456", "Hillary Duff"));
    accounts.add(new BankAccount("678", "Jack Fruit"));

    displayAccounts(accounts);

//    accounts.remove(0);
//    BankAccount account = accounts.get(2);
//    accounts.remove(account);

    BankAccount account = null;
    String name = "Alex Ferguson";
    for (BankAccount item : accounts)
    {
      if (item.getAccountName().equalsIgnoreCase(name))
      {
        account = item;
      }
    }

    if (account != null)
    {
//      System.out.println(account.getAccountName());
      accounts.remove(account);
    }


    System.out.println("\nAfter removing");
    displayAccounts(accounts);
  }

  private static void displayAccounts(ArrayList<BankAccount> accounts)
  {
    for (BankAccount acc : accounts)
    {
      System.out.println();
      System.out.println("Account Number: " + acc.getAccountNumber());
      System.out.println("Account Name: " + acc.getAccountName());
      System.out.println("Balance: " + acc.getBalance());
    }
  }
}

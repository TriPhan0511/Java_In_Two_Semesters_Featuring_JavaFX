package com.triphan.bankApp;

import java.util.ArrayList;

public class Bank
{
  ArrayList<BankAccount> list = new ArrayList<>();

  //  Helper method to find the index of a specified account
  private int search(String accountNumber)
  {
    for (int i = 0; i < list.size(); i++)
    {
      BankAccount tempAccount = list.get(i);
      String tempNumber = tempAccount.getAccountNumber();
      if (tempNumber.equals(accountNumber))
      {
        return i;
      }
    }
    return -999;
  }

//  Returns the total of items
  public int getTotal()
  {
    return list.size();
  }

  //  Returns an account with a particular account number
  public BankAccount getItem(String accountNumber)
  {
    int index = search(accountNumber);
    if (index == -999)
    {
      return null;
    }
    return list.get(index);
  }

  //  Adds an item to the list
  public boolean addItem(String accountNumber, String accountName)
  {
    int index = search(accountNumber);
    if (index != -999)
    {
      return false;
    }
    list.add(new BankAccount(accountNumber, accountName));
    return true;
  }

  //  Deposits money in a specified account
  public boolean depositMoney(String accountName, double amount)
  {
    BankAccount account = getItem(accountName);
    if (account == null)
    {
      return false;
    }
    account.deposit(amount);
    return true;
  }

  //  Withdraws money from a specified account
  public boolean withdrawMoney(String accountNumber, double amount)
  {
    BankAccount account = getItem(accountNumber);
    if (account == null || account.getBalance() < amount)
    {
      return false;
    }
    account.withdraw(amount);
    return true;
  }

  //  Removes an account
  public boolean removeAccount(String accountNumber)
  {
    int index = search(accountNumber);
    if (index == -999)
    {
      return false;
    }
    list.remove(index);
    return true;
  }
}








































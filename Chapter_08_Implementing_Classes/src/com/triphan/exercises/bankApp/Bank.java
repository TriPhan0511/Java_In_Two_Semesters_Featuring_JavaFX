package com.triphan.exercises.bankApp;

import java.util.ArrayList;

public class Bank
{
  private ArrayList<BankAccount> list = new ArrayList<>();

//  Helper method to find the index of a specified account
  private int search(String accountNumber)
  {
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getAccountNumber().equals(accountNumber))
      {
        return i;
      }
    }
    return -999;
  }

//  Returns the total number of items
  public int getTotal()
  {
    return list.size();
  }

  //  Returns an account with a particular number
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
  public boolean addAccount(String accountNumber, String accountName)
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
//  -1: No such account
//  -2: The amount is less than or equal to zero
//  1: Success
  public int depositMoney(String accountNumber, double amount)
  {
    BankAccount account = getItem(accountNumber);
    if (account == null)
    {
      return -1;
    }
    if (amount <= 0)
    {
      return -2;
    }
    account.deposit(amount);
    return 1;
  }

//  Withdraws money from a specified account
//  -1: No such account.
//  -2: Insufficient funds.
//  1: Success.
  public int withdraw(String accountNumber, double amount)
  {
    BankAccount account = getItem(accountNumber);
    if (account == null)
    {
      return -1;
    }
    if (amount > account.getBalance())
    {
      return -2;
    }
    account.withdraw(amount);
    return 1;
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





























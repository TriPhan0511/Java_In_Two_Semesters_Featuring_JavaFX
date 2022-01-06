package com.triphan.bankApp;

import java.util.ArrayList;

public class Bank_1
{
  private ArrayList<BankAccount> list = new ArrayList<>();

  private int search(String accountNumber)
  {
    for (BankAccount item : list)
    {
      if (item.getAccountNumber().equalsIgnoreCase(accountNumber))
      {
        return list.indexOf(item);
      }
    }
    return -999;
  }

  public int getTotal()
  {
    return list.size();
  }

//  public BankAccount getItem(String accountNumber)
//  {
//    int index = search(accountNumber);
//    if (index == -999)
//    {
//      return null;
//    }
//    return list.get(index);
//  }

  public BankAccount getItem(String accountNumber)
  {
    for (BankAccount item : list)
    {
      if (item.getAccountNumber().equalsIgnoreCase(accountNumber))
      {
        return item;
      }
    }
    return null;
  }

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

  public boolean depositMoney(String accountNumber, double amount)
  {
    BankAccount account = getItem(accountNumber);
    if (account == null)
    {
      return false;
    }
    account.deposit(amount);
    return true;
  }

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

//  public boolean withdrawMoney(String accountNumber, double amount)
//  {
//    BankAccount account = getItem(accountNumber);
//    if (account == null)
//    {
//      return false;
//    }
//    account.withdraw(amount);
//    return true;
//  }

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






























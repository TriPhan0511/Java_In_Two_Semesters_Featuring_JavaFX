package com.triphan.bankApp;

import com.triphan.easyScanner.EasyScanner;

import java.util.ArrayList;

public class Bank_0
{
//  The instance attribute
  private ArrayList<BankAccount> accounts;

//  The constructor
  public Bank_0()
  {
    accounts = new ArrayList<>();
  }

//  This method returns the accounts array list
  public ArrayList<BankAccount> getAccounts()
  {
    return accounts;
  }

  //  Adds an account to the bank
  public void addAccount(BankAccount account)
  {
    accounts.add(account);
  }

//  Retrieves an account from the bank
  public BankAccount getAccount(String accountNumber)
  {
    BankAccount account = null;
    for (BankAccount item : accounts)
    {
      if (item.getAccountNumber().equalsIgnoreCase(accountNumber))
      {
        account = item;
      }
    }
    return account;
  }

//  Updates an account's name based on the user input
  public void updateAccountName()
  {
    String accountNumber;
    String newAccountName;
    BankAccount account;

    System.out.print("Enter an account number: ");
    accountNumber = EasyScanner.nextString();
    account = getAccount(accountNumber);
    if (account == null)
    {
      System.out.println("This account number does not exist.");
    }
    else
    {
      System.out.print("Enter a new account name: ");
      newAccountName = EasyScanner.nextString();
      account.setAccountName(newAccountName);
    }
  }

//  Removes an account from the bank
  public void removeAccount(BankAccount account)
  {
    for (BankAccount item : accounts)
    {
      if (item.getAccountNumber().equalsIgnoreCase(account.getAccountNumber()))
      {
        accounts.remove(item);
      }
    }
  }

//  Deposits to an account
  public void depositToAnAccount()
  {
    String accountNumber;
    double amount;
    BankAccount account;

    System.out.print("Enter an account number: ");
    accountNumber = EasyScanner.nextString();
    account = getAccount(accountNumber);
    if (account == null)
    {
      System.out.println("This account number does not exist.");
    }
    else
    {
      do
      {
        System.out.print("Enter an amount: ");
        amount = EasyScanner.nextDouble();
        if (amount <= 0)
        {
          System.out.println("The amount should be greater than zero.");
        }
      } while (amount <= 0);
      account.deposit(amount);
    }
  }

//    Withdraws from an account
  public boolean withdrawFromAnAccount()
  {
    String accountNumber;
    double amount;
    BankAccount account;

    System.out.print("Enter an account number: ");
    accountNumber = EasyScanner.nextString();
    account = getAccount(accountNumber);
    if (account == null)
    {
      System.out.println("This account number does not exist.");
      return false;
    }
    else
    {
      do
      {
        System.out.print("Enter an amount: ");
        amount = EasyScanner.nextDouble();
        if (amount > account.getBalance())
        {
          System.out.println("Inefficient funds. Your current balance is " + account.getBalance());
        }
      } while (amount > account.getBalance());
      account.withdraw(amount);
      return true;
    }
  }

  public void displayBank()
  {
    for (BankAccount item : accounts)
    {
      System.out.println("Account Number: " + item.getAccountNumber());
      System.out.println("Account Name: " + item.getAccountName());
      System.out.println("Balance: " + item.getBalance());
      System.out.println();
    }
  }
}





















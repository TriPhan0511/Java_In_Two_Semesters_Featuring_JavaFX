package com.triphan.exercises;

import java.util.ArrayList;

public class BankAppTester
{
  public static void main(String[] args)
  {
    ArrayList<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("123", "Alex Ferguson"));
    accounts.add(new BankAccount("456", "Hillary Duff"));

//    Gets the account number from the user and deposit to the account has that number
    deposit(accounts);

//    Displays the accounts list
    displayAccounts(accounts);
  }

  private static void deposit(ArrayList<BankAccount> accounts)
  {
    String accountNumberIn;
    double amountIn;
    char keepDepositing;

//    Gets the account number and amount from the user
    do
    {
      System.out.print("\nEnter an account number: ");
      accountNumberIn = EasyScanner.nextString();
      do
      {
        System.out.print("Enter an amount: ");
        amountIn = EasyScanner.nextDouble();
        if (amountIn < 0)
        {
          System.out.println("The amount should be greater than or equal to zero.");
        }
      } while (amountIn < 0);
      deposit(accounts, accountNumberIn, amountIn);
      System.out.print("Do you want to keep depositing (y/n)? ");
      keepDepositing = EasyScanner.nextChar();
    } while (keepDepositing == 'y' || keepDepositing == 'Y');
  }

  private static void deposit(ArrayList<BankAccount> accounts,
                              String accountNumber, double amount)
  {
    BankAccount foundAccount = null;
    for (BankAccount item : accounts)
    {
      if (item.getAccountNumber().equals(accountNumber))
      {
        foundAccount = item;
        break;
      }
    }
    if (foundAccount == null)
    {
      System.out.println("\nNo account with number " + accountNumber);
    }
    else
    {
      foundAccount.deposit(amount);
      System.out.println("\nThe account with number " + accountNumber + " was deposit.");
    }
  }

  private static void displayAccounts(ArrayList<BankAccount> accounts)
  {
    for (BankAccount item : accounts)
    {
      System.out.println("\nAccount Number: " + item.getAccountNumber());
      System.out.println("Account Name: " + item.getAccountName());
      System.out.println("Balance: " + item.getBalance());
    }
  }
}























